a = 75
b = 74
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
else:
  print("a is greater than b")


#short hand if
if a>b:  print("a is greater than b")


#if..else

print('charan') if a > b else print('chakri')

#if elif and else short hand
print("A") if a > b else print("=") if a == b else print("B")


#nested if

x = 75
if x>20:
    print('greater than 20')
    if x > 50:
            print("greater than 50")
    else:
            print("less than 50")


"""a is greater than b
a is greater than b
charan
A
greater than 20
greater than 50
"""

#pass

a = 10
b  = 20
if a>b: pass
