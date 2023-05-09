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
<h3>Удалить товар</h3>
<form action="/RecipientMain/delete/${Track.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
<hr>
<form action="/RecipientMain">
    <button><h3>Вернуться обратно</h3></button>
</form>
</body>
</html>