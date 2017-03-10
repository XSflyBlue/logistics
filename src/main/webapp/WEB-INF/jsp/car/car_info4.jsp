<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>information</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="CSS/style.css" type="text/css" rel="stylesheet">
</head>
<script type="text/javascript">
	function countDown(secs, surl) {
		var jumpTo = document.getElementById('jumpTo');
		jumpTo.innerHTML = secs;
		if (--secs > 0) {
			setTimeout("countDown(" + secs + ",'" + surl + "')", 1000);
		} else {
			location.href = surl;
			-ma
		}
	}
</script>
<body>
	<center>

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
						<h1>${info}<h1>
					</div></td>
				<h3>
					<a href="carDetail"><span id="jumpTo">5</span>秒后系统会自动跳转，也可点击本处直接跳</a>
				</h3>
				<script type="text/javascript">
						countDown(3, 'carDetail');
					</script>
			</tr>
		</table>

		<table width="100" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td><img src="image/24.jpg" width="791" height="203"></td>
			</tr>
		</table>
	</center>
</body>
</html>