//兩種建立object的方式
var myObj01 = new Object();
var myObj02 = {'color':'blue', 'height':'101'};
mycolor02 = myObj02.color;
myheight02 = myObj02.height;

myObj01.color = 'yellow';
var mycolor01 = myObj01.color;

myObj01['color'] = 'red';
mycolor01 = myObj01['color'];

console.log(mycolor01);
console.log(mycolor02);
console.log(myheight02);