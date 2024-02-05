/* Default Parameters
In ES6, we can declare a function with a default parameter with a default value. */

//before es6

const register = (name,password,image) => {
    console.log(name,password,image);
}

register('myname','1234','photo.png');//myname 1234 photo.png

const register1 = (name,password,image) => {
    const img = image || 'test.png'; //additional statement
    console.log(name,password,img);
}

register1('myname1','12345');//what shall we do in this case -> we will add a statement in function

//after es6,we have liberty to declare paramenters

const register2 = (name,password,image = 'default.png') => {
    console.log(name,password,image); //myname1 12345 default.png
}

register2('myname1','12345');//if we doesnt pass the value it will take the default one