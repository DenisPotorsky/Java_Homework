package animals;

public class Wolf extends Animal {
    public Wolf(int yearOfBirth, int weight, int numberOfLimbs) {
        super(yearOfBirth, weight, numberOfLimbs);
    }

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    public String getType() {
        return TYPE;
    }
}
