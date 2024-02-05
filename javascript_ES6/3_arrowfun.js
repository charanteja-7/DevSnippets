/* Arrow functions
Arrow functions are a more concise syntax for writing function expressions. These function expressions make your code more readable, and more modern.  */

//basic function
function fun(){
    console.log('this is a basic function');
}

fun();//this is a basic function

//above function can be modified to arrow function with some changes

let arrow_fun = () => {
    console.log('this is a arrow_function');
}

arrow_fun();//this is a arrow_function

//if there is single statement we can write that like

let arrow_fun1 = () => console.log('this is a arrow_function1');
arrow_fun1();//this is a arrow_function1

//we can also pass arguments to it

let sum = (a,b) => console.log(a + b);
sum(70,5);//75


//important use of arrow function is it doesnt have its context

console.log(this)//window object

const shop ={
    price :100,
    purchase(){ //can also be written as purchase : function(){}
        console.log(this);
    }
}

shop.purchase();//arrow function contains parents context,which is very useful in DOM Manipulations

//lets better understand with DOM example
//for that refer index.html button with id="arrowfun"

let button = document.querySelector('#arrowfun');

const myshop = {
    price : 100,
    buy: function(){
        button.addEventListener('click' , function(){
            console.log(this);//here this is     <button id="arrowfun">arrow_function</button>
            console.log('I spent ' + this.price);
        })
    }
}

myshop.buy();//I spent undefined --> so we got this ,thats what the issue is
//we can solve this issue by adding self variable,or _this,we can put any name and assign this to it

const myshop1 = { //this is similar to the above code
    price : 100,
    buy: function(){
        let self = this;
        button.addEventListener('click' , function(){
            console.log(self);//here this is     <button id="arrowfun">arrow_function</button>
            console.log('I spent ' + self.price);
        })
    }
}

myshop1.buy(); //I spent 100 , so now we got the correct ans

//the other solution is using arrow function

const myshop2 = { //this is similar to the above code
    price : 100,
    buy: function(){//parent,here this is object
        button.addEventListener('click' , () => {
            console.log(this);//here this is     <button id="arrowfun">arrow_function</button>
            console.log('I spent ' + this.price);
        })
    }
}

myshop2.buy();//I spent 100 , we got the correct ans

//in final this uses the parent context when we use arrow function
