/* Rest parameter and spread operator
Rest Parameter: It is used to represent a number of parameter in an array to pass them together to a function.
Spread Operator: It simply changes an array of n elements into a list of n different elements.
*/

//spread (...)
//array copy
const arr1 = ['apple','banana','cherry'];
const arr2 =[...arr1];
console.log(arr2);//this is how we can copy 

//similary we can copy object also 

const obj1 = {
    name : 'name',
    address : 'address',
    age :21,
}

//const obj2 = obj1;//we don't want this because both have same reference
//console.log(obj2 === obj1);//true

const obj2 = {...obj1,clg:'cvr'};//we are copying obj1 and also adding extra key in obj2
// const obj2 = {...obj1,age:22}; we can also override tha values like this
console.log(obj2);//{ name: 'name', address: 'address', age: 21, clg: 'cvr' }
//it is a shallow copy , we would unable to copy entire obj. if it contains inner methods

//Rest (...)

const addItems =(...items) =>{
    console.log(items);
};

addItems(1,2,3,4,5);