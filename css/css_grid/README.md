# css Grid

CSS Grid Layout is a powerful layout system that allows you to create complex grid-based layouts with ease. It provides a two-dimensional grid-based layout system, which means you can define both rows and columns to arrange elements in a grid. Here's an overview of some key concepts and properties in CSS Grid:
### Key Concepts:

1. **Grid Container:**
   - An element with `display: grid;` becomes a grid container. It establishes a new grid formatting context and contains grid items.

   ```css
   .grid-container {
     display: grid;
   }
   ```

2. **Grid Items:**
   - The children of a grid container are known as grid items.

   ```css
   .grid-item {
     grid-column: span 2;
   }
   ```

3. **Grid Lines:**
   - The horizontal and vertical lines that make up the grid.

   ```css
   .grid-container {
     grid-template-columns: 100px 200px 100px;
     grid-template-rows: auto;
   }
   ```

4. **Grid Tracks:**
   - The space between two adjacent grid lines.

   ```css
   .grid-container {
     grid-template-columns: 100px 200px 100px;
   }
   ```

5. **Grid Areas:**
   - Named areas within the grid.

   ```css
   .grid-item {
     grid-area: header;
   }
   ```

### Common CSS Grid Properties:

1. **`grid-template-rows` and `grid-template-columns`:**
   - Defines the size of rows and columns in the grid.

   ```css
   .grid-container {
     grid-template-rows: 100px auto;
     grid-template-columns: 1fr 2fr;
   }
   ```

2. **`grid-gap`:**
   - Specifies the size of the gap between rows and columns.

   ```css
   .grid-container {
     grid-gap: 10px;
   }
   ```

3. **`grid-column` and `grid-row`:**
   - Specifies the size and position of a grid item within the grid.

   ```css
   .grid-item {
     grid-column: 2 / span 3; /* Starts at column line 2 and spans 3 columns */
     grid-row: 1 / span 2; /* Starts at row line 1 and spans 2 rows */
   }
   ```

4. **`grid-template-areas`:**
   - Specifies named grid areas.

   ```css
   .grid-container {
     grid-template-areas:
       "header header"
       "main sidebar"
       "footer footer";
   }
   .grid-item {
     grid-area: header;
   }
   ```

5. **`justify-items` and `align-items`:**
   - Aligns grid items along the row and column axis.

   ```css
   .grid-container {
     justify-items: center; /* Aligns items along the column axis */
     align-items: center; /* Aligns items along the row axis */
   }
   ```
### After learning about grid we can make this cool looking gallery

[gallery preview](../assets/grid.png)

## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
