function square(number) {
    return number*number;
}

function noReturn() {

}

var squareValue = square(10);
console.log(squareValue);
console.log(square(10)*10);
console.log(noReturn());

var greet = function() {
    console.log("Hi");
}
greet();