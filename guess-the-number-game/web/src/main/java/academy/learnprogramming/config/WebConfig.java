package academy.learnprogramming.config;

import academy.learnprogramming.interceptor.RequestInterceptor;
import academy.learnprogramming.util.GameMappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {
        return new SessionLocaleResolver();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // simple automated pre-compiled controller as default homepage request method
        registry.addViewController(GameMappings.HOME).setViewName(ViewNames.HOME); // added here to not create a distinct request method in the controller class
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()); // adding an interceptor to the interceptor registry

        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor(); // locale interceptor
        localeChangeInterceptor.setParamName("lang"); // the parameter name to request it in a browser - ?lang=en or ?lang=pl
        registry.addInterceptor(localeChangeInterceptor);
    }
}
