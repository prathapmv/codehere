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

console.log(age1);

//Function Expression
//Asynonyms function
const calcAge2 = function (birthYear) {
    return 2037 - birthYear;
}

//Arrow function
const calcAge3 = birthYear => 2037 - birthYear;
const age3 = calcAge3(1993);
console.log(age3);

const yearsUntilRetirement = (birthYear, firstName) => {
    const age = 2037 - birthYear;
    const retirement = 65 - age;
    return `${firstName} retires in ${retirement}`;
}

console.log(yearsUntilRetirement(1993, 'Prathap'));
console.log(yearsUntilRetirement(1996, 'Prasanth'));

































































































































































