#In this we will learn about the data types

""" str,int,float,comples,list,tuple,range,dict,set,frozenset,bool,bytes,bytearray
memorview,nonetype"""

#string

x="charan"
print(x,type(x))

x = 75
print(x,type(x))

x=75.75
print(x,type(x))

x=75j
print(x,type(x))

x=["cherry","apple","banana"]
print(x,type(x))

x=("cherry","apple","banana")
print(x,type(x))

x = range(5)
print(x,type(x))

x={"cherry","apple","banana"}
print(x,type(x))

x={"name":"cherry","age":21}
print(x,type(x))

x=frozenset({"cherry","apple","banana"})
print(x,type(x))

x=True
print(x,type(x))

x=b"charan"
print(x,type(x))

x=bytearray(5)
print(x,type(x))

x=memoryview(bytes(5))
print(x,type(x))

x=None
print(x,type(x))

import random
print(random.randrange(0,75))

"""charan <class 'str'>
75 <class 'int'>
75.75 <class 'float'>
75j <class 'complex'>
['cherry', 'apple', 'banana'] <class 'list'>
('cherry', 'apple', 'banana') <class 'tuple'>
range(0, 5) <class 'range'>
{'apple', 'banana', 'cherry'} <class 'set'>
{'name': 'cherry', 'age': 21} <class 'dict'>
frozenset({'apple', 'banana', 'cherry'}) <class 'frozenset'>
True <class 'bool'>
b'charan' <class 'bytes'>
bytearray(b'\x00\x00\x00\x00\x00') <class 'bytearray'>
<memory at 0x00000214B2C1FB80> <class 'memoryview'>
None <class 'NoneType'>
52"""
