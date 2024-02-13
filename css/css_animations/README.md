# CSS animations

CSS animations allow you to create dynamic and visually appealing effects on web pages. You can use keyframes to define the animation's behavior over a set of frames. Here's an overview of how you can create CSS animations:

### Basic Animation Example:

```css
@keyframes slideIn {
  from {
    transform: translateX(-100%);
  }
  to {
    transform: translateX(0);
  }
}

.slide-in {
  animation: slideIn 1s ease-out; /* Animation name, duration, and timing function */
}
```

In this example:

- `@keyframes` defines a set of frames for the animation named `slideIn`.
- `from` and `to` specify the starting and ending states of the animation.
- The `.slide-in` class applies the animation, specifying the name (`slideIn`), duration (1 second), and timing function (`ease-out`).

### Animation Properties:

1. **`animation-name`:**
   - Specifies the name of the keyframes rule.
  
2. **`animation-duration`:**
   - Specifies the duration of the animation.

3. **`animation-timing-function`:**
   - Specifies the timing function for the animation (e.g., `ease`, `linear`, `ease-in-out`).

4. **`animation-delay`:**
   - Specifies a delay before the animation starts.

5. **`animation-iteration-count`:**
   - Specifies the number of times the animation should run (e.g., `infinite`).

6. **`animation-direction`:**
   - Specifies whether the animation should play in reverse (`reverse`), alternate back and forth (`alternate`), or both (`alternate-reverse`).

7. **`animation-fill-mode`:**
   - Specifies how the animation should apply styles before and after its execution (e.g., `forwards`, `backwards`).

## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)
