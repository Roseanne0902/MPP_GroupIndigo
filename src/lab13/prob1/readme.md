a.

```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);

//  List<Integer> is not subclass of List<Number>
List<Number> nums = ints;
nums.add(3.14);
```

b.
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
// Wildcard can add null only
//  nums.add(3.14);
nums.add(null);
```