package core.generics.practice.task2;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair() {
    }

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    A getFirst() {
        return first;
    }

    void setA(A first) {
        this.first = first;
    }

    B getSecond() {
        return second;
    }

    void setB(B second) {
        this.second = second;
    }
}
