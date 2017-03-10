<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="CSS/style.css">
<title>Car page</title>
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
<body bgcolor="#ffffff">

	<jsp:include page="../top.jsp" />
	<p align="center">
		<b>车辆信息发布</b>
	</p>
	<form method="POST" action="carConfig" name="form1">
		<table width="786" border="1" align="center" cellpadding="0"
			cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
			bordercolorlight="#FFFFFF">
			<tr>
				<td width="20%" height="43">
					<p align="center">车牌号码：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cLicenseNumber" size="20">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">车辆类型：</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="cStyle" size="20">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="42">
					<p align="center">车辆品名：</p>
				</td>
				<td width="36%" height="42">
					<p align="left">
						<input type="text" name="cBrand" size="20">
					</p>
				</td>
				<td width="18%" height="42">
					<p align="center">车辆限量：</p>
				</td>
				<td width="30%" height="42">
					<p align="left">
						<input type="text" name="cCarLoad" size="20">吨
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="43">
					<p align="center">已使用年限：</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cUsedTime" size="20">
					</p>
				</td>
				<td width="20%" height="45">
					<p align="center">运输类型：</p>
				</td>
				<td width="36%" height="45">

					<p align="left">
						<select size="1" name="cTransportStyle">
							<option value="长途" selected>长途</option>
							<option value="短途">短途</option>
							
						</select>
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="46">
					<p align="center">驾驶员姓名：</p>
				</td>
				<td width="36%" height="46">
					<p align="left">
						<input type="text" name="cDriverName" size="20">
					</p>
				</td>
				<td width="18%" height="46">
					<p align="center">驾驶证号码：</p>
				</td>
				<td width="30%" height="46">
					<p align="left">
						<input type="text" name="cLicenseNum" size="20">
					</p>
				</td>
			</tr>
			<tr>
				
				<td width="18%" height="45">
					<p align="center">驾驶员驾龄：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cDriverTime" size="20">
					</p>
				</td>
				
				<td width="20%" height="45">
					<p align="center">驾驶类型：</p>
				</td>
				<td width="36%" height="45">

					<p align="left">
						 <select size="1" name="cLicenseStyle">
							<option value="A" selected>A</option>
							<option value="B">B</option>
							
						</select>
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="45">
					<p align="center">联系电话：</p>
				</td>
				<td width="36%" height="45">
					<p align="left">
						<input type="text" name="cLinkPhone" size="20">
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">联系人：</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cLinkMan" size="20">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="78">
					<p align="center">备注：</p>
				</td>
				<td width="84%" height="78" colspan="3">
					<p align="left">
						<textarea rows="5" name="cRemark" cols="72"></textarea>
					</p>
				</td>
			</tr>
			
			<tr>
				<td width="786" height="58" colspan="4">
					<p align="center">
						<input type="submit" name="show" value="发布"
							onClick="return check()"> <input type="reset"
							name="reset" value="重置"> &nbsp;&nbsp;<a
							href="carShow">返回</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
