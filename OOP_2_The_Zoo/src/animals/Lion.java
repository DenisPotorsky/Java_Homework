package animals;

public class Lion extends Animal {
    private int maneVolume;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";


    public Lion(int yearOfBirth, int weight, int numberOfLimbs, int maneVolume) {
        super(yearOfBirth, weight, numberOfLimbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
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
        return "Lion{" +
                "maneVolume=" + maneVolume +
                ", yearOfBirth=" + yearOfBirth +
                ", weight=" + weight +
                ", numberOfLimbs=" + numberOfLimbs +
                '}';
    }
}
