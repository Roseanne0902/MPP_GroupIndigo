# Problem 1A

---

## Runnable r = () -> { ... }`
```java
i. Runnable r = () →
{
    int[][] products = new int[s][t];
    for (int i = 0; i < s; i++) {
        for(int j = i + 1; j < t; j++) {
         products[i][j] = i * j;
        }
    }
}
```
### Parameters:
- `()` → No parameters

### Free Variables:
- `s` and `t` are not declared inside the lambda but are used:

int[][] products = new int[s][t];  -> s and t come from outside

**Free variables**: s, t

---

## ii. Comparator<String> comp = (s, t) -> { ... }

```java
Comparator<String> comp = (s, t) →
{   
    if(ignoreCase == true) {
        return s.compareToIgnoreCase(t);
    } else {
        return s.compareTo(t);
    }
}
```

### Parameters:
- (s, t) → Both are lambda parameters

### Free Variables:
- ignoreCase is not defined in the lambda, but used in:

if (ignoreCase == true)

Free variable: ignoreCase