import org.junit.Test;

public class IPhoneRobotTest {
    @Test
    public void ShouldIPhoneRobotOnlyCouldUsingIPhone() {
        IPhone iPhone = new IPhone("iphone 6", "red", "iPhone");
        IPhoneRobot iPhoneRobot = new IPhoneRobot(iPhone);
    }
}
