//define a json string
var s = '{"firstName": "John", \
"lastName": "Smith", \
"sex": "male", "age": 25\
}'

console.log(s);

//convert a json string to js object
var jsObj = JSON.parse(s);
console.log(jsObj);

//convert a json string to js string
var jsonString = JSON.stringify(jsObj);
console.log(jsonString);