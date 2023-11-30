package core.lambda;

public class SortRedApples implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("Red");
    }
}
