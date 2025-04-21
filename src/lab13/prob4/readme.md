a.
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
double dbl = sum(nums);

// Wildcard can add null only
nums.add(3.14);

```


b.
```java
List<Object> objs = new ArrayList<>();
objs.add(1);
objs.add("two");
List<? super Integer> ints = objs;
ints.add(3);

// Type missmatch List<? super Integer> and Collection<? extends Number>
double dbl = sum(ints);
```
