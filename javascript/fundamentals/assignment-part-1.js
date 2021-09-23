//Variable name conventions
/*let country = "India";
let continent = "Asia";
const population = 110000000;

console.log(country + " : " + continent + " : " + population);

let isIsland = true;
let language;

console.log("Data Type of Country: " + typeof (country));
console.log("Data Type of Continent: " + typeof (continent));
console.log("Data Type of Population: " + typeof (population));
console.log("Data Type of Island: " + typeof (isIsland));

language = "Tamil";
//population = 110000123;

console.log(country + " : " + continent + " : " + population);
*/


//Data Types in JavaScript
/*let javaScriptIsFun = true;
console.log("javaScriptIsFun: " + javaScriptIsFun);
console.log(typeof javaScriptIsFun)

javaScriptIsFun = 'YES!';
console.log("javaScriptIsFun value changed: " + typeof javaScriptIsFun);

let year;
console.log(year);
console.log(typeof year);

year = 1993;
console.log(year);
console.log(typeof year);

//This is a bug which has never corrected in JavaScript
console.log(typeof null);*/

//Math Operators
/*let age = 30;
age = 34;

const birthYear = 1993;
//birthYear = 1998;

console.log("Age: " + age);
console.log("BirthYear : " + birthYear);

const furtureYear = 2037;
const agePrathap = furtureYear - 1994;
const ageJesi = furtureYear - 1996;
console.log(agePrathap, ageJesi);

console.log(agePrathap * 3, ageJesi / 10, 2 ** 3);
// 2 ** 3 means 2 to the power of 3 i.e., 2*2*2

const firstName1 = "Prathap";
const lastName = "MV";
console.log(firstName1 + " " + lastName);

//Assignment Operators
let x = 10 + 5; //15 is the result
x += 10; //x = x + 10 = 25
x *= 4;
x++; //x = x + 1
x--;
x--;
console.log(x);

console.log(agePrathap > ageJesi); // > < => <=
console.log(agePrathap >= 44);

const isFullAge = furtureYear - 1993 > furtureYear - 1996;
console.log("Final value: " + isFullAge);*/


//Operator Precedence
/*const furtureYear = 2037;
const agePrathap = furtureYear - 1994;
const ageJesi = furtureYear - 1996;
console.log(furtureYear - 1994 > furtureYear - 1996);


let x, y;
x = y = 25 - 10 - 5;
console.log(x, y);

const averageAge = (agePrathap + ageJesi) / 2;
console.log(agePrathap, ageJesi, averageAge);*/

//////////////////////
//CODING CHALLENEGE #1 
//////////////////////
/*
Mark and John are trying to compare their BMI (Body Mass Index), which is
calculated using the formula:
BMI = mass / height ** 2 = mass / (height * height) (mass in kg
and height in meter).
Your tasks:
1. Store Mark's and John's mass and height in variables
2. Calculate both their BMIs using the formula (you can even implement both
versions)
3. Create a Boolean variable 'markHigherBMI' containing information about
whether Mark has a higher BMI than John.
Test data:
§ Data 1: Marks weights 78 kg and is 1.69 m tall. John weights 92 kg and is 1.95
m tall.
§ Data 2: Marks weights 95 kg and is 1.88 m tall. John weights 85 kg and is 1.76
m tall.
GOOD LUCK �
*/

/*let markWeight = 95;
let markHeight = 1.88;
let johnWeight = 85;
let johnHeight = 1.76;

let markBMI = markWeight / (markHeight * markHeight);
let johnBMI = johnWeight / (johnHeight * johnHeight);

let markHigherBMI = markBMI > johnBMI;

if (markHigherBMI) {
    console.log("Yes, Mark has higher BMI than John.");
} else {
    console.log("No, Mark doesn't have higher BMI than John.")
}*/

//String & template literals
/*const nameFirst = "Prathap";
const job = "teacher";
const birthYear = 1993;
const year = 2037;

const prathap = "I'm " + nameFirst + ", a " + (year - birthYear) + " years old " + job + "!";
console.log(prathap);

const prathapNew = `I'm ${nameFirst}, a ${year - birthYear} year old ${job}!`;
console.log(prathapNew);

console.log(`String with
multiple
lines`);*/

//IF ELSE LOOPING CONDITION
/*const age = 17;
const isOldEnough = age >= 18;

if (isOldEnough) {
    console.log("Sarah can start driving license😎");
} else {
    const yearsLeft = 18 - age;
    console.log(`Sarah is too young. Wait another ${yearsLeft} years👍`);
}

const birthYear = 2012;
let century;
if (birthYear <= 2000) {
    century = 20;
} else {
    century = 21;
}
console.log(century);*/


///////////////////////////////////
//CODING CHALLENGE #2
///////////////////////////////////

/*let markWeight = 95;
let markHeight = 1.88;
let johnWeight = 85;
let johnHeight = 1.76;

let markBMI = markWeight / (markHeight * markHeight);
let johnBMI = johnWeight / (johnHeight * johnHeight);

let markHigherBMI = markBMI > johnBMI;

if (markHigherBMI) {
    console.log(`Mark has more BMI than John with ${markBMI}`);
} else {
    console.log(`John has more BMI than Mark with ${johnBMI}`)
}*/


//TYPE CONVERSION
/*const inputYear = '1993';
console.log(Number(inputYear), inputYear);
console.log(Number(inputYear) + 18);

console.log(Number('Prathap'));
console.log(typeof NaN);

const num = 23;
console.log(String(num), num);

//TYPE COERCION
console.log(`I'm ` + 23 + " years old.");
console.log('23' - '10' - 3); //converts string to number as we've an arithmetic operation.
console.log('23' + '10' + 3); //converts number to string as we concatenate string using "+" symbol and so it takes advantage.
console.log('23' * '10'); //from here to next two console statements, it converts based on the possible mathematical outsomes.
console.log('23' / '10');
console.log('23' > '10');*/


//Truthy & Falsy Values
/*console.log(Boolean(0)); //false
console.log(Boolean(undefined)); //false
console.log(Boolean('Jonas')); //true
console.log(Boolean({})); //true
console.log(Boolean('')); //false

const money = 10;
if (money) {
    console.log("Don't spend it all...");
} else {
    console.log("You should get a job!!!")
}

let height = 0;
if (height) {
    console.log("YAY! Height is defined");
} else {
    console.log("OOPS! Height isn't defined");
}*/

/*
//Equality operators == and ===
const age = 18;
if (age === 18)
    console.log("You just became an adult");

if (age == '18')
    console.log("You just became an adult (loose)");

const favNum = Number(prompt("What's your fav number?"));

console.log(favNum, typeof favNum);

if (favNum === 23) {
    console.log("Cool! 23 is an amazing number.");
} else if (favNum === 7) {
    console.log("7 is good too.")
} else {
    console.log("Sorry not a fav number of 23 or 7:(")
}

if (favNum !== 23) {
    console.log("Why not 23??????");
}*/

/*
//Boolean Logic (Logical Operators)
const hasDriversLicense = true;
const hasGoodVision = true;

console.log(hasDriversLicense && hasGoodVision);
console.log(hasDriversLicense || hasGoodVision);
console.log(!hasGoodVision);

const shouldDrive = hasDriversLicense && hasGoodVision;

// if (hasDriversLicense || hasGoodVision) {
//     console.log("Sarah is able to drive!");
// } else {
//     console.log("Someone else can drive!");
// }

const isTired = false;
console.log(hasDriversLicense || hasGoodVision && isTired);

if (hasDriversLicense && hasGoodVision && !isTired) {
    console.log("Sarah is able to drive!");
} else {
    console.log("Someone else can drive!");
}*/


//Coding Challenge #3
/*
There are two gymnastics teams, Dolphins and Koalas. They compete against each
other 3 times. The winner with the highest average score wins a trophy!
Your tasks:
1. Calculate the average score for each team, using the test data below
2. Compare the team's average scores to determine the winner of the competition,
and print it to the console. Don't forget that there can be a draw, so test for that
as well (draw means they have the same average score)
3. Bonus 1: Include a requirement for a minimum score of 100. With this rule, a
team only wins if it has a higher score than the other team, and the same time a
score of at least 100 points. Hint: Use a logical operator to test for minimum
score, as well as multiple else-if blocks �
4. Bonus 2: Minimum score also applies to a draw! So a draw only happens when
both teams have the same score and both have a score greater or equal 100
points. Otherwise, no team wins the trophy
Test data:
§ Data 1: Dolphins score 96, 108 and 89. Koalas score 88, 91 and 110
§ Data Bonus 1: Dolphins score 97, 112 and 101. Koalas score 109, 95 and 123
§ Data Bonus 2: Dolphins score 97, 112 and 101. Koalas score 109, 95 and 106
GOOD LUCK �
*/

/*
//Task 1 - Calculating average scores for both the teams
console.log("TASK 1: Calculating average scores for both the teams");
let dolphinsAvg = (96 + 108 + 89) / 3;
let koalasAvg = (88 + 91 + 110) / 3;
console.log("dolphinsAvg: " + dolphinsAvg + " koalasAvg: " + koalasAvg);

//Task 2 - Evaluvating the winner of the competition
console.log("TASK 2: Evaluvating the winner of the competition");
console.log("dolphinsAvg: " + dolphinsAvg + " koalasAvg: " + koalasAvg);
if (dolphinsAvg > koalasAvg) {
    console.log("Dolphins team won the competition!!!")
} else if (koalasAvg > dolphinsAvg) {
    console.log("Koalas team won the competition!!!")
} else {
    console.log("Competition has been drawn due to the equal average scores by the teams!!!")
}

//Task 3 & 4 - Minimum of 100 score and >=100 scenario
console.log("TASK 3: Minimum of 100 score scenario");
dolphinsAvg = (97 + 112 + 101) / 3;
koalasAvg = (109 + 95 + 123) / 3;
console.log("dolphinsAvg: " + dolphinsAvg + " koalasAvg: " + koalasAvg);
if ((dolphinsAvg > koalasAvg) && (dolphinsAvg >= 100)) {
    console.log("Dolphins WON!!! Yes, it scored higher than Koalas and greater than 100");
} else if ((dolphinsAvg > koalasAvg) && (dolphinsAvg < 100)) {
    console.log("Dolphins LOST!!! It scored higher than Koalas but lesser average of below 100");
} else if ((koalasAvg > dolphinsAvg) && (koalasAvg >= 100)) {
    console.log("Koalas WON!!! Yes, it scored higher than Dolphins and greater than 100");
} else if ((koalasAvg > dolphinsAvg) && (koalasAvg < 100)) {
    console.log("Koalas LOST!!! It scored higher than Dolphins but lesser average of below 100");
} else {
    if ((koalasAvg >= 100) && (dolphinsAvg >= 100))
        console.log("Competition has been drawn due to the equal average scores by the teams!!!")
}*/
/*
const day = "sunday";

switch (day) {
    case 'monday':
        console.log("Plan course structure");
        console.log("Go to coding meetup");
        break;
    case 'tuesday':
        console.log("Prepare theory videos");
        break;
    case 'wednesday':
    case 'thursday':
        console.log("Write code examples");
        break;
    case 'friday':
        console.log("Record videos");
        break;
    case 'saturday':
    case 'sunday':
        console.log("Enjoy the weekend");
        break;
    default:
        console.log("Not a valid day");
}*/


//The above can be done in if-else also but then we prefering switch
//statement to avoid quicker execution and smart coding.


//Conditional(Ternary) Operator
/*const age = 23;
age >= 18 ? console.log("I like to drink wine🥂") :
    console.log("I like to drink water🥛")*/


/*Coding Challenge #4
Steven wants to build a very simple tip calculator for whenever
he goes eating in a restaurant. In his country, it's usual to
tip 15% if the bill value is between 50 and 300. If the value is
different, the tip is 20%.
Your tasks:
1. Calculate the tip, depending on the bill value. Create a variable
called 'tip' for this. It's not allowed to use an if/else
statement � (If it's easier for you, you can start with an if/else
statement, and then try to convert it to a ternary operator!)
2. Print a string to the console containing the bill value, the tip,
and the final value (bill + tip). Example: “The bill was 275,
the tip was 41.25, and the total value 316.25”
Test data:
§ Data 1: Test for bill values 275, 40 and 430
Hints:
§ To calculate 20% of a value, simply multiply it by 20/100 = 0.2
§ Value X is between 50 and 300, if it's >= 50 && <= 300 �
GOOD LUCK �*/

/*
//Task - 1
const bill = 430;
let tip = (bill >= 50 && bill <= 300) ? bill * (15 / 100) : bill * (20 / 100);
//console.log("Tips amount: " + tip)

//Task - 2
console.log("The bill was " + bill + ", the tip was " + tip + ", and the total value " + (bill + tip));*/







































































































































