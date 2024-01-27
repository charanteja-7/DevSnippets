# CSS POSITION

The position property in CSS is used to specify the positioning method of an element within its containing element. The position property can take several values, each affecting the positioning of the element differently. 
The `position` property in CSS is used to specify the positioning method of an element within its containing element. The `position` property can take several values, each affecting the positioning of the element differently. Here are the main values for the `position` property:

1. **`static`:**
   - The default value. Elements with `position: static;` are positioned according to the normal flow of the document. This means they will appear in the order they are written in the HTML, without any special positioning.

   ```css
   div {
     position: static;
   }
   ```

2. **`relative`:**
   - The element is positioned relative to its normal position. It can be shifted using properties like `top`, `right`, `bottom`, and `left`, but it will still occupy space in the normal flow.

   ```css
   div {
     position: relative;
     top: 10px;
     left: 20px;
   }
   ```

3. **`absolute`:**
   - The element is positioned relative to its nearest positioned (not `static`) ancestor or to the containing block. If there is no positioned ancestor, it is placed relative to the initial containing block (usually the viewport).

   ```css
   div {
     position: absolute;
     top: 50px;
     left: 100px;
   }
   ```

4. **`fixed`:**
   - The element is positioned relative to the viewport (the browser window). It will stay fixed even when the page is scrolled.

   ```css
   div {
     position: fixed;
     top: 20px;
     right: 20px;
   }
   ```

5. **`sticky`:**
   - The element is treated as `relative` positioned until it crosses a specified point during scrolling. Then it is treated as `fixed` positioned.

   ```css
   div {
     position: sticky;
     top: 20px;
   }
   ```

The `position` property is often used in conjunction with other positioning and layout properties, such as `top`, `right`, `bottom`, `left`, `z-index`, and others, to achieve the desired layout effect.


## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
