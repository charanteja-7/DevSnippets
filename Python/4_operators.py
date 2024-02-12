"""Python divides the operators in the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Identity operators
Membership operators
Bitwise operators"""

#Python Arithmetic Operators
print("arithmetic operators")
print('+,',5+7)
print('-,',5-7)
print('*,',5*7)
print('/,',5/7)
print('%,',5%7)
print('**,',5**7)
print('//,',5//7)

#Python Assignment Operators

print("assignment operators")

x = 5
print('=,',x)


x = 5
x += 3
print('+=,',x)



x = 5
x -= 3
print('-=,',x)



x = 5
x *= 3
print('*=,',x)




x = 5
x /= 3
print('/=,',x)


x = 5
x %= 3
print('%=,',x)




x = 5
x //= 3
print('+=,',x)


x = 5
x **= 3
print('**=,',x)



x = 5
x &= 3
print('&=,',x)



x = 5
x |= 3
print('|=,',x)




x = 5
x ^= 3
print('^=,',x)





x = 5
x >>= 3
print('>>=,',x)



x = 5
x <<= 3
print('<<=,',x)


#Python Comparison Operators
print("Comparison  operators")
x=5
y=7

print(x==y)
print(x!=y)
print(x>y)
print(x<y)
print(x>=y)
print(x<=y)



x = 5

print(x > 3 and x < 10)

print(x < 3 or x < 10)

print(not(x > 3 and x < 10))

#Python Identity Operators
x=5
y=7
print("identity operators")
print(x is y)
print(x is not y)


#Python Membership Operators

print("Membership operators")
x = ["apple", "banana"]

print("banana" in x)
print("banana" not in x)

#Python Bitwise Operators
print("bitwise operators")
x=5
y=7
print(x&y)
print(x|y)
print(x^y)
print(~y)
print(x>>y)
print(x<<y)


"""arithmetic operators
+, 12
-, -2
*, 35
/, 0.7142857142857143
%, 5
**, 78125
//, 0
assignment operators
=, 5
+=, 8
-=, 2
*=, 15
/=, 1.6666666666666667
%=, 2
+=, 1
**=, 125
&=, 1
|=, 7
^=, 6
>>=, 0
<<=, 40
Comparison  operators
False
True
False
True
False
True
True
True
False
identity operators
False
True
Membership operators
True
False
bitwise operators
5
7
2
-8
0
640"""
