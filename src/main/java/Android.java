public class Android extends Mobile {

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        System.out.println(String.format("<Android>Message : %s", message));
    }
}
