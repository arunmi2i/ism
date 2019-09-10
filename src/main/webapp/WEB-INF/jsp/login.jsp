<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Custom Login Page</title>
</head>
<body>
    <form method="get" action="/createUser">
    	<button class="button">Add User</button>
    </form>

	<form name="loginForm" action="<c:url value="j_spring_security_check"/>" "method="post">
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Login" /></td>
				<td><input name="reset" type="reset" />
			</tr>
		</table>
	</form>
</body>
</html>	