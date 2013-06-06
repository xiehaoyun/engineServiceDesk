<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="pages/common/taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>down</title>
	<%@ include file="pages/common/common.jsp"%>
	
	<style type="text/css">
	<!--
	body {
		margin-left: 3px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
	}
	-->
	</style>
</head>

<body>
	<table width="100%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="30"><table width="100%" border="0" cellspacing="0"
					cellpadding="0">
					<tr>
						<td height="24" bgcolor="#353c44"><table width="100%"
								border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<tr>
												<td width="6%" height="19" valign="bottom"><div
														align="center">
														<img src="<c:url value='/resources/scripts/dtree/images/tb.gif' />" width="14" height="14" />
													</div>
												</td>
												<td width="94%" valign="bottom"><span class="STYLE23">
														管理人员基本信息列表</span>
												</td>
											</tr>
										</table>
									</td>
									<td><div align="right">
											<span class="STYLE23"> <input type="checkbox"
												name="checkbox11" id="checkbox11" /> 全选 &nbsp;&nbsp;<img
												src="<c:url value='/resources/scripts/dtree/images/add.gif' />" width="10" height="10" /> 添加 &nbsp; <img
												src="<c:url value='/resources/scripts/dtree/images/del.gif' />" width="10" height="10" /> 删除
												&nbsp;&nbsp;<img src="<c:url value='/resources/scripts/dtree/images/edit.gif' />" width="10"
												height="10" /> 编辑 &nbsp;</span><span class="STYLE23"> &nbsp;</span>
										</div>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td><table width="100%" border="0" cellpadding="0"
					cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"
					onmouseout="changeback()">
					<tr>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<input type="checkbox" name="checkbox3" id="checkbox3" />
							</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">admin</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">系统管理员</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">13913612548</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">192.168.0.124</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">用户可以对系统的所有操作进行管理...</div>
						</td>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE21">删除 | 查看</span>
							</div>
						</td>
					</tr>
					<tr>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<input type="checkbox" name="checkbox4" id="checkbox4" />
							</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">admin</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">系统管理员</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">13913612548</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">192.168.0.124</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">用户可以对系统的所有操作进行管理...</div>
						</td>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE21">删除 | 查看</span>
							</div>
						</td>
					</tr>
					<tr>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<input type="checkbox" name="checkbox5" id="checkbox5" />
							</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">admin</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">系统管理员</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">13913612548</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">192.168.0.124</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">用户可以对系统的所有操作进行管理...</div>
						</td>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE21">删除 | 查看</span>
							</div>
						</td>
					</tr>
					
					<tr>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<input type="checkbox" name="checkbox10" id="checkbox10" />
							</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">admin</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">系统管理员</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">13913612548</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">192.168.0.124</div>
						</td>
						<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div
								align="center">用户可以对系统的所有操作进行管理...</div>
						</td>
						<td height="20" bgcolor="#FFFFFF"><div align="center">
								<span class="STYLE21">删除 | 查看</span>
							</div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td height="30"><table width="100%" border="0" cellspacing="0"
					cellpadding="0">
					<tr>
						<td width="33%"><div align="left">
								<span class="STYLE22">&nbsp;&nbsp;&nbsp;&nbsp;共有<strong>
										243</strong> 条记录，当前第<strong> 1</strong> 页，共 <strong>10</strong> 页</span>
							</div>
						</td>
						<td width="67%"><table width="312" border="0" align="right"
								cellpadding="0" cellspacing="0">
								<tr>
									<td width="49"><div align="center">
											<img src="<c:url value='/resources/scripts/dtree/images/main_54.gif' />" width="40" height="15" />
										</div>
									</td>
									<td width="49"><div align="center">
											<img src="<c:url value='/resources/scripts/dtree/images/main_56.gif' />" width="45" height="15" />
										</div>
									</td>
									<td width="49"><div align="center">
											<img src="<c:url value='/resources/scripts/dtree/images/main_58.gif' />" width="45" height="15" />
										</div>
									</td>
									<td width="49"><div align="center">
											<img src="<c:url value='/resources/scripts/dtree/images/main_60.gif' />" width="40" height="15" />
										</div>
									</td>
									<td width="37" class="STYLE22"><div align="center">转到</div>
									</td>
									<td width="22"><div align="center">
											<input type="text" name="textfield" id="textfield"
												style="width:20px; height:12px; font-size:12px; border:solid 1px #7aaebd;" />
										</div>
									</td>
									<td width="22" class="STYLE22"><div align="center">页</div>
									</td>
									<td width="35"><img src="<c:url value='/resources/scripts/dtree/images/main_62.gif' />" width="26"
										height="15" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					
					
					
				</table>
			</td>
		</tr>
	</table>
</body>


</html>
