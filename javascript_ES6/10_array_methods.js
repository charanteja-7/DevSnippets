/* Array Methods
JavaScript Array.from():/ It will return a array from any object which is iterable and has the length property associated with it.

JavaScript Array.keys(): It returns an array of the iterator keys of the array.

JavaScript Array.find(): It will return the value of the first array element that matches or passes the condition of the passed function.

JavaScript Array.findIndex(): It will return the index of the first array element that matches or passes the condition of the passed function.
 */

//Array.from()
// become double of each elements.
console.log(Array.from([1, 2, 3],
    x => x + x));///[ 2, 4, 6 ]

let array = Array.from('fromdemo');
console.log(array);
/* [
    'f', 'r', 'o',
    'm', 'd', 'e',
    'm', 'o'
] */

//Array.keys()
let a = [1,2,3];
let iterator = a.keys();
for(let key of iterator){
    console.log(key); //0 1 2
}

//Array.find
let b =[1,2,3,4];
let found = b.find(function(e){
    return e>3;
})

console.log(found);//4

let foundIndex = b.findIndex(function(e){
    return e>3;
})

console.log(foundIndex);//3

function isOdd(element){
    return element%2 == 1;
}

console.log([4,5,6,7].findIndex(isOdd));//1