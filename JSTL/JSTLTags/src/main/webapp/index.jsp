<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        h2 {
            color: #333;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: #666;
        }

        input[type="text"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Hello World!</h2>

    <c:set var="userName" value="Shivam" />
    Welcome, <c:out value="${userName}" /><br>

    <c:remove var="userName" />
    <c:out value="Remove value is ${userName}" /><br>

    <c:if test="${empty userName}">
        <p>Variable 'userName' is no longer defined.</p>
    </c:if>

    <c:forEach var="number" begin="1" end="5">
        <p>Number: <c:out value="${number}" /></p>
    </c:forEach>

    <c:choose>
        <c:when test="${1 > 2}">
            <p>1 is greater than 2</p>
        </c:when>
        <c:otherwise>
            <p>1 is not greater than 2</p>
        </c:otherwise>
    </c:choose>

    <h3 style="text-align: center;">Input for Format tag</h3>
    <form action="format.jsp" method="post">
        <label for="number">Number:</label>
        <input type="number" id="number" name="number" required><br><br>

        <label for="date">Date:</label>
        <input type="date" id="dob" name="dob" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
