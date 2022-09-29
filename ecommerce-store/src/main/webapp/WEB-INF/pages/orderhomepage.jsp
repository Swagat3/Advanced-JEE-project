<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Home Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center;">Order Home Page</h1>
<button onclick="window.location.href='/list/orders'" class="btn btn-primary">Get All orders</button>
<button onclick="window.location.href='/list/user'" class="btn btn-primary">Get user orders</button>
<button onclick="window.location.href='/orderId'" class="btn btn-primary">Get order by id</button>
<button onclick="window.location.href=''" class="btn btn-primary">Create new order</button>
<button onclick="window.location.href=''" class="btn btn-primary">Update existing order</button>
</body>
</html>

