/* JavaScript for…of Loop
JavaScript for…of statement iterates over the values of an iterable object (like Array, Map, Set, arguments object, …,etc), executing statements for each value of the object.

JavaScript for…of loop makes it easy to loop through the elements without needing to handle the index or iteration logic which makes the code short and easier to understand./

Syntax:
for ( variable of iterableObjectName) {
   // code block to be executed
}
*/
//printing array elements
let arr = [1,2,3,4,5];

for(let value of arr){
    console.log(value);
}
//printing string characters
let name = 'javascript';

for(let char of name){
    console.log(char);
}

//arguments

function display(){
    for(let value of arguments){
        console.log(value);
    }
}

display("cherry","apple","banana");

//for--of on maps

let mapping = new Map([
    ['banana',1],
    ['cherry',2],
    ['apple',3],

]);

for(let entry of mapping){
    console.log(entry);
}

for(let [key,value] of mapping){
    console.log(key,value);
}

//on objects
let myobj = {
    name:'myname',
    age:21,
    address:'myaddress',

}
/* for(let entry of myobj){
    console.log(entry);
} this will give you error, we need to convert the obj into interable lets see how*/

for(let entry of Object.entries(myobj)){
    console.log(entry);
}