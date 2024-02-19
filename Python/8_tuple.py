#tuple
mytuple = ("apple","banana","cherry")
print(type(mytuple))
print(tuple)
print(len(mytuple))
#constructor
thistuple = tuple(("apple","banana","cherry"))
print(thistuple)
print(thistuple[1])
print(thistuple[1:2])
#we cannot add elements to tuple but with help of list lets add elements to tuple
thislist = list(thistuple)
thislist[1] = "kiwi"
thistuple = tuple(thislist)
print(thistuple)
#append
# we are allowed to add tuples
y = ("orange",)
thistuple += y
print(thistuple)
#we cannot remove the tuple elements ,lets use list to do so
z = list(thistuple)
z.remove("cherry")
thistuple = tuple(z)
print(thistuple)

#delete the tuple
del mytuple
#print(thistuple)#this will give an error
#unpacking
fruits = ("apple","banana","cherry","orange","pineapple")

(green,yellow,*red) = fruits # we usign * to make rest of elements as list

print(green,yellow,red)

#looping is similar to list

#count()
print(thistuple.count("apple"))
print(thistuple.index("orange"))


'''output
<class 'tuple'>
<class 'tuple'>
3
('apple', 'banana', 'cherry')
banana
('banana',)
('apple', 'kiwi', 'cherry')
('apple', 'kiwi', 'cherry', 'orange')
('apple', 'kiwi', 'orange')
apple banana ['cherry', 'orange', 'pineapple']
1
2'''
