#strings
print("strings")
print('strings')
a = "strings"
print(a)
#mutliline
a = """this is a multiline paragraph to demonstrate
the multiline strings,we can also use
three single quotes instead of double quotes"""
print(a)

print(a[5])
for x in "cherry":
    print(x)

print(len(a))
#cehck string
print("also" in a)

if "also" in a:
    print("yes, 'also' is present")

print("cherry" not in a)
#slicing
print(a[2:5])
print(a[:5])
print(a[123:])
b = "Hello, World!"
print(b[-5:-2])

b="cherry "
print(b.upper())
print(b.lower())
print(b.strip())
print(b.replace("y","ie"))
#concatenation
a = "Hello"
b = "World"
c = a + b
print(c)

#string format

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
#excape characters
txt = "We are the so-called \"Vikings\" from the north."
print(txt)

"""output
strings
strings
strings
this is a multiline paragraph to demonstrate
the multiline strings,we can also use
three single quotes instead of double quotes
i
c
h
e
r
r
y
127
True
yes, 'also' is present
True
is 
this 
otes
orl
CHERRY 
cherry 
cherry
cherrie 
HelloWorld
I want 3 pieces of item 567 for 49.95 dollars.
We are the so-called "Vikings" from the north.
"""
