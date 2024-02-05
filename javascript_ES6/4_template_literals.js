/* Template literal
It allows us to use the JavaScript variables with the string without using the ‘+’ operator. Template literal defined using (``) quotes. */


//before using template literals

let firstname = 'first_name';
let lastname = 'last_name';
console.log(firstname + ' ' + lastname);//first_name last_name
console.log(firstname + '\n'+ lastname);//first_name (newline) last_name
//after template literals writing code became simple 

console.log(`hello ${firstname} ${lastname}`);//hello first_name last_name
console.log(`hello ${firstname} 
${lastname}`
);//hello first_name (newline) last_name

console.log(`${5 * 15}`);   


//enhanced object literals

//computed property keys
const value = 'name';

const product = {
    [value]:'myname',
    address : 'myaddress',
}

console.log(product);//{ name: 'myname', address: 'myaddress' }

//method definition shorthand
const product1 ={
    buy(){ //instead of buy : function{}
        console.log('bought');
    }
}

product1.buy();//bought
//property shorthand

let name ='myname'
let address ='myaddress'

const product3 ={
    name,
    address,
}

console.log(product3);//{ name: 'myname', address: 'myaddress' }