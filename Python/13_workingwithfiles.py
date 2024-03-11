#This is used to write the content into the file
f =open("demofile.txt","w");
f.write("this is demo file")
f.close()

#This is used to append the text to the file
f = open("demofile.txt","a")
f.write(".Adding additional information")
f.close()

#This is used to read the file
f = open('demofile.txt','r')
print(f"Reading the file : {f.read()}")
f.close()

#This will read the lines in the file
f = open('demofile.txt','r')
print("Displaying data line by line")
for x in f:
    print(x)

#This will read first line
f = open('demofile.txt','r')
print(f.readline())

#opening the file using with...open 

with open("demofile.txt","r") as file1:
    read_content = file1.read()
print(read_content)
