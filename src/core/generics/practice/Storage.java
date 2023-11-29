package core.generics.practice;

public class Storage {
    private Object value;

    public Storage() {
    }

    public Storage(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
