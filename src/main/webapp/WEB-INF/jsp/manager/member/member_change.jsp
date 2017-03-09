<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="CSS/style.css" type="text/css" rel="stylesheet">
<title>member change</title>
</head>
<script language="javascript">
	function check() {
		if (form1.name.value == "") {
			alert("请输入名字");
			form1.name.focus();
			return false;
		}
		if (form1.password.value == "") {
			alert("密码不能为空");
			form1.password.focus();
			return false;
		}
		if (form1.repassword.value == "") {
			alert("确认密码不能为空");
			form1.repassword.focus();
			return false;
		}
		if (form1.password.value != form1.repassword.value) {
			alert("你输入的两次密码不一致");
			return false;
		}
		if (form1.email.value == "") {
			alert("Email地址不能为空");
			form1.email.focus();
			return false;
		}

		if (form1.phone.value == "") {
			alert("请输入你的联系电话");
			form1.phone.focus();
			return false;
		}
		if (form1.question.value == "") {
			alert("输入密码提示问题便于取回密码");
			form1.question.focus;
			return false;
		}
		if (form1.result.value == "") {
			alert("请输入回答问题的答案");
			form1.result.focus();
			return false;
		}
	}
</script>
<body>
	<center>
		<form method="POST" action="memberChangeConfig" name="form1">
		<%
			Customer customerE = (Customer) session.getAttribute("customerE");
			if (customerE != null) {
		%>
			<table width="100%" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="80" align="center" background="image/1.jpg">

						<table height="80" border="0" cellpadding="0" cellspacing="0"
							background="image/2.jpg">
							<tr>
								<td width="787"><object
										classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
										codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0"
										width="100%" height="75">
										<param name="movie" value="top.swf" />
										<param name="quality" value="high" />
										<param name="wmode" value="transparent" />
										<embed src="image/top.swf" width="100%" height="75"
											quality="high"
											pluginspage="http://www.macromedia.com/go/getflashplayer"
											type="application/x-shockwave-flash" wmode="transparent"></embed>
									</object></td>
							</tr>
						</table>

					</td>
				</tr>
			</table>

			<table width="100%" height="42" border="0" cellpadding="0"
				cellspacing="0" background="image/20.jpg">
				<tr>
					<td valign="bottom"><table width="100" border="0"
							align="center" cellpadding="0" cellspacing="0">
							<tr>
								<td><img src="image/21.jpg" width="791" height="35"></td>
							</tr>
						</table></td>
				</tr>
			</table>
			<table width="791" border="0" cellpadding="0" cellspacing="0"
				background="image/22.jpg">
				<tr>
					<td height="63"><div align="center">
							<p>
								<b>会员修改</b>
							</p>
						</div></td>
				</tr>
			</table>
			<table width="40%" height="205" border="0" cellpadding="0"
				cellspacing="0" background="image/23.jpg" border="bold">
				<tr>
					<td width="46%" align="left" height="27"><div align="left">名字：</div></td>
					<td width="54%" align="left"><input type="text" name="name"
						size="20" value="<%=customerE.getName()%>"></td>
				</tr>
				<tr>
					<td width="46%" height="27">
						<div align="left">密码：</div>
					</td>
					<td width="54%"><input type="password" name="password"
						size="20"></td>
				</tr>
				<tr>
					<td width="46%" height="27">
						<div align="left">确认密码：</div>
					</td>
					<td width="54%"><input name="repassword" type="password"
						size="20" maxlength="16"></td>
				</tr>
				<tr>
					<td width="46%" height="27">
						<div align="left">Email：</div>
					</td>
					<td width="54%"><input name="email" type="text" size="20"
						maxlength="16" value="<%=customerE.getEmail()%>"></td>
				</tr>
				<tr>
					<td width="46%" height="27">
						<div align="left">性别：</div>
					</td>
					<td width="54%">&nbsp; 男 <input type="radio" value="man"
						checked name="sex"> &nbsp; 女 <input type="radio"
						name="sex" value="woman"></td>
				</tr>
				<tr>
					<td width="46%" height="27">
						<div align="left">电话：</div>
					</td>
					<td width="54%"><input type="text" name="phone" size="20" value="<%=customerE.getPhone()%>"></td>
				</tr>

				<tr>
					<td width="46%" height="27">
						<div align="left">找回密码问题：</div>
					</td>
					<td width="54%"><input type="text" name="question" size="20" value="<%=customerE.getQuestion()%>"></td>
				</tr>
				<tr>
					<td width="46%" height="27"><div align="left">问题答案：</div></td>
					<td width="54%"><input type="text" name="result" size="20" value="<%=customerE.getResult()%>"></td>
				</tr>
				<tr>
					<td width="46%" height="27"><div align="left">ID</div></td>
					<td width="54%"><%=customerE.getId()%><input type="hidden" name="id"
							value="<%=customerE.getId()%>">
							<input type="hidden" name="pow"
							value="<%=customerE.getPow()%>"><input type="hidden" name="issuedate"
							value="<%=customerE.getIssuedate()%>"></td>
				</tr>
				<tr>
					<td height="16" colspan="2">
						<div align="center">
							<input type="submit" value="修改" name="Submit"
								onClick="return check()"> <input type="reset" value="重置">
							&nbsp;&nbsp;<a href="memberShow">返回</a>
						</div>
					</td>
				</tr>
			</table>
			<%}%>
	</center>
</body>
</html>