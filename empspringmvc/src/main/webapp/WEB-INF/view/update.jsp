<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
		 <a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend>Update Profile</legend>
		
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>

				<tr>
					<td>Gender:</td>
					<td><select name="gender" required="required">
							<option>-----Select----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>

				<tr>
					
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>

		</form>

	</fieldset></html>