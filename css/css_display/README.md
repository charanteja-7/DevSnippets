# CSS DISPLAY

The display property in CSS is used to define the rendering behavior of an element. It determines how an element generates boxes and how those boxes participate in the layout of the document. 


**`1.block`:**
   - The element generates a block-level box. It starts on a new line and stretches the full width of its containing element.

   ```css
   div {
     display: block;
   }
   ```

**`2.inline`:**
   - The element generates an inline-level box. It does not start on a new line, and it only takes up as much width as necessary.

   ```css
   span {
     display: inline;
   }
   ```

 **`3.inline-block`:**
   - The element generates an inline-level box, but it behaves as a block-level box regarding its layout. It allows setting width and height properties.

   ```css
   img {
     display: inline-block;
   }
   ```

 **`4.none`:**
   - The element is completely removed from the layout. It does not take up any space, and its content is hidden.

   ```css
   .hidden {
     display: none;
   }
   ```

**`5.flex`:**
   - The element becomes a flex container, and its children become flex items. It introduces a flex formatting context.

   ```css
   .flex-container {
     display: flex;
   }
   ```

 **`6.grid`:**
   - The element becomes a grid container, and its children become grid items. It introduces a grid formatting context.

   ```css
   .grid-container {
     display: grid;
   }
   ```

**`7.inline-flex` and `inline-grid`:**
   - Similar to `flex` and `grid`, but the container is inline-level.

   ```css
   .inline-flex-container {
     display: inline-flex;
   }

   .inline-grid-container {
     display: inline-grid;
   }
   ```

 **`8.table`, `table-row`, `table-cell`:**
   - These values are used for creating table layouts.

   ```css
   .table {
     display: table;
   }

   .table-row {
     display: table-row;
   }

   .table-cell {
     display: table-cell;
   }
   ```

These are just a few examples of the `display` property values. The choice of `display` affects the layout behavior and positioning of elements in your HTML document. Choosing the appropriate `display` value is essential for achieving the desired layout and styling effects.
## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
