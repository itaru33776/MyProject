//等待多久再執行程式
var timeoutID = setTimeout(myFunc, 1000, "Some Massage...");
//clearTimeout(timeoutID); 取消setTimeout

function myFunc(msg){
    alert(msg);
}

function alert(msg){
    console.log(msg);
}


//每隔多久執行一次
var intervalID = setInterval( function(){
    alert('message again!');
}, 1000);


clearInterval(intervalID);

var win1 = window.open('https://www.google.com/');
var win2 = window.open('https://tw.yahoo.com/',
    'yahoo-window',
    'width=800,height=600,resizable=yes,scrollbars=yes,location=yes'
);
setTimeout(function(){
    win2.close();
});

