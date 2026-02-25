/*
*Defines the PainterPlus as a subclass of Painter
*Adds the commands turnRight, moveFast and paintToEmpty
*Used to navigate and paint
  */
import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  /** 
  *Turns the painter 90 degrees to the right
  Used to decrease repetition of turnLeft(); statements
  */
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /**
  *Paints the current square a parameter color then moves forward one
  * Precondition: Painter has atleast 1 paint
  * @param color the color to paint
  */
  public void paintMove(String color){
    paint(color);
    move();
  }

  /**
  *Takes all of the paint from the bucket
  */
  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }

  /**
  *Moves the painter until it reaches an obstaical
  */
  public void moveFast(){
    while(canMove()){
      move();
    }
  }

  /**
  *Paints a parameter color then moves as long as the painter has paint
  * @param color The color to paint
  * Postcondition: the painter no longer has any paint
  */
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }

}