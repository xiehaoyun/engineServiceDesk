
/**
 * Cut String
 * @param str - Target String
 * @param num - Reserved bits
 * eg: 
 *   <script type="text/javascript">
 *       $cutStr("abcdefg", 12);
 *   </script>
 */
function $cutStr(str, num) {
	var newstr = str;
	if(str.length > (num + 1)) {
		newstr = str.substring(0, num) + "...";
	}
	document.write(newstr);
}

/** Open Window */
var openedWindow = null;
var url = "";
var width = 0;
var height = 0;
var top = 0;
var left = 0;
var windowStyle = "";
var menubar = "";
var toolbar = "";
var status = "";
var scrollbars = "";
var resizable = "";
var fullscreen = "";
function $openWindow(url, width, height, top, left, menubar, toolbar, status, scrollbars, resizable, fullscreen) {
  url = encodeURI(encodeURI(url));
  this.url = url;
  this.width = width || 800;
  this.height = height || 600;
  this.top = top || (screen.height - this.height) / 2;
  this.left = left || (screen.width - this.width) / 2;
  
  this.menubar = menubar || "no";
  this.toolbar = toolbar || "no";
  this.status = status || "no";
  this.scrollbars = scrollbars || "no";
  this.resizable = resizable || "no";
  this.fullscreen = fullscreen || "no";

  if(openedWindow != null && !openedWindow.closed) {
    openedWindow.focus();
    return;
  }

  windowStyle = "width="+this.width+",height="+this.height+",top="+this.top+",left="+this.left
      +",menubar="+this.menubar+",toolbar="+this.toolbar+",status="+this.status+",scrollbars="+this.scrollbars+",resizable="+this.resizable+",fullscreen="+this.fullscreen;
  openedWindow = window.open(this.url, "_blank", windowStyle, false);
  openedWindow.focus();
  return openedWindow;
}
/** Open Full Screen Window ***************************************************************
 *
 * 各浏览器允许弹出窗口设置说明：
 *
 * IE:      弹出设置：输入访问地址后，出现阻止弹出窗口提示信息，点击提示信息，选择 “总是允许来自此站点的弹出窗口”。
 *                  像360这种基于IE内核的伪浏览器，需要在右下的允许弹出窗口将当前页“添加到白名单”。
 *                  还有其他像遨游等这些杂七杂八的伪浏览器，就不屑测它了。
 *
 * Firefox: 弹出设置：输入访问地址后，出现阻止弹出窗口提示信息，点击“选项”按钮，如何选择“允许 XXX 弹出窗口” 或 “编辑弹出阻止选项” 将访问地址加入允许站点。
 *
 * Chrome:  弹出设置：输入访问地址后，需要点击在地址栏尾端的禁止小图标，设置始终允许显示当前访问地址的弹出式窗口。
 *
 * Opera:   弹出设置：需要在 “设置” --> “快速参数” 中选择 “在后台打开弹出窗口” 或 “打开全部窗口”。
 *
 * Safari:  弹出设置：需要在设置中去除 “阻止弹出式窗口（Chrl+Shift+K）”。
 */
function $openWindowFullScreen(url) {
  this.url = url;
  this.width = (screen.width - 10) || 800;
  this.height = (screen.height - 70) || 600;

  if(openedWindow != null && !openedWindow.closed) {
    openedWindow.focus();
    return;
  }

  windowStyle = "width="+this.width+", height="+this.height+", top=0, left=0, menubar=no, toolbar=no, location=no, status=no, scrollbars=yes, resizable=yes";
  openedWindow = window.open(this.url, "_blank", windowStyle, false);
  openedWindow.focus();
  return openedWindow;
}
/** Open Modal Window */
function $openModalWindow(url, width, height, top, left, vArguments) {
  this.url = url;
  this.width = width || 800;
  this.height = height || 600;
  this.top = top || (screen.height - this.height) / 2;
  this.left = left || (screen.width - this.width) / 2;

  windowStyle = "dialogWidth:"+this.width+"px; dialogHeight:"+this.height+"px; dialogTop:"+this.top+"px; dialogLeft:"+this.left+"px; center: yes; help: no; resizable: no; status: no; edge: sunken;";
  return window.showModalDialog(this.url, vArguments, windowStyle);
}
/** Open Full Screen Modal Window */
function $openModalWindowFullScreen(url, vArguments) {
  this.url = url;
  this.width = (screen.width - 10) || 800;
  this.height = (screen.height - 70) || 600;

  windowStyle = "dialogWidth:"+this.width+"px; dialogHeight:"+this.height+"px; dialogTop:0px; dialogLeft:0px; center:yes; help:no; resizable:yes; status:no; edge:sunken;";
  return window.showModalDialog(this.url, vArguments, windowStyle);
}

/** 
 * 滚动
 *
 * step - 步长
 * time - 毫秒，多少毫秒增加一个步长
 */
function scroll(step, time) {
    var scrollTop = 0;
    var clientHeight = 0;
    var scrollHeight = 0;
    if (document.documentElement && document.documentElement.scrollTop) {
        scrollTop = document.documentElement.scrollTop;
    } else if (document.body) {
        scrollTop = document.body.scrollTop;
    }
    if (document.body.clientHeight && document.documentElement.clientHeight) {
        clientHeight = (document.body.clientHeight < document.documentElement.clientHeight) ? document.body.clientHeight: document.documentElement.clientHeight;
    } else {
        clientHeight = (document.body.clientHeight > document.documentElement.clientHeight) ? document.body.clientHeight: document.documentElement.clientHeight;
    }
    scrollHeight = Math.max(document.body.scrollHeight, document.documentElement.scrollHeight);
    if (scrollTop + clientHeight < scrollHeight) {
    	document.documentElement.scrollTop = scrollTop + step;
        setTimeout(scroll(step, time), time);
    }
}

/** 检查上传附件是否为图片 */
function checkImg(obj, msgId) {
	if(obj != null && obj.value != "") {
		var filePath = obj.value.toLowerCase();
		var fileType = filePath.substring(filePath.indexOf("."));
		if(fileType == ".gif" || fileType == ".jpeg" || fileType == ".jpg" || fileType == ".png") {
			var msgObj = document.getElementById(msgId);
			if(msgObj != null) {
				msgObj.innerHTML = "";
			}
			return true;
		} else {
			var msgObj = document.getElementById(msgId);
			if(msgObj != null) {
				msgObj.innerHTML = "文件格式错误，请上传*.gif,*.jpg,*.jpeg,*.png格式的图片。";
			}
			obj.value = "";
		}
	    return false;
    } else {
    	return true;
    }
}

/** 通过id的值得到一个控件对象 */
function $ID(idStr) {
  return document.getElementById(idStr);
}
/** 通过name的值得到一个控件对象 */
function $NAME(nameStr) {
  return document.getElementsByName(nameStr);
}
/** 通过id的值得到一个控件对象的值 */
function $ID_VAL(idStr) {
  return $ID(idStr).value;
}
/** 通过name的值得到一个控件对象的值 */
function $NAME_VAL(nameStr) {
  return $NAME(nameStr);
}
/** 判断控件是否有选中 */
function $hasChecked(name) {
	var flag = false;
	var objs = $NAME(name);
	if (objs != null) {
		for (var i = 0; i < objs.length; i++) {
			if (objs[i].checked) {
				flag = true;
				break;
			}
		}
	}
	return flag;
}
/** 判断控件选中个数 */
function $getCheckedCounts(name) {
	var counts = 0;
	var objs = $NAME(name);
	if (objs != null) {
		for (var i = 0; i < objs.length; i++) {
			if (objs[i].checked) {
				counts++;
			}
		}
	}
	return counts;
}
/** 判断控件选中值 一个值 */
function $getCheckedVal(name) {
	var value = "";
	var objs = $NAME(name);
	if (objs != null) {
		for (var i = 0; i < objs.length; i++) {
			if (objs[i].checked) {
				value = objs[i].value;
				break;
			}
		}
	}
	return value;
}
/** 判断控件选中值 数组 */
function $getCheckedArr(name) {
	var arr = new Array();
	var objs = $NAME(name);
	if (objs != null) {
		var j = 0;
		for (var i = 0; i < objs.length; i++) {
			if (objs[i].checked) {
				arr[j++] = objs[i].value;
			}
		}
	}
	return arr;
}
/** 删除select列表框所有的值 */
function $deleteAllOptions(name) {
	var delOption = $ID(name);
	var len = delOption.length;
	for(var i = len - 1; i >= 0 ; i--)
		delOption.options.remove(i);
}
/** 全选、取消全选 */
var checkFlag = true;
function $chooseAll(checkboxName) {
  var checkboxObj = $NAME(checkboxName);
  if (checkFlag) { // 全选
    for (var i = 0; i < checkboxObj.length; i++) {
      if (checkboxObj[i] != null) {
        checkboxObj[i].checked = true;
      }
    }
    checkFlag = false;
  } else { // 取消全选
    for (var i = 0; i < checkboxObj.length; i++) {
      if (checkboxObj[i] != null) {
        checkboxObj[i].checked = false;
      }
    }
    checkFlag = true;
  }
}
/** 点击文字选中checkbox选框效果 */
function $check2box(idStr) {
	$ID(idStr).checked = !$ID(idStr).checked;
}
//替换字符串
String.prototype.replaceAll = function(s1,s2) { 
    return this.replace(new RegExp(s1,"gm"),s2); 
}