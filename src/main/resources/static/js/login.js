/**
 * Created by lenovo on 2019/8/26.
 */
$(function(){

    $("#regis-submit").click(function() {
        var userName = $("#username").val();
        var password = $("#password").val();

        var userType=$("#usertype").val();
        var user = {
            userName: userName,
            password: password,
            userType:userType,
            id:""
        };

        $.ajax({
            url: "/userinfo",
            type: "POST",
            traditional: true,
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            dataType: "json",
            data: user,
            success: function (data) {
                if(data.status=="200"){
                    alert(data.msg);
                }else{
                    alert(data.msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });


    });



    $("#login-submit").click(function() {
        var username = $("#username2").val();
        var password = $("#password2").val();


        var user = {
            username: username,
            password: password
        };

        $.ajax({
            url: "/user",
            type: "GET",
            traditional: true,
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            dataType: "json",
            data: user,
            success: function (data) {
                if(data.status=="200"){
                    alert(data.msg);
                }else{
                    alert(data.msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // console.log(XMLHttpRequest.status);
                // console.log(XMLHttpRequest.readyState);
                // console.log(textStatus);
            },
        });


    });



});
