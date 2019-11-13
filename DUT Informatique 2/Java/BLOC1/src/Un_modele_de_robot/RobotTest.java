package Un_modele_de_robot;

import static org.junit.Assert.*;

public class RobotTest {
    @org.junit.Test
    public void RobotTest_CreationDirection_Up()
    {
        Robot r = new Robot();

        assertEquals("Up", r.getDirection());
    }

    @org.junit.Test
    public void RobotTest_CreationSpeed_null()
    {
        Robot r = new Robot();
        assertEquals(0, r.getSpeed());
    }

    @org.junit.Test
    public void RobotTest_Direction_TurnRight()
    {
        Robot r = new Robot();
        r.turnRight();
        assertEquals("Right", r.getDirection());
    }

    @org.junit.Test
    public void RobotTest_Direction_TurnLeft()
    {
        Robot r = new Robot();
        r.turnLeft();
        assertEquals("Left", r.getDirection());
    }

    @org.junit.Test
    public void RobotTest_Speed_Accelerate()
    {
        Robot r = new Robot();
        r.accelerate();
        assertEquals(1, r.getSpeed());
    }

    @org.junit.Test
    public void RobotTest_Speed_Decelerate()
    {
        Robot r = new Robot();
        r.decelerate();
        assertEquals(-1, r.getSpeed());
    }

    @org.junit.Test
    public void RobotTest_Speed_Stop()
    {
        Robot r = new Robot();
        r.accelerate();
        r.accelerate();
        r.stop();
        assertEquals(0, r.getSpeed());
    }
}