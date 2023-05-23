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
<h1>Стараница получателя</h1>
<h3>Список отправлений</h3>
    <#list Tracks as Track>
    <div>
        <p><b>${Track.title}</b>| <a href="/RecipientMainPage/${Track.id}"> Подробнее....</a></p>
    </div>
<#else>
<p>Ничего нету из заказов</p>
    </#list>
</form>
<hr>
<form action="/">
    <button><h3>Вернуться обратно</h3></button>
</form>
</body>
</html>