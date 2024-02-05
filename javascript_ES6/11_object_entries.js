/* Object Enteries
Object.entries() method is used to convert a single valued array into an array object with a key-value pair as array items. */


let array = ['cherry','banana','apple'];

let arr = array.entries();

for(let entry of arr){
    console.log(entry);
}

/* [ 0, 'cherry' ]
[ 1, 'banana' ]
[ 2, 'apple' ] */