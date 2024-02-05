// Object Destructuring
const college = {
	name : 'cvr',
	est : '2001',
	isPvt : true
};
let {name, est, isPvt} = college;
console.log(name, est, isPvt);
//we can use alias name also
// let {name : firstname, est, isPvt} = college;
// console.log(firstname, est, isPvt);

// Array Destructuring
const arr = ['apple', 'banana', 'cherry'];
let[value1,value2,value3] = arr;
console.log(value1, value2, value3);
