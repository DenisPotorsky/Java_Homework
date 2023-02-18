package animals;

public abstract class Animal {
    protected int yearOfBirth;
    protected int weight;
    protected int numberOfLimbs;

    public Animal(int yearOfBirth, int weight, int numberOfLimbs) {
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.numberOfLimbs = numberOfLimbs;
    }

    public void feed(int foodWeight) {
        if (weight + foodWeight <= getMaxWeight()) {
            weight += foodWeight;
        } else {
            System.out.println("Max weight exceeded");
        }
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public abstract int getMaxWeight();

    public abstract String getType();
}
