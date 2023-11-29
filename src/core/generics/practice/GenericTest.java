package core.generics.practice;

public class GenericTest {
    public static void main(String[] args) {

        //обычный объект
        Storage storage = new Storage();
        storage.setValue(12);
        int value = (Integer) storage.getValue();
        System.out.println(value);

        //компилятор не видит несоответствие типов
        //используем привидение типов
        storage.setValue(5.5);
        int value2 = (Integer) storage.getValue();
        System.out.println(value2);

        //используем дженерик
        StorageGeneric<Integer> storageGeneric = new StorageGeneric<>();
        storageGeneric.setValue(12);
        int num = storageGeneric.getValue();
    }
}
