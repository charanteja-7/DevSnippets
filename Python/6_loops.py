"""Python Loops
Python has two primitive loop commands:

while loops
for loops
"""
print('while')
#The while Loop
i = 1
while i < 6:
    print(i)
    i+=1

#The break Statement
#With the break statement we can stop the loop even if the while condition is true:
print('break')
i = 1
while i < 6:
  print(i)
  if i == 3:
    break
  i += 1
"""The continue Statement
With the continue statement we can stop the current iteration, and continue with the next:
"""
print('continue')
i = 0
while i < 6:
  i += 1
  if i == 3:
    continue
  print(i)

"""The else Statement
With the else statement we can run a block of code once when the condition no longer is true:
"""
print('else')
i = 1
while i < 6:
  print(i)
  i += 1
else:
  print("i is no longer less than 6")


"""while
1
2
3
4
5
break
1
2
3
continue
1
2
4
5
6
else
1
2
3
4
5
i is no longer less than 6
"""
