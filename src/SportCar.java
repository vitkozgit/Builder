public class SportCar {
    //We have a lot of different parameters

    //Obligatory parameters
    String brand;
    int id;

    // Not obligatory parameters
    String color;
    String owner;
    boolean isUsed;
    double weight;
    int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.brand = builder.brand;
        this.id = builder.id;
        this.color = builder.color;
        this.owner = builder.owner;
        this.isUsed = builder.isUsed;
        this.weight = builder.weight;
        this.maxSpeed = builder.maxSpeed;
    }

    static class Builder {
        //Obligatory parameters
        String brand;
        int id;

        // Not obligatory parameters
        String color;
        String owner;
        boolean isUsed;
        double weight;
        int maxSpeed;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setUsed(boolean used) {
            isUsed = used;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder(String brand, int id) {
            this.brand = brand;
            this.id = id;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}
