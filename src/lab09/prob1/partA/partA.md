### Java’s ArrayList implements 6 interfaces and extends one class. What are they?

#### One extends class
- AbstractList - Provides a implementation of the List interface.

#### 6 interfaces
- List - Defines a sequence of elements, allowing duplicates and indexed access.
- RandomAccess - Indicates efficient random access to elements.
- Cloneable - Allows creating a shallow copy of the ArrayList.
- Serializable - Enables serialization of the ArrayList.
- Iterable - Allows iteration over elements using a foreach loop or iterator.
- Collection - Provides general collection operations like adding, removing, and checking elements.