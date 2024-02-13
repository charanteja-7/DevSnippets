
#first program
#this is single line comment
"""creating a varible
    Python has no command for declaring a variable.
 A variable is created the moment you first assign a value to it.
 --by the way this the multilibe comment"""

x = 75
name = "charan"

print(x)
print(name)

#casting

x = str(75) # x will be '75'
y = int(74) # y wil be 74
z = float(72) # this is 72.0


print(x ,"|",y, "|",z)


#getting the type
x=75
y=75.0
z="charan"
p=3j

print(type(x))
print(type(y))
print(type(z))
print(type(p))


#string declaration
#below both are same

x='charan'
y="teja"

print(x)
print(y)


#case senstive

a = 75
A = 74
print(a,"|",A) #both will be diff 


#diff type of variable declaration

#camel case
myVaribleName = "charan"

#pascal case
MyVariableName = "charan"

#snake case

my_variable_name = "charan"



#multiple variables assigning

x,y,z = "charan", "Chakri","bhanu"

print(x ,"|",y, "|",z)

#one value to diff varibles

x=y=z = "charan"
print(x ,"|",y, "|",z)


#unpacking the collection

names = ["charan","teja","chukkala"]
x,y,z = names
print(x ,"|",y, "|",z)

#we can print variales using diff ways

#1.print(x)
#2.print(x,y)
#3.print(x+y) only when both are strings



"""75
charan
75 | 74 | 72.0
<class 'int'>
<class 'float'>
<class 'str'>
<class 'complex'>
charan
teja
75 | 74
charan | Chakri | bhanu
charan | charan | charan
charan | teja | chukkala"""
