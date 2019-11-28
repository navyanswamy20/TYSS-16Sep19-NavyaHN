<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password Page</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<form action="changepassword" method="post">
<a href="./home" style="align-left:20px">home</a>
<a href="./logout" style="align-right: 30px">Logout</a><br><br>
<h4><%=msg %></h4>
New:<input type="password" name="password"><br><br>
Confirm:<input type="password" name="confirmpassword"><br><br>
<input type="submit" name="change" value="change">
<input type="reset"  value="Reset">
</form>
</body>
</html>