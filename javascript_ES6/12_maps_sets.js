/* JavaScript Maps and Sets
Map: The maps in JavaScript are used to store multiple items in the form of key-value pairs. The keys of a map can be of any datatype.

Set: A set consist of only unique value, a value can be stored only once in a set. It can store any value of any datatype. */

//sets

let myset = new Set([1,2,3,3]);
myset.add(1);
myset.add(5);

console.log(myset);//Set(4) { 1, 2, 3, 5 }

let array = [10,120,12,110,10];//to remove duplicates

const newarray = new Set(array);
console.log(newarray);//Set(4) { 10, 120, 12, 110 }

//maps

const mymap = new Map();

mymap.set('banana','fruit');
mymap.set('javascript','programming');
mymap.set('phone','electronic');


console.log(mymap);
/* Map(3) {
    'banana' => 'fruit',
    'javascript' => 'programming',
    'phone' => 'electronic'
 */

//map is used for fast lookups

for(const value of mymap){
    console.log(value);
}
/* [ 'banana', 'fruit' ]
[ 'javascript', 'programming' ]
[ 'phone', 'electronic' ] */
