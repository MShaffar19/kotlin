// JAVAC_EXPECTED_FILE
// FILE: A.java

abstract public class A extends java.util.ArrayList<String> {
    public final int size() { return 0; }
}

// FILE: main.kt

class B : A() {
    override val size: Int = 1
}
