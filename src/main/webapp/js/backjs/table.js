function modify(Obj,wid,hei){
	var url=$(Obj).attr("data-val");
	document.getElementById("DialogFrame").src=url;
	$("#dialog-form").dialog({
		autoOpen: false,
		resizable: false,
		modal: true,
		height: hei,
		width: wid,
		buttons: {
			"保存": function(){
				$(window.frames["DialogFrame"].document).find("#submit").click();
				alertTip("修改成功");
				$( this ).dialog( "close" );
			},
			"重置": function(){
				modify(Obj,wid,hei);  
			},
			"取消": function() {
				$( this ).dialog( "close" );
			}
		},
		close: function() {
		}
	});
	$("#dialog-form").dialog("open");
}

//通用添加按钮
function add(Obj,wid,hei){
	var url=$(Obj).attr("data-val");
	document.getElementById("DialogFrameAdd").src=url;
	$("#dialog-form-Add").dialog({
		autoOpen: false,
		resizable: false,
		modal: true,
		height: hei,
		width: wid,
		buttons: {
			"保存": function(){
				$(window.frames["DialogFrameAdd"].document).find("#submit").click();
				alertTip("添加成功");
				$( this ).dialog( "close" );
			},
			"清空": function() {
				add(Obj,wid,hei);
			},
			"取消": function() {
				$( this ).dialog( "close" );
			}
		},
		close: function() {
		}
	});
	$("#dialog-form-Add").dialog("open");
}

/*弹出框提示*/
function alertTip(str){
	$("#dialog-Tip").html(str);
	$("#dialog-Tip").dialog({
		autoOpen: false,
		resizable: false,
		modal: true,
		height: 220,
		width: 220,
		buttons: {
			"确定": function() {
				$(this).dialog("close");
				window.location.replace(window.location.href);
				//window.location.reload();
			}
		},
		close: function() {
			window.location.replace(window.location.href);
			//window.location.reload();
		}
	});
	$("#dialog-Tip").dialog("open");
}