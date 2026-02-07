Core Math Library (OOP Implementation)
======================================

Project Overview
----------------
This project is a modular Core Math Library designed using Object-Oriented Programming (OOP) principles. It demonstrates the use of Inheritance, Encapsulation, and Polymorphism to organize mathematical operations into a logical class hierarchy.

Class Hierarchy
---------------

Level 1: The Base Class (Parent)
--------------------------------
MathOperation
- Role: Acts as the foundation for all math categories.
- Key Responsibility: Encapsulation. Protects the 'result' variable (private) to ensure data integrity and provides secure access via Setters/Getters.

Level 2: The Category Classes (Children)
----------------------------------------
1. ArithmeticOperation (Extends MathOperation)
   - Role: Manages operations that require two numerical inputs.
   - Responsibility: Centralizes the storage of 'operand1' and 'operand2' to prevent code duplication.

2. GeometryOperation (Extends MathOperation)
   - Role: Manages shape-based calculations.
   - Responsibility: Provides validation logic to ensure shape dimensions (like radius or length) are never negative.

3. NumberAnalysis (Extends MathOperation)
   - Role: Manages operations that analyze a single integer.
   - Responsibility: Handles the storage and retrieval of the single 'number' input.

Level 3: Supported Operations (Methods)
---------------------------------------
The following tools are implemented within their respective category classes:

Arithmetic Tools:
- Addition, Subtraction, Multiplication.
- Division: Includes specific error handling for "Division by Zero" (sets result to 0.0 on error).

Geometry Tools:
- Circle: Calculates Area.
- Rectangle: Calculates Area.

Number Analysis Tools:
- PrimeCheck: Determines if a number is prime using an optimized loop.
- Factorial: Calculates the factorial (uses 'long' to handle large numbers).
