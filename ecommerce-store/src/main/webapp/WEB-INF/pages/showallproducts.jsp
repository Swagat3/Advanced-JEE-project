<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
<style type="text/css">
table, tr, td, th {
	border: 2px solid yellow;
	margin-left: auto;
	margin-right: auto;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Inventory</th>
					<th>Product Company Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="eachPlan">
					<tr>
						<td>${eachPlan.productId}</td>
						<td>${eachPlan.productName}</td>
						<td>${eachPlan.productInventory}</td>
						<td>${eachPlan.productCompanyName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>