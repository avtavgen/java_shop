<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
    <script src="/resources/js/controllers.js"></script>
    <title>Product</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Products</h1>
        </div>
    </div>
</section>
<section class="container" ng-app="cartApp">
    <div class="row">
        <div class="col-md-5">
            <img src="<c:url value="/img/${product.productId}.png"></c:url>" alt="image" style = "width:100%"/>
        </div>
        <div class="col-md-5">
            <h3>${product.name}</h3>
            <p>${product.description}</p>
            <p>
                <strong>Item Code : </strong><span class="label label-warning">${product.productId}</span>
            </p>
            <p>
                <strong>manufacturer</strong> :${product.manufacturer}
            </p>
            <p>
                <strong>category</strong> :${product.category}
            </p>
            <p>
                <strong>Availble units in stock </strong> :${product.unitsInStock}
            </p>
            <h4>${product.unitPrice} EUR</h4>
            <a href="<spring:url value="/market/products" />" class="btn btn-default">
                <span class="glyphicon-hand-left glyphicon"></span> back
            </a>
            <br>
            <p ng-controller="cartCtrl">
                <a href="#" class="btn btn-warning btn-large" ng-click="addToCart('${product.productId}')">
                    <span class="glyphicon-shopping-cart glyphicon"></span> Order Now
                </a>
            </p>
            <a href="<spring:url value="/cart" />" class="btn btn-default">
                <span class="glyphicon-hand-right glyphicon"></span> View Cart
            </a>
        </div>
    </div>
</section>
</body>
</html>