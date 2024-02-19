#sets

myset = {"apple","banana","cherry","cherry"}
print(type(myset))
print(myset)
print(len(myset))
#constructor

thisset = set(("apple","banana","cherry"))
print(thisset)
#add
thisset.add("orange")
appendset = {"kiwi","pineapple"}
thisset.update(appendset)
print(thisset)
#we can add any iterable
#remove("item") - when item is missing it will raise error
#discord("item") - it will not rise error when item is not poresent
#pop()
#clear()
#del
#union method return a new set
#update will add elements to 1st set
set1 = {"a", "b" , "c"}
set2 = {1, 2, 3}

set3 = set1.union(set2)
print(set3)
#intersection_update - keep only the duplicates
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

x.intersection_update(y)

print(x)
#intersection() returns a new set which contains duplicates
#symmetric_difference_update() - keep unique elements
x = {"apple", "banana", "cherry"}
y = {"google", "microsoft", "apple"}

x.symmetric_difference_update(y)

print(x)

#symmetric_difference() - returns new set of unique elements
#issuperset()
#issubset()
#difference - returns values in 1st set that are not in 2nd set

'''output
<class 'set'>
{'banana', 'cherry', 'apple'}
3
{'banana', 'cherry', 'apple'}
{'banana', 'cherry', 'kiwi', 'apple', 'pineapple', 'orange'}
{'c', 1, 'a', 2, 'b', 3}
{'apple'}
{'banana', 'google', 'cherry', 'microsoft'}'''
