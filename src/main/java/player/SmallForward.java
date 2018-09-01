package player;

import java.text.ParseException;

public class PointGuard extends Player{


    public PointGuard(String name, String lastName, String dateOfBirth, double shot3, double shot2, double shot1, double rebound, double pass, double block, double steal) throws ParseException {
        super(name, lastName, dateOfBirth, shot3, shot2, shot1, rebound, pass, block, steal);
    }
}
