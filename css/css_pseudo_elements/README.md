# CSS pseudo-elements and pseudo-classes
CSS pseudo-elements and pseudo-classes are selectors that allow you to style specific parts of an element or select elements based on their state or position in the document. Here's an overview of both:

### Pseudo-Elements:

Pseudo-elements target a specific part of an element, such as the first line or first letter of a block-level element. They are denoted by a double colon `::` before the element they are styling.

1. **`::before` and `::after`:**
   - These pseudo-elements allow you to insert content before or after an element's actual content.

   ```css
   p::before {
     content: "Prefix: ";
   }

   p::after {
     content: " (Suffix)";
   }
   ```

2. **`::first-line` and `::first-letter`:**
   - `::first-line` targets the first line of a block-level element.
   - `::first-letter` targets the first letter of a block-level element.

   ```css
   p::first-line {
     font-weight: bold;
   }

   p::first-letter {
     font-size: 150%;
   }
   ```

### Pseudo-Classes:

Pseudo-classes select elements based on their state or position in the document. They are denoted by a single colon `:` before the class name.

1. **`:hover`, `:active`, and `:focus`:**
   - These pseudo-classes target elements based on user interaction.
   
   ```css
   a:hover {
     color: #e74c3c; /* Change color on hover */
   }

   button:active {
     background-color: #3498db; /* Change background color when clicked */
   }

   input:focus {
     border: 2px solid #2ecc71; /* Highlight input when focused */
   }
   ```

2. **`:nth-child()` and `:nth-of-type()`:**
   - These pseudo-classes allow you to select elements based on their position in a parent.

   ```css
   li:nth-child(odd) {
     background-color: #ecf0f1; /* Style odd-numbered list items */
   }

   div:nth-of-type(2n) {
     color: #f39c12; /* Style every second div */
   }
   ```

3. **`:not()`:**
   - This pseudo-class selects elements that do not match a given selector.

   ```css
   input:not([type="submit"]) {
     border: 1px solid #3498db; /* Style input elements that are not submit buttons */
   }
   ```

4. **`:last-child` and `:first-child`:**
   - These pseudo-classes select the last and first child elements, respectively.

   ```css
   li:last-child {
     font-weight: bold; /* Style the last list item */
   }

   p:first-child {
     font-style: italic; /* Style the first paragraph */
   }
   ```

These are just a few examples of pseudo-elements and pseudo-classes. They provide a powerful way to target and style specific parts of your HTML document based on various conditions. Keep in mind that browser support may vary for some pseudo-elements and pseudo-classes.
## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
