package vaadin;

public class Car {

    private double weight;
    private double speed;
    private Long ownerId;
    private String name;

    public Car(double weight, double speed, Long ownerId, String name) {
        this.weight = weight;
        this.speed = speed;
        this.ownerId = ownerId;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", ownerId=" + ownerId +
                ", name='" + name + '\'' +
                '}';
    }
}
