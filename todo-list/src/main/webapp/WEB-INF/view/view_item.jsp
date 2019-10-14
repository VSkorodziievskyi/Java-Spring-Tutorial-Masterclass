<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View Item</title>
</head>
<body>
<div align="center">
        <table border="1" cellpadding="5">

            <tr>
                <th>Title</th>
                <th>Deadline</th>
                <th>Details</th>
            </tr>

            <tr>
                <td><c:out value="${todoItem.title}"/></td>
                <td><c:out value="${todoItem.deadline}"/></td>
                <td><c:out value="${todoItem.details}"/></td>
            </tr>

            <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
            <h2><a href="${itemsLink}">Show All Todo Items</a></h2>
        </table>
</div>
</body>
</html>
