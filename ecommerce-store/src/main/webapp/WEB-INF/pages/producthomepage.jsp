<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Home Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center;">Product Home Page</h1>
<button onclick="window.location.href='/show/products'" class="btn btn-primary">List of Products</button>
<button onclick="window.location.href='/show/productCompanyName'" class="btn btn-primary">List of Products by CompanyName</button>
<button onclick="window.location.href='/save'" class="btn btn-primary">Create new product</button>
<button onclick="window.location.href='/update'" class="btn btn-primary">Update existing product</button>
<button onclick="window.location.href='/show/available'" class="btn btn-primary">Products with inventory > 0</button>
<button onclick="window.location.href='/show/not-available'" class="btn btn-primary">Products with inventory = 0</button>
</body>
</html>