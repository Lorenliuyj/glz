(function($, appajax) {
    appajax.SERVER_HOST = "http://127.0.0.1:8080/";
   
    appajax.SERVER_URL = appajax.SERVER_HOST;
	// appajax.IMAGE_PATH = "/cisp_admin/upload";
//     appajax.checkNetworkStatus=function(isAlert) {
//         var net = plus.networkinfo;
//         if (net.getCurrentType() === net.CONNECTION_NONE || net.getCurrentType() === net.CONNECTION_UNKNOW) {
//             if (isAlert) {
//                 mui.alert('网络无法连接，请检查WIFI或数据服务是否正常');
//             }
//             return false;
//         } else {
//             return true;
//         }
    // };
  
    appajax.SendRequestByGet=function(action,data,successCallback, errorCallback) {
        //if (appajax.checkNetworkStatus(true)) {
            //plus.nativeUI.closeWaiting();
            //plus.nativeUI.showWaiting();
            mui.getJSON(appajax.SERVER_URL+action, data, function (response) {
				consoleLog("ajax return data:"+JSON.stringify(response));
                if (response.code == "0000") {
                    successCallback && successCallback(response);
                } else {
                    //plus.nativeUI.toast(response.message);
                    errorCallback&&errorCallback(response);
                }
            });
        //}
    };
    appajax.SendRequestByPost=function(action,data,successCallback,errorCallback,isAsync) {
//         if (!appajax.checkNetworkStatus(true)) {
//             return false;
//         }
//         plus.nativeUI.closeWaiting();
//         plus.nativeUI.showWaiting();

        var reqUrl = appajax.SERVER_URL+action;
        var state = app.getUserState();
//         if (!isNull(state) && !isNull(state.token)) {
//             data.app_token  = state.token;
//             data.app_userid = state.userid;
//             data.app_username = state.username;
//         }
        consoleLog("debug-posturl:"+ reqUrl);
        consoleLog("debug-postdata:"+JSON.stringify(data));

       // mui.ajaxSettings.contentType = "application/x-www-form-urlencoded;charset=UTF-8;";
		mui.ajaxSettings.contentType = "application/json";
        mui.ajaxSettings.dataType = "json";
        //异步，timeout则10秒，同步则5秒
        mui.ajax(reqUrl, {data:data, type:"POST", timeout:(isAsync ? 15000 : 10000), async:(isAsync ? true : false),
            success:function(response) {
                consoleLog("ajax return data:"+JSON.stringify(response));
                if (response.code == "0000"){
                    successCallback && successCallback(response);
                } else {
                    consoleLog("execute failure,info:"+response.info+",message:"+response.message);
                    errorCallback && errorCallback(response);
                }
            }
        });
    };

    $.ajaxSettings.error=function(xhr, type, errorThrown){
        try {
            //mui.alert("ajax errorType:"+type+",responseText:"+xhr.responseText);
            mui.alert("网络连接或服务端有问题，请稍后再试！");
            //var msg=JSON.parse(xhr.responseText).msg;
            //plus.nativeUI.toast(msg);
        } catch(e) {
            // plus.nativeUI.toast('连接超时,请稍后再试');
        }
    };
    $.ajaxSettings.complete = function(xhr, status) {
        // plus.nativeUI.closeWaiting();
    }
})(mui, window.appajax = {});
