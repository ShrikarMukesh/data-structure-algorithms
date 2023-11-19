package com.graphs.faq;

import java.util.ArrayList;
import java.util.List;
/*
1. Don't provide setter methods: Since the class is immutable, there should be no setter methods that modify its state.

2. Make all mutable fields private: If any of the fields are mutable objects (e.g., collections or custom objects), ensure that they are private.
   This prevents external modification of the internal state.

3. Don't allow subclasses to override methods: To maintain the immutability, it's advisable to mark methods as final or use the final keyword for the class itself.
   This prevents subclasses from overriding methods and potentially modifying the class's behavior.

4. Return defensive copies: If the class contains references to mutable objects, ensure that you return defensive copies of those objects from methods
   instead of returning the original references. This prevents external code from modifying the internal state indirectly.
 */
public final class ImmutableClass {

    private final int field1;
    private final String field2;
    private final List<String> field3;

    public ImmutableClass(int field1, String field2, List<String> field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = new ArrayList<>(field3); // Defensive copy
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public List<String> getField3() {
        return new ArrayList<>(field3); // Defensive copy
    }
}
