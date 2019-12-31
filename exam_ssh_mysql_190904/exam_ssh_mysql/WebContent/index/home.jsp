<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<title>软考在线</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script src="js/jquery.js" type="text/javascript"></script>
</head>
<body>
	
	<!-- 引入页面头部 -->
	<jsp:include page="head.jsp"/>

	<!-- 网页中间部分 -->
	<div class="main">
		<div class="main_wrap">
			
			<div class="home_wrap">
				<div class="uc_wrap" style="clear:both;">
					<div class="uc_left"> 
						<div class="ucb_top">
							<h2 class="uc_nm">
								<a href="home.action">${user.username}</a>&nbsp;
								<a href="home.action"><img id="dj" src="images/dj1.gif" /></a>
							</h2>
                        </div>
						<br/>
						
						<div class="ucb_top"><h2 class="uc_grxx">积分</h2></div>
						<div class="ucb_grxx"><p>积分：${user.total}</p></div>
						
						<div class="ucb_top"><h2 class="uc_grxx">个人信息</h2></div>
						<div class="ucb_grxx"><p>邮箱：${user.email}</p></div>
						<div class="ucb_grxx"><p>介绍：${user.intro}</p></div>

					</div>

					
					<div class="uc_right" style="margin-right: 8px; width: 650px;"> 
						<div class="dyym_c">
							<ul class="uccz" id="cz_li_cur_">
								<li id="li1" class="cur"><a href="javascript:void(0);" onclick="mytab(1)">我的挑战</a></li>
                            </ul>

							<div class="cz01 clearfix" id="panel1" style="display: block;">
								<div class="uc_whddcs">
									<div class="ucwhh_top"><h2> 我的挑战 </h2></div>
									<div class="ucwhh_nr">
										<div class="ucnrw">
											<table width="100%">
												<tr>
													<td width="30%" style="height:20px;">BEGINNER(0-299)</td>
													<td width="70%">
														<s:iterator value="request.beginner">
															<a href="intro.action?id=<s:property value="category.id"/>">
																<s:property value="category.name"/></a>
																<font color="gray">(<s:property value="grade"/>)</font>&nbsp;&nbsp;
														</s:iterator>
													</td>
												</tr>
												<tr>
													<td width="18%" style="height:20px;">FAMILIAR(300-449)</td>
													<td width="82%">
														<s:iterator value="request.familiar">
															<a href="intro.action?id=<s:property value="category.id"/>">
																<s:property value="category.name"/></a>
																<font color="gray">(<s:property value="grade"/>)</font>&nbsp;&nbsp;
														</s:iterator>
													</td>
												</tr>
												<tr>
													<td width="18%" style="height:20px;">PROFICIENT(450-699)</td>
													<td width="82%">
														<s:iterator value="request.proficient">
															<a href="intro.action?id=<s:property value="category.id"/>">
																<s:property value="category.name"/></a>
																<font color="gray">(<s:property value="grade"/>)</font>&nbsp;&nbsp;
														</s:iterator>
													</td>
												</tr>
												<tr>
													<td width="18%" style="height:20px;">EXPERT(700-779)</td>
													<td width="82%">
														<s:iterator value="request.expert">
															<a href="intro.action?id=<s:property value="category.id"/>">
																<s:property value="category.name"/></a>
																<font color="gray">(<s:property value="grade"/>)</font>&nbsp;&nbsp;
														</s:iterator>
													</td>
												</tr>
												<tr>
													<td width="18%" style="height:20px;">MASTER(780-800)</td>
													<td width="82%">
														<s:iterator value="request.master">
															<a href="intro.action?id=<s:property value="category.id"/>">
																<s:property value="category.name"/></a>
																<font color="gray">(<s:property value="grade"/>)</font>&nbsp;&nbsp;
														</s:iterator>
													</td>
												</tr>
											</table>
										</div>
									</div>
								</div>
							</div>

						</div>
                    </div>
  
                </div>
            </div>

        </div>
    </div>
	

	<!-- 页面尾部 -->
	<div class="bottom"></div>

</body>
</html>