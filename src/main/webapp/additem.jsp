<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Item</title>
</head>
<body>
	<form action="createitem" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="iname"></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><input type="number" name="qty"></td>
			</tr>
			<tr>
				<td>Discount:</td>
				<td><input type="text" name="discount"></td>
			</tr>
			<tr>
				<td>Image:</td>
				<td><input type="file" name="image"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>