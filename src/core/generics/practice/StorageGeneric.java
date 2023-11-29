package core.generics.practice;

public class StorageGeneric <T> {
    private T value;
    public StorageGeneric() {
    }

    public StorageGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
