<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html>
<head>
	<title>mian</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<!-- 
<FRAMESET> 称框架标记，用以宣告HTML文件为框架模式，并设定视窗如何分割。 
<FRAME> 则只是设定某一个框窗内的参数属性。 
<FRAMESET> 参数设定： 
例子：<frameset rows="90,*" frameborder="0" border=0 framespacing="2" bordercolor="#008000"> 
COLS="90,*" 垂直切割画面(如分左右两个画面)，接受整数值、百分数， * 则代表占用馀下空 间。
数值的个数代表分成的视窗数目且以逗号分隔。例如COLS="30,*,50%" 可以 切成叁个视窗，
第一个视窗是 30 pixels 的宽度，为一绝对分割，
第二个视窗是当 分配完第一及第叁个视窗後剩下的空间，
第叁个视窗则占整个画面的 50% 宽度 为 一相对分割。您可自己调整数字。
ROWS="127,*,11" 就是横向切割，将画面上下分开，数值设定同上。 -->
	
<!-- 
frameborder="0" 设定框架的边框，其值只有 0 和 1 ， 0表示不要边框， 1表示要显示边框。（避 免使用 yes 或 no ） 
border="0" 设定框架的边框厚度，以 pixels 为单位。 
bordercolor="#008000" 设定框架的边框颜色。颜色值请参考【调色原理】。 
framespacing="5" 表示框架与框架间的保留空白的距离。 -->

<frameset rows="127,*,11" frameborder="0" border="0" framespacing="0">
	<frame src="top.jsp" name="topFrame" noresize="noresize" id="topFrame" />
	<frame src="center.jsp" name="mainFrame" id="mainFrame" />
	<frame src="down.jsp" name="bottomFrame" noresize="noresize" id="bottomFrame" />
</frameset>

<!-- 
<NOFRAMES> ： 当别人使用的浏览器太旧，不支援框架这个功能时，他看到的将会是一片空白。为了避免 这种情况，可使用 <NOFRAMES> 这个标记，
当使用者的浏览器看不到框架时，他就会看到 <NOFRAMES> 与 </NOFRAMES> 之间的内容，而不是一片空白。
这些内容可以是提醒 浏览转用新的浏览器的字句，甚至是一个没有框架的网页或能自动切换至没有框架的版本 亦可。  -->
<noframes>
	<body>
		很抱歉，阁下使用的浏览器不支援框架功能，请转用新的浏览器。 
	</body>
</noframes>


</html>
