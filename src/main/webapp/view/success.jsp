<%@ page language="java" contentType="text/html;charset=UTF-8"

         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0"/>

    <meta name="renderer" content="webkit">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生展示页面</title>


</head>

<body>
<!--后台model中的值，前台可以直接获取，不需要通过sessionScope或者requestScope来获取-->
学生：${student.stuname}
学号：${student.stuid}
</body>

</html>
