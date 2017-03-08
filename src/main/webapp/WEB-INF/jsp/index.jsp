<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.sql.*"%>

<html>
<head></head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="CSS/style.css">
<title></title>
<Script language="javascript">
	function check1() {
		if (form_u.name.value == "") {
			alert("请添入用户名");
			form_u.name.focus();
			return false;
		}
		if (form_u.password.value == "") {
			alert("请添入密码");
			form_u.password.focus();
			return false;
		}
	}
</Script>

<body link="#669900" alink="#FFCC66" vlink="#FF3300">

	<jsp:include page="top.jsp" flush="true" />

	<table width="786" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="202" height="255" valign="top" background="image/8.jpg">

				<jsp:include page="left.jsp" /></td>
			<td width="484" valign="top"><table width="100" border="0"
					cellpadding="0" cellspacing="0">
					<tr>
						<td><img src="image/13.jpg" width="370" height="39"></td>
					</tr>
				</table>
				<table width="370" border="0" cellpadding="0" cellspacing="0"
					background="image/14.jpg">
					<tr>
						<td valign="top"><jsp:include page="goods/indexShow.jsp" /></td>
					</tr>
				</table>
				<table width="100" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td><img src="image/16.jpg" width="370" height="23"></td>
					</tr>
				</table>
				<table width="370" border="0" cellpadding="0" cellspacing="0"
					background="image/17.jpg">

					<tr>
						<td valign="top"><jsp:include page="car/indexShow.jsp" /></td>
					</tr>
				</table>
				<table width="100" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td><img src="image/18.jpg" width="370" height="29"></td>
					</tr>
				</table>
				<table width="370" border="0" cellpadding="0" cellspacing="0"
					background="image/19.jpg">
					<tr>
						<td valign="top"><jsp:include page="enterprise/indexShow.jsp" /></td>
					</tr>
				</table></td>
			<!--存放中间的代码-->
			<td valign="top" width="215" background="image/12.jpg"><jsp:include
					page="right.jsp" flush="true" /></td>
		</tr>
	</table>

	<jsp:include page="down.jsp" flush="true" />

</body>

</html>
