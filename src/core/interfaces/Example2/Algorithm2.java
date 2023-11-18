package core.interfaces.Example2;

public class Algorithm2 implements Encoding, Decoding {
    @Override
    public void encode() {
        System.out.println("Encode with Algorithm2");
    }

    @Override
    public void decode() {
        System.out.println("Decode with Algorithm2");
    }
}
