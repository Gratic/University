package Un_modele_de_robot;

public class Robot {
    private int speed;
    private String direction;

    public Robot() {
        speed = 0;
        direction = "Up";
    }

    public void turnRight()
    {
        switch (getDirection())
        {
            case "Up":
                setDirection("Right");
                break;
            case "Right":
                setDirection("Down");
                break;
            case "Down":
                setDirection("Left");
                break;
            default:
            case "Left":
                setDirection("Up");
                break;
        }
    }

    public void turnLeft()
    {
        switch (getDirection())
        {
            case "Up":
                setDirection("Left");
                break;
            case "Left":
                setDirection("Down");
                break;
            case "Down":
                setDirection("Right");
                break;
            default:
            case "Right":
                setDirection("Up");
                break;
        }
    }

    public void accelerate()
    {
        setSpeed(getSpeed() + 1);
    }

    public void decelerate()
    {
        setSpeed(getSpeed() - 1);
    }

    public void stop()
    {
        setSpeed(0);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
