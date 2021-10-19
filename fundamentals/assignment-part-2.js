'use strict';

/*let hasDriverLicense = false;
const passTest = true;

if (passTest) hasDriverLicense = true;
if (hasDriverLicense) console.log('I can drive');

const private = 'Audio';*/

/*
//FUNCTIONS
function logger() {
    console.log('My name is Prathap');
}

// calling / running / invoking a function
logger();
logger();
logger();

function fruitProcessor(apples, oranges) {
    const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
    return juice;
}

const appleJuice = fruitProcessor(5, 0);
console.log(appleJuice);

const appleOrangeJuice = fruitProcessor(2, 4);
console.log(appleOrangeJuice);*/

//Function Declaration
const age1 = calcAge1(1993);

function calcAge1(birthYear) {
    return 2037 - birthYear;
}

//console.log(age1);

//Function Expression
//Asynonyms function
const calcAge2 = function (birthYear) {
    return 2037 - birthYear;
}

//Arrow function
const calcAge3 = birthYear => 2037 - birthYear;
const age3 = calcAge3(1993);
//console.log(age3);

const yearsUntilRetirement = (birthYear, firstName) => {
    const age = 2037 - birthYear;
    const retirement = 65 - age;
    return `${firstName} retires in ${retirement}`;
}

//console.log(yearsUntilRetirement(1993, 'Prathap'));
//console.log(yearsUntilRetirement(1996, 'Prasanth'));


let x = 100;
let y = x;
let z = undefined;
let a = null;
x = 50;
console.log('x: ' + x + ' y:' + y);

//Higher Order Function Example
//Returning function from a function method - Start
const msg = function (name) {
    return function (age) {
        console.log(`Hi! My name is ${name} with age ${age}`);
    }
}
msg('Prathap')(28);
//Returning function from a function method - End

//Passing function as an argument to a function method - Start
function msg2(name) {
    return `Hi! My name is ${name}`;
}

function printMsg(msg, age, name) {
    console.log(`${msg(name)} with age ${age}`);
}

printMsg(msg2, 23, 'Prathap');
//Passing function as an argument to a function method - End

//call() & apply() method - Start
function writeName(age) {
    console.log(`call() & apply() method explanation------`);
    console.log(`My name is ${this.name} and age is ${age}`);
}

var object = {
    name: 'Prathap'
}
writeName.call(object, 23);
writeName.apply(object, [34]);

var person = {
    age: 23,
    getAge: function () {
        return this.age;
    }
}

var person2 = { age: 28 };

console.log(person.getAge.call(person2));
//call() & apply() method - End

//bind() method - Start
var sample = {
    bikeDetails: function (bikeNumber, licenseNumber) {
        return this.name + " " + bikeNumber + " " + licenseNumber;
    }
}

var nameDetails = {
    name: 'Prathap'
}

var bikeOutput = sample.bikeDetails.bind(nameDetails, "KA07", "KA456");
console.log(bikeOutput());
//bind() method - End

//Closures - Start
function xFunc() {
    var a = 7;
    function y() {
        console.log(a);
    }
    return y;
}
var zFunc = xFunc();
zFunc();
//Closures - End


//Callback functions - Start
function sum(b) {
    console.log(b);
}

function calc(n1, n2, sum) { //sum is a function which is passed as an argument to an another function which is calc in this case.
    var a = n1 + n2;
    sum(a);
}
calc(3, 5, sum);
//Callback functions - End


//Memoization - Start
function addNumbers() {
    var cache = {};
    return function (value) {
        if (value in cache) {
            console.log('Cached value has been returned');
            return cache[value];
        }
        else {
            console.log('Normal calculated value has been returned');
            cache[value] = value + 256;
            return cache[value];
        }
    }
}

var result = addNumbers();
result(20);
result(40);
result(20);
//Memoization - End

//Recursion in JS - Start
function computeSum(arr) {
    console.log(arr.pop());
    if (arr.length === 1) {
        return arr[0];
    }
    else {
        return arr.pop() + computeSum(arr);
    }
}
var sumValue = computeSum([7, 8, 9, 99]);
console.log(sumValue);
//Recursion in JS - End

//Understanding pop() function in Array - Start
var inputArr = [7, 8, 9, 99];
console.log(inputArr);
console.log(inputArr.pop());
//Understanding pop() function in Array - End

//Arrow function - Start
var arrowFunction = (num) => num * 89;
var r = arrowFunction(5);
console.log(r);
//Arrow function - End

//Spread operator - Start
function arrSpread(x, y, z) {
    console.log(x + y + z);
}

var arr = [1, 2, 3];
var arr2 = [4, 5, 6];
var arr3 = [...arr, ...arr2];
console.log(arr3);
arrSpread(...arr);
//Spread operator - End

//Rest Parameter - Start
function addition(a, ...args) {
    for (var i = 0; i < args.length; i++) {
        args[i] = a * args[i];
    }
    return args;
}

var finalValue = addition(5, 2, 3, 4);
console.log("finalValue: " + finalValue);
//Rest Parameter - End

//Promises - Start
//Basic Promise Implementation - Start
var allGood = true;
let p1 = new Promise((resolve, reject) => {
    if (!allGood) {
        reject(console.log('rejected the request...'));
    } else {
        resolve(console.log('resolved the request...'));
    }
})
p1.then().catch(err => {
    console.log(err);
});
//Basic Promise Implementation - End

//Returning promises - Promise Chaining - Start
var p2 = function (data) {
    return new Promise((resolve, reject) => {
        setTimeout(
            () => {
                console.log('Processing data...');
                resolve({ id: 1, message: 'nice work' });
            }, 2000);

    });
};

var p3 = function (data) {
    return new Promise((resolve, reject) => {
        setTimeout(
            () => {
                console.log('Processing data...');
                resolve({ id: 1, message: 'nice work' });
            }, 2000);

    });
};

var p4 = function (data) {
    return new Promise((resolve, reject) => {
        setTimeout(
            () => {
                console.log('Processing data...');
            }, 2000);

    });
};

//p2().then(p3).then(p4);
//Returning promises - Promise Chaining - End
//Promises - End


//Classes in JS - Start
//Method:1 -> Function constructor and using prototype keyword to create a method- Start
function Student(name, grade) {
    this.name = name;
    this.grade = grade;
}
Student.prototype.getDetails = function () {
    return `Name: ${this.name} Grade: ${this.grade}`;
}
let student = new Student('Prathap', 12);
console.log(student.getDetails());
//Method:1 - End

//Method:2 -> class & constructor keywords to create the class and defining the method inside the class 
//Only constructor and methods can be defined inside the class - Start
class Teacher {
    constructor(name, grade) {
        this.name = name;
        this.grade = grade;
    }
    getInfo() {
        return `Name is ${this.name} and doing ${this.grade}th`;
    }
}
let teacher = new Teacher('Prathap', 12);
console.log(teacher.getInfo());
//Method:2 -> class keyword to create the class and defining the method inside the class - End
//Classes in JS - End

//Generator function - Start
function* calculator() {
    var a = 2, b = 1, c;
    yield c = a + b;
    yield c = a - b;
    yield c = a * b;
    return c;
}
let calcValue = calculator();
console.log(calcValue.next());
console.log(calcValue.next());
console.log(calcValue.next());
console.log(calcValue.next());
//Generator function - End

//Object destructuring - Start
var obj1 = {
    name: 'Prathap',
    age: 28
};
var { name: myName, age: currentAge } = obj1;
console.log(myName + '---' + currentAge);

var arr1 = [1, 2, 3, 5];
var [one, two, three, five] = arr1;
console.log(one, two, three, five);
//Object destructuring - End


let xx = {}, yy = { name: "Ronny" }, zz = { name: "John" };

xx[yy] = { name: "Vivek" };
xx[zz] = { name: "Akki" };

console.log(xx[yy]);


















































































































































