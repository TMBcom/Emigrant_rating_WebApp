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
<h1>Страница отправителя</h1>
<h3>Создать отправление</h3>
<form action="/SenderMain/create" method="post">
    Название отправления: <input type="text", name="title"><br><br>
    Описание отправления: <input type="text", name="description"><br><br>
    Город отправителя: <input type="text", name="citySender"><br><br>
    Город получателя: <input type="text", name="cityRecipient"><br><br>
    Имя автора: <input type="text", name="author"><br><br>
    Дата  отправки: <input type="number", name="dateOfDispatch"><br><br>
    <input type="submit" value="Добавить отправку"/>
</form>
<hr>
<form action="/">
    <button><h3>Вернуться обратно</h3></button>
</form>
</body>
</html>