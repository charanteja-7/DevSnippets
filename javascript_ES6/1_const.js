// const
// The const keyword is used to declare constant variables whose values can’t be changed. It is an immutable variable except when used with objects.

const myname = 'myname';
console.log(myname);//myname

//try to change name
// myname = 'newname'; //uncomment during execution
console.log(myname);//TypeError: Assignment to constant variable.

//lets try with objects
const myobj = {
    name:'myname',
    age:21,
    address:'myaddress'
}

console.log(myobj);//{ name: 'myname', age: 21, address: 'myaddress' }

//changing address in myobj

myobj.address ='newaddress';

console.log(myobj);//{ name: 'myname', age: 21, address: 'newaddress' }