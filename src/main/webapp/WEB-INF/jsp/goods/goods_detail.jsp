<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="CSS/style.css">
<title>Goods_xiangxi page</title>
</head>
<%!String sql;
	String code, userName;
	String username, login;
	int num;%>

<body bgcolor="#ffffff">
	<%
		login = (String) session.getAttribute("login");
		Customer customer = (Customer) session.getAttribute("customer");
		username = customer.getName();
		if (customer == null || username == null || login == null) {
	%>
	<script language="javascript">
		alert("����δ��¼�����������ϸ��Ϣ������");
	<%response.sendRedirect("login");%>
		
	</script>
	<%
		}
	%>
	<jsp:include page="../top.jsp" />
	<table width="785" height="480" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td width="100%" height="52" colspan="4" align="center">������ϸ��Ϣ</td>
		</tr>
		<%
			GoodsMsg goodsMsg = (GoodsMsg) session.getAttribute("goodsMsg");
			if (goodsMsg != null) {
		%>
		<tr>
			<td width="17%" height="29" align="center">�������ͣ�</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getGoodsstyle()%></td>
			<td width="17%" height="29" align="center" valign="middle">�������ƣ�</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getGoodsname()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">����������</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getGoodsnumber()%>
			</td>
			<td width="17%" height="29" align="center" valign="middle">������λ��</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getGoodsunit()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">��ʼʡ�ݣ�</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getStartprovince()%></td>
			<td width="17%" height="29" align="center" valign="middle">��ʼ���У�</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getStartcity()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">�ִ�ʡ�ݣ�</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getEndprovince()%></td>
			<td width="17%" height="29" align="center" valign="middle">�ִ���У�</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getEndcity()%></td>
		</tr>
		<tr>
			<td width="17%" height="30" align="center">�������ͣ�</td>
			<td width="36%" height="30" align="center"><%=goodsMsg.getStyle()%></td>
			<td width="17%" height="30" align="center" valign="middle">����ʱ�䣺</td>
			<td width="30%" height="30" align="center"><%=goodsMsg.getTransporttime()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">��ϵ�绰��</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getPhone()%></td>
			<td width="17%" height="29" align="center" valign="middle">��ϵ�ˣ�</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getLink()%>
			</td>
		</tr>
		<tr>
			<td width="17%" height="31" align="center">����ʱ�䣺</td>
			<td width="36%" height="31" align="left" colspan="3"><%=goodsMsg.getIssuedate()%></td>

		</tr>
		<tr>
			<td width="17%" height="1" align="center">��ע��</td>
			<td width="83%" height="1" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=goodsMsg.getRemark()%></textarea>
			</td>
		</tr>
		<tr>
			<td width="17%" height="52" align="center">����Ҫ��</td>
			<td width="83%" height="52" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=goodsMsg.getRequest()%></textarea>
			</td>
		</tr>
		<tr>
			<%
				userName = goodsMsg.getUsername();
			%>
			<td width="17%" height="31" align="center">�����ˣ�</td>
			<td width="36%" height="31" align="left" colspan="3"><%=userName%></td>

		</tr>
		<%
			if (userName.equals(username)) {
		%>
		<tr>
			<td width="100%" height="45" colspan="4" align="center"><a
				href="goodsChange?id=<%=goodsMsg.getId()%>">�޸�</a>&nbsp;&nbsp; <a
				href="goodsDelete?id=<%=goodsMsg.getId()%>">ɾ��</a></td>
		</tr>

		<%
			}
			}
		%>
	</table>
</body>
</html>
