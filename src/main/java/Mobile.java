public class Mobile {
    private final String name;
    private final String color;
    private final String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        System.out.println(String.format("Message : %s", message));
    }

    public void printBasicInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("name: %s, color: %s, brand: %s", this.name, this.color, this.brand);
    }
}
