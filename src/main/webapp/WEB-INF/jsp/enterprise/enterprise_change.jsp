<%@ page contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>car_change page</title>
</head>
<Script language="javascript">
	function check() {
		if (form1.eSort.value == "") {
			alert("请填写企业类型！！");
			form1.eSort.focus();
			return false;
		}
		if (form1.eName.value == "") {
			alert("请填写企业名称！！！");
			form1.eName.focus();
			return false;
		}
		if (form1.eOperation.value == "") {
			alert("请填写经营范围！！！");
			form1.eOperation.focus();
			return false;
		}
		if (form1.eWrokArea.value == "") {
			alert("请填写所属区域！！！");
			form1.eWrokArea.focus();
			return false;
		}
		if (form1.eAddress.value == "") {
			alert("请填写企业地址！！！");
			form1.eAddress.focus();
			return false;
		}
		if (form1.ePhone.value == "") {
			alert("请填写联系电话！！！");
			form1.ePhone.focus();
			return false;
		}
		if (form1.eLinkMan.value == "") {
			alert("请填写联系人！！！");
			form1.eLinkMan.focus();
			return false;
		}
		if (form1.eHandset.value == "") {
			alert("请填写手机号！！！");
			form1.eHandset.focus();
			return false;
		}
		if (form1.eFax.value == "") {
			alert("请填写传真号！！！");
			form1.eFax.focus();
			return false;
		}
		if (form1.eEmail.value == "") {
			alert("请填写电子邮箱！！！");
			form1.eEmail.focus();
			return false;
		}
		if (form1.eHttp.value == "") {
			alert("请填写企业网址！！！");
			form1.eHttp.focus();
			return false;
		}
		if (form1.eIntro.value == "") {
			alert("请填写类型介绍！！！");
			form1.eIntro.focus();
			return false;
		}
	}
</Script>

<body bgcolor="#ffffff">
	<%
   		Customer customer = (Customer) session.getAttribute("customer");
		if (customer != null && "2".equals(customer.getPow())) {
	%>
	<jsp:include page="../manager/mtop.jsp" flush="true"></jsp:include>
	<%
		}else {
	%>
	<jsp:include page="../top.jsp" flush="true"></jsp:include>
	<%
	}
	%>
	<p align="center">
		<b>企业信息修改</b>
	</p>
	<form method="POST" action="enterpriseChangeConfig" name="form1">
		<%
			Enterprise enterprise = (Enterprise) session.getAttribute("enterprise");
			if (enterprise != null) {
		%>
		<table width="786" border="1" align="center" cellpadding="0"
			cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
			bordercolorlight="#FFFFFF">
			<tr>
				<td width="20%" height="43">
					<p align="center">企业类型：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="eSort"
							value=" <%=enterprise.getEnterprisesort()%>" size="20">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">企业名称：</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="eName" size="20"
							value="<%=enterprise.getEnterprisename()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="42">
					<p align="center">经营范围：</p>
				</td>
				<td width="36%" height="42">
					<p align="left">
						<input type="text" name="eOperation" size="20"
							value="<%=enterprise.getOperation()%>">
					</p>
				</td>
				<td width="18%" height="42">
					<p align="center">所属区域：</p>
				</td>
				<td width="30%" height="42">
					<p align="left">
						<input type="text" name="eWorkArea" size="20"
							value=" <%=enterprise.getWorkarea()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="43">
					<p align="center">企业地址：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="eAddress" size="20"
							value="<%=enterprise.getAddress()%>">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">联系电话：</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="ePhone" size="20"
							value="<%=enterprise.getPhone()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="46">
					<p align="center">联系人：</p>
				</td>
				<td width="36%" height="46">
					<p align=left>
						<input type="text" name="eLinkMan" size="20"
							value="<%=enterprise.getLinkman()%>">
					</p>
				</td>
				<td width="18%" height="46">
					<p align="center">手机号：</p>
				</td>
				<td width="30%" height="46">
					<p align="left">
						<input type="text" name="eHandset" size="20"
							value="<%=enterprise.getHandset()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="45">
					<p align="center">传真号：</p>

				</td>
				<td width="36%" height="45">
					<p align="left">
						<input type="text" name="eFax" size="20"
							value="<%=enterprise.getFax()%>">
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">电子邮箱：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="eEmail" size="20"
							value="<%=enterprise.getEmail()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="45">
					<p align="center">企业网址：</p>
				</td>
				<td width="36%" height="45">
					<p align="left">
						<input type="text" name="eHttp" size="20"
							value="<%=enterprise.getHttp()%>">
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">类型介绍：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="eIntro" size="20"
							value="<%=enterprise.getIntro()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="40" c>
					<p align="center">发布时间：
				</td>
				<td width="36%" height="40"><input type="text"
					name="eIssuedate" size="20" value="<%=enterprise.getIssuedate()%>"></td>
				<td width="20%" height="33">
					<p align="center">发布人：
				</td>
				<td width="36%" height="33">
					<p align="center">
						<%=enterprise.getUsername()%>
				</td>
				<td width="36%" height="33">
					<p align="center">ID
				</td>
				<td width="36%" height="33">
					<p align="center"><%=enterprise.getId()%><input type="hidden"
							name="id" value="<%=enterprise.getId()%>">
					</p>
				</td>


			</tr>
			<tr>
				<td width="786" height="40" colspan="4">
					<p align="center">
						<input type="submit" name="change" value="修改"
							onClick="return check()"> <input type="reset" value="重置">
				</td>
			</tr>
		</table>
		<%
			}
		%>
	</form>
</body>