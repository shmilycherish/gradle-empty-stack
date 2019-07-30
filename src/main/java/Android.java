public class Android extends Mobile {

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    protected int getMessageLimitation() {
        return 17;
    }

    protected String getMobileType() {
        return "<Android>";
    }
}
