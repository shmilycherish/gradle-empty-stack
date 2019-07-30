public class Person {
    private final String name;
    private final Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void call(String message) {
        mobile.call(message);
    }
}
