package turtle;

import static turtle.Direction.*;


public class Turtle {
    private Position position = new Position(0, 0);
    private Direction direction = EAST;
    private static boolean penIsUp = true;

        public static boolean penIsUp(){
            return penIsUp;
        }
        public  void penDown(){
            penIsUp = false;
        }
        public  void penUp(){
            penIsUp = true;

        }
        public Direction getCurrentDirection(){
            return direction;
        }
        public void turnRight(){
            if (direction== SOUTH) direction = WEST;
            if (direction == EAST) direction = SOUTH;

        }
    }

