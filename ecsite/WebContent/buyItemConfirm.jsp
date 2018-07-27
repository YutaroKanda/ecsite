<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>購入確認画面</title>
<style type="text/css">
/*==========TAG LAYOUT==========*/
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-size:12px;
		color:#333;
		background:#fff;
	}
	table{
		text-align:center;
		margin:0 auto;
	}
/*==========ID LAYOUT===========*/
	#header{
		width:100%;
		height:80px;
		background:black;
	}
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	#main{
		width:100%;
		height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		background:black;
		clear:both
	}
	#text-link{
		display:inline-block;
		text-align:right;
	}
</style>
<script type="text/javascript">
	function submitAction(url){
		$('form').attr('action',url);
		$('form').submit();
	}
</script>
</head>
<body>
<div id="header">
	<div id="pr"></div>
</div>
<div id="main">
	<div id="top"><p>Buy Item Confirm</p></div>
	<div>
	<p>inputタグの使用</p>
	<table>
	<s:form>
		<tr>
			<td>商品名</td>
			<td><s:property value="session.buyItem_name" escape="false"/></td>
		</tr>
		<tr>
			<td>値段</td>
			<td><s:property value="session.buyItem_cost" escape="false"/></td>
		</tr>
		<tr>
			<td>購入個数</td>
			<td><s:property value="session.count" escape="false"/></td>
		</tr>
		<tr>
			<td>金額</td>
			<td><s:property value="session.buyItem_price" escape="false"/></td>
		</tr>
		<tr>
			<td>お支払い方法</td>
			<td><s:property value="session.payment" escape="false"/></td>
		</tr>
		<tr>
			<td><input type="button" value="戻る" onclick="submitAction('HomeAction')"/></td>
			<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')"/></td>
		</tr>

	</s:form>
	</table>


	<div id="text-link"></div>
	</div>
</div>
<div id="footer">
	<div id="pr"></div>
</div>
</body>
</html>