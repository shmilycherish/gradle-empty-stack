public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    protected int getMessageLimitation() {
        return 14;
    }

    protected String getMobileType() {
        return "<iPhone>";
    }
}
