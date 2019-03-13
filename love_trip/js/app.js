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

//校验手机
function checkMphone(mphone) {
	var temp = /^1(3|4|5|7|8)\d{9}$/;
	if(!(temp.test(mphone))){ 
        mui.toast("手机号码有误，请重填!");  
        return false; 
    } 
	return true;
}

//校验电话号码
function checkTel(tel) {
	var temp = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;
	if(!(temp.test(tel))){
		mui.toast('固定电话有误，请重填!');
		return false;
	}
	return true;
}

function checkPhone(phone) {
	var temp = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;
	if(!(temp.test(phone))) {
		mui.toast('联系方式有误，请重填!');
		return false;
	}
	return true;
}

function checkIdcardNo(idNo) {
	var temp1 = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/;
	var temp2 = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/;
	if((temp1.test(idNo)) || temp2.test(idNo)) {
		mui.toast("身份证号码错误！");
		return true;
	}
	return false;
}

function checkText(text) {
	var temp = /^[\u4E00-\u9FA5A-Za-z0-9]+$/;
	if(!(temp.test(text))) {
		mui.toast("请输入正确的字符！");
		return false;
	}
	return true;
}

function getDictJsonText(dictJson, dictId) {
	console.log(dictJson);
    if (dictJson == null || dictJson.length == 0) {
        return "";
    }
    for (var i=0; i<dictJson.length; i++) {
        if (dictJson[i].value == dictId) {
            return dictJson[i].text;
        }
    }
    return "";
}

function getTwoDictJsonText(dictJson, dictId1,dictId2) {
	var dictText = "";
    if (dictJson == null || dictJson.length == 0) {
        return "";
    }
    for (var i=0; i<dictJson.length; i++) {
        if (dictJson[i].value == dictId1) {
			dictText = dictJson[i].text;
			var dict = dictJson[i].children;
			for(var j=0;j<dict.length;j++) {
				if(dict[j].value == dictId2) {
					dictText = dictText + "-" + dict[j].text;
				}
			}
            return dictText;
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
