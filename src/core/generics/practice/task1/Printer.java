package core.generics.practice.task1;

public class Printer<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void printValue() {
        System.out.println("Value is " + value);
    }

    void refresh() {
        value = null;
    }
}
