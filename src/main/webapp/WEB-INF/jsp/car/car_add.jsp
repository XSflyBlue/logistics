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
			alert("����д���ƺ��룡��");
			form1.cLicenseNumber.focus();
			return false;
		}
		if (form1.cStyle.value == "") {
			alert("����д�������ͣ�����");
			form1.cStyle.focus();
			return false;
		}
		if (form1.cBrand.value == "") {
			alert("����д����Ʒ��������");
			form1.cBrand.focus();
			return false;
		}
		if (form1.cCarLoad.value == "") {
			alert("����д��������������");
			form1.cCarLoad.focus();
			return false;
		}
		if (form1.cUsedTime.value == "") {
			alert("����д��ʹ�����ޣ�����");
			form1.cUsedTime.focus();
			return false;
		}
		if (form1.cTransportStyle.value == "") {
			alert("��ѡ���������ͣ�����");
			form1.cTransportStyle.focus();
			return false;
		}
		if (form1.cDriverName.value == "") {
			alert("����д��ʻԱ����������");
			form1.cDriverName.focus();
			return false;
		}
		if (form1.cLicenseNum.value == "") {
			alert("����д��ʻ֤���룡����");
			form1.cLicenseNum.focus();
			return false;
		}
		if (form1.cDriverTime.value == "") {
			alert("����д��ʻԱ���䣡����");
			form1.cDriverTime.focus();
			return false;
		}
		if (form1.cLicenseStyle.value == "") {
			alert("����д��ʻ���ͣ�����");
			form1.cLicenseStyle.focus();
			return false;
		}
		if (form1.cLinkMan.value == "") {
			alert("����д��ϵ�ˣ�����");
			form1.cLinkMan.focus();
			return false;
		}
		if (form1.cLinkPhone.value == "") {
			alert("����д��ϵ�绰������");
			form1.cLinkPhone.focus();
			return false;
		}
		if (form1.cRemark.value == "") {
			alert("����д��ע������");
			form1.cRemark.focus();
			return false;
		}
		
	}
</Script>
<body bgcolor="#ffffff">

	<jsp:include page="../top.jsp" />
	<p align="center">
		<b>������Ϣ����</b>
	</p>
	<form method="POST" action="carConfig" name="form1">
		<table width="786" border="1" align="center" cellpadding="0"
			cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
			bordercolorlight="#FFFFFF">
			<tr>
				<td width="20%" height="43">
					<p align="center">���ƺ��룺</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cLicenseNumber" size="20">
					</p>
				</td>
				<td width="18%" height="43">
					<p align="center">�������ͣ�</p>
				</td>
				<td width="30%" height="43">
					<p align="left">
						<input type="text" name="cStyle" size="20">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="42">
					<p align="center">����Ʒ����</p>
				</td>
				<td width="36%" height="42">
					<p align="left">
						<input type="text" name="cBrand" size="20">
					</p>
				</td>
				<td width="18%" height="42">
					<p align="center">����������</p>
				</td>
				<td width="30%" height="42">
					<p align="left">
						<input type="text" name="cCarLoad" size="20">��
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="43">
					<p align="center">��ʹ�����ޣ�</p>
				</td>
				<td width="36%" height="43">
					<p align="left">
						<input type="text" name="cUsedTime" size="20">
					</p>
				</td>
				<td width="20%" height="45">
					<p align="center">�������ͣ�</p>
				</td>
				<td width="36%" height="45">

					<p align="left">
						<select size="1" name="cTransportStyle">
							<option value="��;" selected>��;</option>
							<option value="��;">��;</option>
							
						</select>
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="46">
					<p align="center">��ʻԱ������</p>
				</td>
				<td width="36%" height="46">
					<p align="left">
						<input type="text" name="cDriverName" size="20">
					</p>
				</td>
				<td width="18%" height="46">
					<p align="center">��ʻ֤���룺</p>
				</td>
				<td width="30%" height="46">
					<p align="left">
						<input type="text" name="cLicenseNum" size="20">
					</p>
				</td>
			</tr>
			<tr>
				
				<td width="18%" height="45">
					<p align="center">��ʻԱ���䣺</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cDriverTime" size="20">
					</p>
				</td>
				
				<td width="20%" height="45">
					<p align="center">��ʻ���ͣ�</p>
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
					<p align="center">��ϵ�绰��</p>
				</td>
				<td width="36%" height="45">
					<p align="left">
						<input type="text" name="cLinkPhone" size="20">
					</p>
				</td>
				<td width="18%" height="45">
					<p align="center">��ϵ�ˣ�</p>
				</td>
				<td width="30%" height="45">
					<p align="left">
						<input type="text" name="cLinkMan" size="20">
					</p>
				</td>
			</tr>
			<tr>
				<td width="20%" height="78">
					<p align="center">��ע��</p>
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
						<input type="submit" name="show" value="����"
							onClick="return check()"> <input type="reset"
							name="reset" value="����"> &nbsp;&nbsp;<a
							href="carShow">����</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
