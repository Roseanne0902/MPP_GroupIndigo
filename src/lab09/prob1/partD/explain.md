### Explain

This source code has problem where EmployeeInfo.removeDuplicates
change Employee **visited** value.

After change Employee object become difference object.
New duplicate value is allowed to add to NoDuplicate HashMap

#### Solution 1: remove setVisited part
```java
tracker.get(e).setVisited(true);
```

#### Solution 2: remove compare visited value in equals() and hashCode() function