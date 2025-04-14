### Explain

List contains function use Object.hashCode.
Then need to override Employee hashCode function so equals object have same hash.

```java
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
```