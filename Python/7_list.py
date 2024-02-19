#lists


mylist =["apple","banana","cherry"]
print(type(mylist))
print("list is :",mylist)
#using lsit constructor

thislist = list(("apple","banana","cherry","kiwi","orange"))
print(thislist[1])
print(thislist[-1])
print(thislist[2:4])
print(thislist[2:])
print(thislist[:3])

if "cherry" in thislist:
    print("cherry is present in the list")

#override the value
thislist[1] = "pineapple"
print(thislist)

#insert
mylist.insert(1,"pineapple")
print(mylist)
#append
mylist.append("guava")
print(mylist)
#extend
mylist.extend(thislist)
print(mylist)
#remove
mylist.remove("banana")
print(mylist)
#pop with index
mylist.pop(5)
print(mylist)
#pop without index
mylist.pop()
print(mylist)
#del
del mylist[0]
print(mylist)
#clear
mylist.clear()
print(mylist)
#loop through the list
for x in thislist:
    print(x)
#loop through the index numbers
for i in range(len(thislist)):
    print(thislist[i])
#using while loop
i =0
while i < len(thislist):
    print(thislist[i])
    i = i+1
#shorthand "for"
[print(x) for x in thislist]
#list comprehension

newlist =[x for x in thislist if "a" in x]
#sort list
thislist.sort()
print(thislist)
#sort descending order
thislist.sort(reverse=True)
print(thislist)

'''OUTPUT
<class 'list'>
list is : ['apple', 'banana', 'cherry']
banana
orange
['cherry', 'kiwi']
['cherry', 'kiwi', 'orange']
['apple', 'banana', 'cherry']
cherry is present in the list
['apple', 'pineapple', 'cherry', 'kiwi', 'orange']
['apple', 'pineapple', 'banana', 'cherry']
['apple', 'pineapple', 'banana', 'cherry', 'guava']
['apple', 'pineapple', 'banana', 'cherry', 'guava', 'apple', 'pineapple', 'cherry', 'kiwi', 'orange']
['apple', 'pineapple', 'cherry', 'guava', 'apple', 'pineapple', 'cherry', 'kiwi', 'orange']
['apple', 'pineapple', 'cherry', 'guava', 'apple', 'cherry', 'kiwi', 'orange']
['apple', 'pineapple', 'cherry', 'guava', 'apple', 'cherry', 'kiwi']
['pineapple', 'cherry', 'guava', 'apple', 'cherry', 'kiwi']
[]
apple
pineapple
cherry
kiwi
orange
apple
pineapple
cherry
kiwi
orange
apple
pineapple
cherry
kiwi
orange
apple
pineapple
cherry
kiwi
orange
['apple', 'cherry', 'kiwi', 'orange', 'pineapple']
['pineapple', 'orange', 'kiwi', 'cherry', 'apple']
'''
