# CS5700 Shapes Library
#### Practicing the principles of abstraction and modularity. I have designed and built a library of shapes, written unit tests, and ensured that the library meets all specifications.

### Objectives:
- Implement a system that follows the principles of abstraction, encapsulation, and modularity. 
- Become familiar with conceptual modelling using UML.
- Become familiar with the basics of unit testing.
- Learn Kotlin

### Requirements:
##### Remember that the goal is building a library not a program with a main function for the purpose of this software the term 'user' refers to any program using your shapes library
UML (40 pts)
- 1.1 Completion of a conceptual model using UML first before writing any code.
- 1.2 UML diagram should include all classes and should correctly model their relationships, attributes, and methods.
- Be sure to indicate which methods are public or private (all attributes should be private).
  
### Implementation 
##### The library should include implementations for the following shapes (40 pts) 
- 2.1 Point
  - 2.1.1 A point should have x and y attributes, these should be Doubles.
  - 2.1.2 A user should be able to the get the x and y attributes.
  - 2.1.3 A user should be able to clone a point (get a new point with the same attributes).
  - 2.1.4 A user should be able to move a point by a delta in each axis.
- 2.2 Line
  - 2.2.1 A line consists of 2 points and cannot have 0 length
  - 2.2.2 A user should be able to get the points that define the line (you might consider strongly encapsulating the points)
  - 2.2.3 A user should be able the get the slope of the line
  - 2.2.4 A user should be able to get the length of the line
  - 2.2.5 A user should be able to move a line
- 2.3 Rectangle
  - 2.3.1 Represent a rectangle, with 2 points
  - 2.3.2 A rectangle cannot have 0 width or height A user should be able to get the attributes that define a rectangle (the points)
  - 2.3.3 A user should be able to get the area of the rectangle A user should be able to move a rectangle.
- 2.4 Square
  - 2.4.1 All of the same requirements for Rectangle only width and height must be identical
- 2.5 Ellipse
  - 2.5.1 An ellipse should be represented by a point and 2 radii.
  - 2.5.2 An ellipse cannot have an area of 0 A user should be able to get the attributes that define the ellipse.
  - 2.5.3 A user should be able to get the area of an ellipse
  - 2.5.4 A user should be able to move an ellipse
- 2.6 Circle
  - 2.6.1 All of the same requirement for ellipse
  - 2.6.2 Only the 2 radii are the same.
- 2.7 Triangle
  - 2.7.1 A triangle can either be made up of lines or points (again, points are easier I think)
  - 2.7.2 A triangle must not have an area of 0 (this occurs when all 3 points are on the same line)
  - 2.7.3 A user should be able to get the attributes the define the triangle
  - 2.7.4 A user should be able to get the area of the triangle
  - 2.7.5 A user should be able to move a triangle

### Unit Tests 
##### Tests for Each Section (40 points) 
- Executable unit test cases should give reasonable assurances that the system is working correctly.
- Executable unit test cases should have high coverage in terms of code path.
