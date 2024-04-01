<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>User Input Form</title>
    <style>
        .expression-output {
            color: blue; /* Change color as desired */
        }
    </style>
</head>
<body>

    <%-- Format tag--%>
    <h4>My Number:
        <span class="expression-output">
            <c:out value="${param.number}"/>
        </span>
    </h4>
    <fmt:setLocale value="fr"/>
    <h4>In French:<br>
        Formatted Number:
        <span class="expression-output">
            <fmt:formatNumber type="number" value="${param.number}"/>
        </span>
    </h4>
    <h4>Default Pattern:
        <span class="expression-output">
            <fmt:formatNumber type="currency" value="${param.number}"/>
        </span>
    </h4>
    <h4>Using Pattern(0,00,00.0000):
        <span class="expression-output">
            <fmt:formatNumber type="currency" value="${param.number}" pattern="00,0,00.0000"/>
        </span>
    </h4>

    <%-- Date formatting--%>
    <h4>Current Date:
        <span class="expression-output">
            <c:set var="currentDate" value="<%= new java.util.Date() %>"/>
            <c:out value="${currentDate}"/>
        </span>
    </h4>

    <h4>Formatted Date:
        <span class="expression-output">
            <fmt:formatDate pattern="yyyy-dd-MM" value="${currentDate}" />
        </span>
    </h4>

    <h4>Received Date:
        <span class="expression-output">
            <c:out value="${param.dob}"/>
        </span>
    </h4>
    <h4>Formatted DOB:
        <span class="expression-output">
            <fmt:parseDate var="parsedDate" value="${param.dob}" pattern="yyyy-MM-dd" />
            <fmt:formatDate value="${parsedDate}" pattern="dd-MM-yyyy" />
        </span>
    </h4>

</body>
</html>
