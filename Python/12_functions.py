#functions

#creating a function
def my_function():
    print("This is a fuction")

#calling a function
my_function()


#arguments
def sum(a,b):
 print(a+b)

sum(70,5)
sum(9,5)
sum(100,4234)


#arbitary arguments , *args

def function1(*fruits):
    print(fruits)
function1("apple","banana","cherry")


#keyword arguments,order doesn't matter

def function2(name3,name2,name1):
    print("Names are :"+name1,name2,name3)

function2(name1="jack",name2="jhon",name3="james")


#Arbitrary Keyword Arguments, **kwargs

def function3(**name):
    print("His last name is " + name["lname"])
function3(fname="jhon",lname="watson")

#default parameters

def function4(x,y=30):
    print(x,y)

function4(10)
function4(10,50)

#passing list as an argument

def function5(myList):
    for x in myList:
        print(x)
my_list = [10,20,30]
function5(my_list)

#positional

def function6(a, b, /, *, c, d):
  print(a + b + c + d)

function6(5, 6, c = 7, d = 8)

#lambda function

x = lambda a : a*a

print(x(5))
