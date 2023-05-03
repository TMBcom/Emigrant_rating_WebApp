<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
Hello, my name is Conmiro
<h1>BUY</h1><hr>

    <#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб| <a href="/product/${product.id}"> Подробнее....</a></p>
    </div>
</#list>

<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text", name="title"><br><br>
    Цена: <input type="number", name="price"><br><br>
    Описание: <input type="text", name="description"><br><br>
    Город: <input type="text", name="city"><br><br>
    Имя автора: <input type="text", name="author"><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>