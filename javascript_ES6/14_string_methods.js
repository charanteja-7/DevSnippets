/* String Methods
JavaScript startsWith(): This method will return true only if the testing string starts with the passed or specified string.
JavaScript endsWith(): This mthod will return true, if the string ends with the passes or specified string value.
JavaScript includes(): It will return true, if the testing string contains the specified or passes value. */

// String startsWith()
const useStart = "This string implements the startsWith() method.";
console.log(useStart.startsWith("This string"), 
useStart.startsWith("This is"));

// String endsWith()
const useEnd = "This string implements the endsWith() method.";
console.log(useEnd.endsWith("clear() method."), 
useEnd.endsWith("method."));

// String includes()
const useIncludes = "This string implements the includes() method.";
console.log(useIncludes.includes("includes()"), 
useIncludes.includes("My name"));


/* true false
false true
true false */