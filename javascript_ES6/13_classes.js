/* Classes
ES6 introduced classes in JavaScript. Classes in javascript can be used to create new Objects with the help of a constructor, each class can only have one constructor inside it.  */

// before es6 we used constructor function

function Person(name){ //i took capital to represent it is constructor
    this.name = name;
}

const person1 =new Person('myname');
const person2 =new Person('yourname');

console.log(person1);//Person { name: 'myname' }
console.log(person2);//Person { name: 'yourname' }


//after es6

class Student{
    name;
    constructor(name){
        this.name = name;
    }
    task(){
        console.log('task completed');
    }
}

const student1 = new Student('student1');

console.log(student1);//Student { name: 'student1' }
student1.task();

