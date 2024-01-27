# CSS Units

In CSS, units are used to measure and define various properties, such as length, width, font size, and more. Here are some common units used in CSS:


## 1.Pixels (px):

- Represents a fixed-size length unit.
- One pixel is a single dot on the screen.
- Commonly used for specifying border widths, padding, and font sizes.
- Fixed-size units that may not scale well on different screen sizes.
```bash
div {
  width: 200px;
  font-size: 16px;
}
```
## Viewport Width (vw):

- Represents a percentage of the viewport's width.
- 1vw is equal to 1% of the viewport width.
- Useful for creating responsive layouts based on the screen width.
```bash
header {
  width: 50vw; /* 50% of the viewport width */
}
```
## Viewport Height (vh):

- Represents a percentage of the viewport's height.
- 1vh is equal to 1% of the viewport height.
- Useful for creating responsive layouts based on the screen height.
```bash
section {
  height: 80vh; /* 80% of the viewport height */
}
```
## Percentage (%):

- Represents a percentage of the parent element's size.
- Commonly used for creating fluid and responsive layouts.
```bash
p {
  width: 50%; /* 50% of the parent element's width */
}
```
## Ems (em):

- Represents the calculated font-size of the element.
- Relative to the font-size of the parent element.
- Can compound, meaning 1.5em is 1.5 times the parent's font-size.
```bash
p {
  font-size: 1.2em; /* 1.2 times the parent element's font-size */
}
```
## Root Ems (rem):

- Similar to em but relative to the font-size of the root element (html).
- Useful for maintaining consistent scaling across the entire document.
```bash
body {
  font-size: 16px; /* Set a base font size for the entire document */
}
article {
  font-size: 1.5rem; /* 1.5 times the root font size */
}
```

## Support

For assistance, please reach out via email at chukkalacharanteja9@gmail.com.

Follow me on Instagram: [@_charan_teja7](https://www.instagram.com/_charan_teja7/)

Connect with me on LinkedIn: [Charan Teja](https://www.linkedin.com/in/charanteja177/)



