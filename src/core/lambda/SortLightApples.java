package core.lambda;

public class SortLightApples implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 100;
    }
}
