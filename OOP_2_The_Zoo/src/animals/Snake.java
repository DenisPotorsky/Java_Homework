package animals;

public class Snake extends Animal {
    int bodyLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int numberOfLimbs, int bodyLength) {
        super(age, weight, numberOfLimbs);
        this.bodyLength = bodyLength;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }
    public String toString() {
        return "Snake: " + " age: " + age + " weight: " + weight;
    }
}
