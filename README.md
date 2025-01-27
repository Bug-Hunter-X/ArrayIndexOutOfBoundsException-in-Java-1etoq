# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element outside its valid range.  The `bugSolution.java` file shows the corrected code.

This exception is frequently encountered when working with arrays, especially when using loops or manual index calculations.  It's crucial to ensure that your index values always remain within the bounds of the array to avoid this error.

## How to Reproduce the Bug

1. Compile and run `bug.java`.
2. Observe the `ArrayIndexOutOfBoundsException` being thrown.

## Solution

The `bugSolution.java` file provides a corrected version of the code, ensuring that array access is always within the valid bounds.