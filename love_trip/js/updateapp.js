/**
 * json format
 {
	"version": "2.6.0",
	"title": "Hello MUI版本更新",
	"note": "修复某个选项卡滚动到底时，会触发所有选项卡上拉加载事件的bug；",
	"url": "http://www.dcloud.io/hellomui/HelloMUI.apk"
 }

* mui.os.plus && !mui.os.stream && mui.plusReady(update);
* rely appajax.js, app.js
* */

/********直接下载apk安装文件，暂不做资源包更新***************/
function updateAndDownload(wgtVer,isShow) {
    if (!appajax.checkNetworkStatus(isShow)) {
        return false;
    }
    var updateUrl = appajax.SERVER_URL+"/update.do?random="+(new Date().getTime());
    
    mui.ajax(updateUrl, {dataType:'json', type:"GET", timeout:2000,
        success:function(response) {
           var rtnData = response.data;
           var newVer = rtnData.version.replace(/\./g, "");
           var oldVer = wgtVer.replace(/\./g, "");
           if (oldVer - newVer < 0) { //need update
            	var content = rtnData.updataContent;
            	var showMessage = "";
                plus.nativeUI.confirm(rtnData.updataContent, function(event) {
                    if (0 == event.index) {
                        downloadApp(rtnData.updataUrl + rtnData.fileName);
                    }
                    if (1 == event.index){
                    }
                }, rtnData.title, ["立即更新", "暂不更新"]);
            } else {
                if (isShow) {
                    plus.nativeUI.toast("您当前是最新版无需更新");
                }
            }
        },
        error : function(xhr, type, errorThrown) {
           // alert(xhr.responseText);
           mui.alert("检查更新失败");
        }
    });
}

function downloadApp(dUrl) {
    var downUrl =   dUrl;
    plus.runtime.openURL(downUrl);
}

