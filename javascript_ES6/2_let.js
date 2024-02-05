/* let
The let variables are mutable i.e. their values can be changed. It works similar to the var keyword with some key differences like scoping which makes it a better option when compared to var. */

let myname = 'myname';//global declaration
console.log(myname);//myname

function print(){
    let address = 'myaddress';//local declaration
    console.log(myname);//myname
    console.log(address);//myaddress
}
console.log(myname);//myname
console.log(address);//ReferenceError: address is not defined
print();