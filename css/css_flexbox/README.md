# CSS FLEXBOX

The CSS Flexible Box Layout, commonly known as Flexbox, is a layout model that allows you to design complex layouts more efficiently and with less code than traditional models. Flexbox is well-suited for designing both simple and complex structures along a single axis (row or column) with the ability to create responsive and dynamic layouts.
### Key Concepts:

1. **Flex Container:**
   - An element with `display: flex;` or `display: inline-flex;` becomes a flex container. It establishes a new flex formatting context and contains flex items.

   ```css
   .flex-container {
     display: flex;
   }
   ```

2. **Flex Items:**
   - The children of a flex container are known as flex items. They automatically become flexible boxes.

   ```css
   .flex-item {
     flex: 1;
   }
   ```

3. **Main Axis and Cross Axis:**
   - Flexbox has a main axis (horizontal or vertical) and a cross axis (perpendicular to the main axis). Properties like `flex-direction` and `justify-content` control the main axis, while `align-items` and `align-self` control the cross axis.

   ```css
   .flex-container {
     flex-direction: row; /* Main axis is horizontal (default) */
     justify-content: space-between; /* Align items along the main axis */
     align-items: center; /* Align items along the cross axis */
   }
   ```

### Common Flexbox Properties:

1. **`flex-direction`:**
   - Specifies the direction of the main axis.
   - Values: `row` (default), `row-reverse`, `column`, `column-reverse`.

   ```css
   .flex-container {
     flex-direction: column; /* Main axis is vertical */
   }
   ```

2. **`justify-content`:**
   - Defines how the browser distributes space between and around content items along the main axis.
   - Values: `flex-start` (default), `flex-end`, `center`, `space-between`, `space-around`, `space-evenly`.

   ```css
   .flex-container {
     justify-content: space-around; /* Space around content items along the main axis */
   }
   ```

3. **`align-items`:**
   - Specifies the alignment of items along the cross axis.
   - Values: `stretch` (default), `flex-start`, `flex-end`, `center`, `baseline`.

   ```css
   .flex-container {
     align-items: center; /* Center items along the cross axis */
   }
   ```

4. **`flex`:**
   - A shorthand property for `flex-grow`, `flex-shrink`, and `flex-basis`.
   - Values: `flex-grow flex-shrink flex-basis`.

   ```css
   .flex-item {
     flex: 1; /* Flex-grow: 1, Flex-shrink: 1, Flex-basis: 0% */
   }
   ```

5. **`align-self`:**
   - Overrides the `align-items` value for a single flex item.
   - Values: Same as `align-items`.

   ```css
   .flex-item {
     align-self: flex-end; /* Align this item to the end along the cross axis */
   }
   ```

Flexbox provides a powerful and efficient way to create flexible layouts in CSS. The combination of these properties allows you to achieve various design patterns and handle different screen sizes with ease.
## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
