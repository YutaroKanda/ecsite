<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
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
/*========== ID LAYOUT==========*/
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
<title>UserCreateComplete画面</title>
</head>
<body>
<div id="header">
	<div id="pr"></div>
</div>
<div id="main">
<div id="top">
	<p>UserCreateComplete</p>
</div>
<div>
	<h3>新規ユーザー登録が完了いたしました．</h3>
	<div>
	<a href='<s:url action="HomeAction"/>'>ログインへ</a>
	</div>
</div>
</div>
<div id="footer">
	<div id="pr"></div>
</div>
</body>
</html>