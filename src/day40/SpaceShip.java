package day40;

public class SpaceShip {

    String name;
    String currentDirection;
    int x ;
    int y ;

    // few behaviours:

//  setInitialPosition void ==> accept 2 int parameters to provide initial position o spaceship
    public void setInitialPosition(int newX, int newY){

       x = newX;
       y = newY;
    }

//    setDirection void method
//     ==> accept 1 String parameter to set the direction

    /**
     * accept 1 String parameter to set the direction to either up, down,right,left
     * @param newDirection
     */
    public void setDirection(String newDirection){

       if(newDirection.equals("up") || newDirection.equals("down") ||
               newDirection.equals("right") || newDirection.equals("left") ) {
           currentDirection = newDirection;
       } else {
           System.out.println("Invalid Direction");
           currentDirection = "";
       }
    }

// move1Block void method ==> no parameter, and change position according to direction
//  change the position according to the direction

    /**
     * move the spaceship to 1 block according to the current direction
     */
       public void move1Block(){

           switch (currentDirection){
               case "right":
                   x += 1;
                   break;
               case "left":
                   x -= 1;
                   break;
               case "up":
                   y += 1;
                   break;
               case "down":
                   y -= 1;
                   break;
               default:
                   break;
           }
    }

    //add a functionality to move1Block with direction provided in one shot

    public void move1Block(String newDirection){

           setDirection(newDirection);
           move1Block();
    }

//     toString method ==> return String representation of Spaceship Object

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
