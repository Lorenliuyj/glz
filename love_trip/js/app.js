function gbid(eleID) {
    return document.getElementById(eleID);
}
function consoleLog(mesg) {
    //all debug console output
    console.log("<debug>"+mesg);
}
function replaceAll(str, search, replace){
    var regex = new RegExp(search, "g");
    return (str || "").replace(regex, replace);
}
function isNull(obj){
    if (obj==null||obj==""||obj==undefined||obj=="{}") {
        return true;
    } else {
        return false;
    }
}
function lzeroNumb(numb) {
    return (numb < 10 ? ('0' + numb) : numb);
}

function getDate() {
    var date = new Date();
    return ""+date.getFullYear() + lzeroNumb(date.getMonth() + 1) + lzeroNumb(date.getDate());
}

function getDateTime() {
    var date = new Date();
    return ""+date.getFullYear() + lzeroNumb(date.getMonth() + 1) + lzeroNumb(date.getDate()) +
        lzeroNumb(date.getHours()) + lzeroNumb(date.getMinutes()) + lzeroNumb(date.getSeconds());
}
//将YYYYMMDD日期转换为YYYY-MM-DD格式
function fmDates(dstr) {
    if (isNull(dstr)) {
        return "";
    } else {
        return dstr.substr(0,4)+"-"+dstr.substr(4,2)+"-"+dstr.substr(6,2);
    }
}
//将HHMISS日期转换为HH:MI:SS格式
function fmTime(dstr) {
    if (app.isNull(dstr)) {
        return "";
    } else {
        return dstr.substr(0,2)+":"+dstr.substr(2,2)+":"+dstr.substr(4,2);
    }
}

//将YYYYMMDDHHMISS转化为 YYYY-MM-DD HH:MI:SS格式
function fmDateTime(dstr) {
	if (isNull(dstr)) {
		return "";
	} else {
		return dstr.substr(0,4)+"-"+dstr.substr(4,2)+"-"+dstr.substr(6,2)+" "+dstr.substr(8,2)+":"+dstr.substr(10,2)+
		":"+dstr.substr(12,2);
	}
}

//将YYYY-MM-DD HH:MI格式转化为YYYYMMDDHHMI+00
function parseDateTime(dstr) {
	if (isNull(dstr)) {
		return "";
	} else {
		return dstr.substr(0,4)+dstr.substr(5,2)+dstr.substr(8,2)+dstr.substr(11,2)+dstr.substr(14,2)+"00";
	}
}

//将YYYY-MM-DD HH:MI格式转化为YYYYMMDDHHMI
function parseDateTimeLess(dstr) {
	if (isNull(dstr)) {
		return "";
	} else {
		return dstr.substr(0,4)+dstr.substr(5,2)+dstr.substr(8,2)+dstr.substr(11,2)+dstr.substr(14,2);
	}
}

//将YYYY-MM-DD格式转化为YYYYMMDD
function parseDate(dstr) {
	if (isNull(dstr)) {
		return "";
	} else {
		return dstr.substr(0,4)+dstr.substr(5,2)+dstr.substr(8,2);
	}
}

//将YYYYMMDDHHMISS转化为 YYYY-MM-DD HH:MI格式
function fmDateTimeLess(dstr) {
	if (isNull(dstr)) {
		return "";
	} else {
		return dstr.substr(0,4)+"-"+dstr.substr(4,2)+"-"+dstr.substr(6,2)+" "+dstr.substr(8,2)+":"+dstr.substr(10,2);
	}
}

//将YYYYMMDD日期转换为MM.DD HH:MM格式
function fmDate(dstr) {
    if (isNull(dstr)) {
        return "";
    } else {
        return dstr.substr(4,2)+"."+dstr.substr(6,2)+" "+dstr.substr(8,2)+":"+dstr.substr(10,2);
    }
}

//将YYYYMMDD日期转换为YYYY-MM-DD HH:MM格式
function fmDay(dstr) {
	if (isNull(dstr)) {
        return "";
    } else {
        return dstr.substr(0,4)+"-"+dstr.substr(4,2)+"-"+dstr.substr(6,2);
    }
}


function getDictJsonText(dictJson, dictId) {
    if (dictJson == null || dictJson.length == 0) {
        return "";
    }
    for (var i=0; i<dictJson.length; i++) {
        if (dictJson[i].id == dictId) {
            return dictJson[i].text;
        }
    }
    return "";
}

function openUrl(pageUrl,extras){
	if(typeof(extras)=="undefined"){
		extras={};
	}
	mui.openWindow({
		url:pageUrl,
		id:pageUrl,
		extras:extras
	});
}

function appConfirm( message, title, btnValue, callback ){
    if ('Android' == plus.os.name) {
        if (typeof btnValue == 'function') {
            callback = btnValue;
            btnValue = ["确定","取消"];
        } else if (app.isNull(btnValue)) {
            btnValue = ["确定","取消"];
        }
        mui.confirm(message, title, btnValue, function(e){
            if (e.index === 1) {
                callback && callback({index:0});
            } else {
                callback && callback({index:1});
            }
        });
    } else {
        mui.confirm(message, title, btnValue, callback);
    }
}
function openUrl(pageUrl,extras){
	if(typeof(extras)=="undefined"){
		extras={};
	}
	mui.openWindow({
		url:pageUrl,
		id:pageUrl,
		extras:extras
	});
}
(function($, owner) {
    owner.getUserState = function() {
        return JSON.parse(localStorage.getItem('$resUserState') || "{}");
    };
    owner.setUserState = function(state) {
        localStorage.setItem('$resUserState', JSON.stringify(state || {}));
    };

    owner.getAppOption = function() {
        return JSON.parse(localStorage.getItem('$resAppOption') || "{}");
    }
    owner.setAppOption = function(option) {
        localStorage.setItem('$resAppOption', JSON.stringify(option || {}));
    }

    owner.checkLogin = function(){
        var state = owner.getUserState();
        if (isNull(state.token) || state.token.length<20) {
            mui.openWindow({
                url: '/login.html', id: 'login',
                show: { aniShow: 'pop-in' },
                waiting: { autoShow: false }
            });
        } else {
            return true;
        }
    }

    owner.loginStatus=function(){
        var state = owner.getState();
        if (isNull(state.token) || state.token.length<20) {
            return false;
        } else {
            return true;
        }
    }

}(mui, window.app = {}));
