function f(str) {
	var sub_menu = document.getElementById(str);
	var dis_v = sub_menu.style.display;
	if (dis_v == "block")
		sub_menu.style.display = "none";
	else
		sub_menu.style.display = "block";
}

var oDiv = $("#demo").height();
var i = 0;
var timer = null;
var demo = document.getElementById('demo');
function start() {
	i--;
	if (i <= -1 * oDiv + 200) {
		i = 1 * oDiv;
		document.getElementById('context-right-playback').style.top = -i + 130 + 'px';
	} else {
		document.getElementById('context-right-playback').style.top = +i + 'px';
	}
	timer = setTimeout(start, 100);
}
onload = function() {
	setTimeout(start, 1000)
}
demo.onmouseover = function() {
	clearTimeout(timer)
}
demo.onmouseout = function() {
	setTimeout(start, 1000)
}