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
		if (form1.cLicenseNumber.value == "") {
			alert("请填写车牌号码！！");
			form1.cLicenseNumber.focus();
			return false;
		}
		if (form1.cStyle.value == "") {
			alert("请填写车辆类型！！！");
			form1.cStyle.focus();
			return false;
		}
		if (form1.cBrand.value == "") {
			alert("请填写车辆品名！！！");
			form1.cBrand.focus();
			return false;
		}
		if (form1.cCarLoad.value == "") {
			alert("请填写车辆限量！！！");
			form1.cCarLoad.focus();
			return false;
		}
		if (form1.cUsedTime.value == "") {
			alert("请填写已使用年限！！！");
			form1.cUsedTime.focus();
			return false;
		}
		if (form1.cTransportStyle.value == "") {
			alert("请选择运输类型！！！");
			form1.cTransportStyle.focus();
			return false;
		}
		if (form1.cDriverName.value == "") {
			alert("请填写驾驶员姓名！！！");
			form1.cDriverName.focus();
			return false;
		}
		if (form1.cLicenseNum.value == "") {
			alert("请填写驾驶证号码！！！");
			form1.cLicenseNum.focus();
			return false;
		}
		if (form1.cDriverTime.value == "") {
			alert("请填写驾驶员驾龄！！！");
			form1.cDriverTime.focus();
			return false;
		}
		if (form1.cLicenseStyle.value == "") {
			alert("请填写驾驶类型！！！");
			form1.cLicenseStyle.focus();
			return false;
		}
		if (form1.cLinkMan.value == "") {
			alert("请填写联系人！！！");
			form1.cLinkMan.focus();
			return false;
		}
		if (form1.cLinkPhone.value == "") {
			alert("请填写联系电话！！！");
			form1.cLinkPhone.focus();
			return false;
		}
		if (form1.cRemark.value == "") {
			alert("请填写备注！！！");
			form1.cRemark.focus();
			return false;
		}
	}
</Script>

<body bgcolor="#ffffff"><jsp:include page="../top.jsp" />
	<p align="center">
		<b>货物信息修改</b>
	</p>
	<form method="POST" action="carChangeConfig" name="form1">
		<%
			CarMessage carMessage = (CarMessage) session.getAttribute("carMessage");
			if (carMessage != null) {
		%>
		<table width="786" border="1" align="center" cellpadding="0"
			cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
			bordercolorlight="#FFFFFF">
			<tr>
				<td width="20%" height="43">
					<p align="center">车牌号：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cLicenseNum"
							value=" <%=carMessage.getLicencenumber()%>" size="20">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">车品名：</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="cBrand" size="20"
							value="<%=carMessage.getBrand()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="42">
					<p align="center">车辆类型：</p>
				</td>
				<td width="36%" height="42">
					<p align="left">
						<input type="text" name="cStyle" size="20"
							value="<%=carMessage.getStyle()%>">
					</p>
				</td>
				<td width="18%" height="42">
					<p align="center">载重：</p>
				</td>
				<td width="30%" height="42">
					<p align="left">
						<input type="text" name="cCarLoad" size="20"
							value=" <%=carMessage.getCarload()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="43">
					<p align="center">使用时间：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cUsedTime" size="20"
							value="<%=carMessage.getUsedtime()%>">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">驾驶员姓名：</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="cDriverName" size="20"
							value="<%=carMessage.getDrivername()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="46">
					<p align="center">驾龄：</p>
				</td>
				<td width="36%" height="46">
					<p align=left>
						<input type="text" name="cDriverTime" size="20"
							value="<%=carMessage.getDrivertime()%>">
					</p>
				</td>
				<td width="18%" height="46">
					<p align="center">驾驶证号码：</p>
				</td>
				<td width="30%" height="46">
					<p align="left">
						<input type="text" name="cLicenseNum" size="20"
							value="<%=carMessage.getLicencenumber()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="45">
					<p align="center">驾驶证类型：</p>
				</td>
				<td width="36%" height="45">
					<p align="left">
						 <select size="1" name="cLicenseStyle">
							<option value="A" selected>A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">运输类型：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cTransportStyle" size="20"
							value="<%=carMessage.getTransportstyle()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="45">
					<p align="center">联系人></p>
				</td>
				<td width="36%" height="45">
					<p align="left">
						<input type="text" name="cLinkMan" size="20"
							value="<%=carMessage.getLinkman()%>">
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">联系电话：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cLinkPhone" size="20"
							value="<%=carMessage.getLinkphone()%>">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="40" c>
					<p align="center">发布时间：
				</td>
				<td width="36%" height="40" colspan="3"><input type="text"
					name="dd" size="20" value="<%=carMessage.getIssuedate()%>"></td>
			</tr>
			<tr>
				<td width="20%" height="78">
					<p align="center">备注：</p>
				</td>
				<td width="84%" height="78" colspan="3">
					<p align="left">
						<textarea rows="5" name="cRemark" cols="80"><%=carMessage.getRemark()%></textarea>
					</p>
				</td>
			</tr>
			
			<tr>
				<td width="20%" height="33">
					<p align="center">发布人：
				</td>
				<td width="36%" height="33">
					<p align="center">
						<%=carMessage.getUserdate()%>
				</td>
				<td width="20%" height="33">
					<p align="center">ID
				</td>
				<td width="20%" height="33">
					<p align="center"><%=carMessage.getCode()%><input type="hidden"
							name="code" value="<%=carMessage.getCode()%>">
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