package core.interfaces.Example2;

public class Algorithm1 implements Encoding, Decoding {
    @Override
    public void encode() {
        System.out.println("Encode with Algorithm1");
    }

    @Override
    public void decode() {
        System.out.println("Decode with Algorithm1");
    }
}
