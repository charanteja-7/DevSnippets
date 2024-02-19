thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(type(thisdict))
print(thisdict)
print(thisdict["brand"])
print(len(thisdict))
x = thisdict.get("model")
print(x)
x = thisdict.keys()
print(x)
#adding new pair
thisdict["color"] = "white"

print(x)
x = thisdict.values()
print(x)
thisdict["year"] = 2018
print(x)
thisdict.update({"year": 2020})
print(x)
#pop
thisdict.pop("model")
print(x)
thisdict.popitem()
print(x)
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
del thisdict["model"]
print(thisdict)
thisdict.clear()
#looping
for x in thisdict:
  print(x)
for x in thisdict.values():
  print(x)
for x in thisdict.keys():
  print(x)
for x, y in thisdict.items():
  print(x, y)
#copy(), using constructor
'''output
<class 'dict'>
{'brand': 'Ford', 'model': 'Mustang', 'year': 1964}
Ford
3
Mustang
dict_keys(['brand', 'model', 'year'])
dict_keys(['brand', 'model', 'year', 'color'])
dict_values(['Ford', 'Mustang', 1964, 'white'])
dict_values(['Ford', 'Mustang', 2018, 'white'])
dict_values(['Ford', 'Mustang', 2020, 'white'])
dict_values(['Ford', 2020, 'white'])
dict_values(['Ford', 2020])
{'brand': 'Ford', 'year': 1964}
'''
