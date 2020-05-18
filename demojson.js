function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("demo").innerHTML = this.responseText;
        }
    };
    xhttp.open("GET", "demoAjax.com", true);
    xhttp.send();
    document.getElementById("demo").innerHTML = xhttp.responseText;
}

function error() {
    var xhttp2 = new XMLHttpRequest();
    try{
        ajaxRequest = new AcctiveXObject("Microsoft.XMLHTTP");
    }catch (e) {
        alert("có lỗi!!!")
        return false;
    }
}

$('#content').ajaxStart(function(){
    $(this).html('Loading...');
});
var timer=window.setTimeout(function(){
    $('#content').html('Loading seems to be taking a while. Try again.');
},2000);
$.ajax({
    type:"GET",
    url:'http://lab.laukstein.com/ajax-seo/.json',
    dataType:'jsonp',
    success:function(data){
        window.clearTimeout(timer);
        $('#content').html(data.content);
    },
    error:function(){
        window.clearTimeout(timer);
        $('#content').html('The request failed. Try to refresh page.');
    }
});
