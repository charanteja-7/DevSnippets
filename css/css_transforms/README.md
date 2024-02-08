# CSS transform
The `transform` property in CSS is used to apply various transformations to an element, such as rotating, scaling, skewing, and translating. It allows you to modify the appearance and layout of elements without changing the document flow. Here's an overview of common transformations using the `transform` property:

### Basic Transformations:

1. **Translate:**
   - Moves an element along the x and y-axis.

   ```css
   .translate-example {
     transform: translate(50px, 20px);
   }
   ```

2. **Rotate:**
   - Rotates an element by a specified angle in degrees.

   ```css
   .rotate-example {
     transform: rotate(45deg);
   }
   ```

3. **Scale:**
   - Scales an element in terms of width and height.

   ```css
   .scale-example {
     transform: scale(1.5, 0.8);
   }
   ```

4. **Skew:**
   - Skews an element along the x and y-axis.

   ```css
   .skew-example {
     transform: skew(20deg, 10deg);
   }
   ```

### Combined Transformations:

You can combine multiple transformations in a single rule:

```css
.combined-example {
  transform: translate(50px, 20px) rotate(45deg) scale(1.5, 0.8) skew(20deg, 10deg);
}
```

### Transition with Transform:

You can also apply transitions to create smooth animations between different states:

```css
.transition-example {
  transition: transform 0.5s ease-in-out;
}

.transition-example:hover {
  transform: scale(1.2);
}
```


## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
