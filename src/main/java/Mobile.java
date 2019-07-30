public class Mobile {
    public static final int MESSAGE_LIMITATION_LENGTH = Integer.MAX_VALUE;
    private final String name;
    private final String color;
    private final String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        if (message.length() > getMessageLimitation()) {
            System.out.println(String.format("%s Message cannot be sent", getMobileType()));
        } else {
            System.out.println(String.format("%sMessage : %s", getMobileType(), message));
        }
    }

    protected int getMessageLimitation() {
        return MESSAGE_LIMITATION_LENGTH;
    }

    protected String getMobileType() {
        return "";
    }

    public void printBasicInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("name: %s, color: %s, brand: %s", this.name, this.color, this.brand);
    }
}
