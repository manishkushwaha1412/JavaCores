package vaadin;

public class Result {

    private Car car;
    private Owner owner;

    public Result(Car car, Owner owner) {
        this.car = car;
        this.owner = owner;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Result{" +
                "car=" + car +
                ", owner=" + owner +
                '}';
    }
}
