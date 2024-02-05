/* JavaScript Promise

JavaScript Promise are easy to manage when dealing with multiple asynchronous operations where callbacks can create callback hell leading to unmanageable code. Prior to promises events and callback functions were used but they had limited functionalities and created unmanageable code. Multiple callback functions would create callback hell that leads to unmanageable code. Promises are used to handle asynchronous operations in JavaScript. /
Syntax:

let promise = new Promise(function(resolve, reject){
     //do something
});

Parameters
The promise constructor takes only one argument which is a callback function
The callback function takes two arguments, resolve and reject
Perform operations inside the callback function and if everything went well then call resolve.
If desired operations do not go well then call reject.

A Promise has four states:
fulfilled: Action related to the promise succeeded
rejected: Action related to the promise failed
pending: Promise is still pending i.e. not fulfilled or rejected yet
settled: Promise has been fulfilled or rejected

*/



let login = new Promise(function(resolve, reject){
    let password = true;
    if(password === true){
        resolve('login successful');
    }
    else{
        reject('login failed');
    }
});


login.then((status)=>{
    console.log(status);
}).catch((error)=>{
    console.log(error);
})

