### Explain

List contain function use Object.equals.

```java

    int indexOfRange(Object o, int start, int end) {
        Object[] es = elementData;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
```    

Need to override equals function in Employee class

```java
    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) ob;
        return e.name.equals(name) && e.salary == salary;
    }
```
