/**
 * Created by lenovo on 2019/8/26.
 */
$(function(){

    var test1=new Array;

   test1[0]=1;
   test1[1]=2;
   test1[2]=3;

    console.log(test1);
    var test={
        id:2
    };

    $.ajax({
        url: "/groupuser/info",
        type: "post",
        traditional: true,
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        data:JSON.stringify(test),
        success: function (data) {
           console.log(data);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            // console.log(XMLHttpRequest.status);
            // console.log(XMLHttpRequest.readyState);
            // console.log(textStatus);
        },
    });


    //
    // $("#regis-submit").click(function() {
    //     var userName = $("#username").val();
    //     var password = $("#password").val();
    //
    //     var userType=$("#usertype").val();
    //     var user = {
    //         userName: userName,
    //         password: password,
    //         userType:userType,
    //         id:""
    //     };
    //
    //     $.ajax({
    //         url: "/userinfo",
    //         type: "POST",
    //         traditional: true,
    //         contentType: "application/x-www-form-urlencoded; charset=UTF-8",
    //         dataType: "json",
    //         data: user,
    //         success: function (data) {
    //             if(data.status=="200"){
    //                 alert(data.msg);
    //             }else{
    //                 alert(data.msg);
    //             }
    //         },
    //         error: function (XMLHttpRequest, textStatus, errorThrown) {
    //             // console.log(XMLHttpRequest.status);
    //             // console.log(XMLHttpRequest.readyState);
    //             // console.log(textStatus);
    //         },
    //     });
    //
    //
    // });



    // $("#login-submit").click(function() {
    //     var username = $("#username2").val();
    //     var password = $("#password2").val();
    //
    //
    //     var user = {
    //         username: username,
    //         password: password
    //     };
    //
    //     $.ajax({
    //         url: "/userinfo",
    //         type: "GET",
    //         traditional: true,
    //         contentType: "application/x-www-form-urlencoded; charset=UTF-8",
    //         dataType: "json",
    //         data: user,
    //         success: function (data) {
    //             if(data.status=="200"){
    //                 alert(data.msg);
    //             }else{
    //                 alert(data.msg);
    //             }
    //         },
    //         error: function (XMLHttpRequest, textStatus, errorThrown) {
    //             // console.log(XMLHttpRequest.status);
    //             // console.log(XMLHttpRequest.readyState);
    //             // console.log(textStatus);
    //         },
    //     });
    //
    //
    // });



});
