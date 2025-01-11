var fruits = ['apple','banana'];
fruits[0] = 'orange';
fruits[1] = 101;
console.log(fruits);

fruits.push('orange');
console.log(fruits);

fruits[fruits.length] = 'guava';
console.log(fruits);

fruits.pop();
console.log(fruits);

