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
<h2>Подробная информация об отправлении</h2> <h1>${Track.title}</h1><hr>
<b>Описание отправления: </b>${Track.description}<br>
<b>Город    отправителя: </b>${Track.citySender}<br>
<b>Город    получателя: </b>${Track.cityRecipient}<br>
<b>Автор   отправления: </b>${Track.author}<br>
<b>Дата  отправки: </b> ${Track.dateOfDispatch}<br>
<hr>
<h3>Изменить информацию о заказе</h3>
<form action="/RecipientMain/update/${Track.id}" method="post">
    Название отправления: <input type="text", name="title"><br><br>
    Описание отправления: <input type="text", name="description"><br><br>
    Город отправителя: <input type="text", name="citySender"><br><br>
    Город получателя: <input type="text", name="cityRecipient"><br><br>
    Имя автора: <input type="text", name="author"><br><br>
    Дата  отправки: <input type="date", name="dateOfDispatch"><br><br>
    <input type="submit" value="Изменить информацию"/>
</form>
<hr>
<h3>Удалить заказ</h3>
<form action="/RecipientMain/delete/${Track.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
<hr>
<form action="/RecipientMain">
    <button><h3>Вернуться обратно</h3></button>
</form>
</body>
</html>