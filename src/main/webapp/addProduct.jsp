<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>保存商品</title>
</head>
<body>
<h1>保存商品的页面</h1>
<s:form action="product_save" method="get">
	<table>
		<tr>
			<td>商品名称</td>
			<td><input type="text" name="pname"/> </td>
		</tr>
		<tr>
			<td>商品价格</td>
			<td><input type="text" name="price"/> </td>
		</tr>
		<tr>
			<td><input type="submit" value="添加"></td>
		</tr>
	</table>
</s:form>
</body>
</html>