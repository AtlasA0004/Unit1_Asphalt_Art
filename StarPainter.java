import org.code.neighborhood.*;
/*
*Creates the class StarPainter as a subclass of PainterPlus
*Adds the starStart, paintStar, and paintStars methods
*Used to draw the 3 large yellow stars
  */

public class StarPainter extends PainterPlus{


  /*
  *Move the painter to the first star
  Starts from the origanal position
  Ends on the left point of the first star facing East
  */
  public void starStart(){
    turnRight();
    move();
    turnLeft();
  }

  /*
  *Paints a yellow star
  *Starts on the left point facing east
  Ends on the right poin facing east
  */
  public void paintStar(){
    setPaint(5);
    paintMove("yellow");
    paint("yellow");
    turnLeft();
    move();
    paint("yellow");
    turnRight();
    turnRight();
    move();
    move();
    paint("yellow");
    turnLeft();
    move();
    turnLeft();
    move();
    paint("yellow");
    turnRight();
    
  }

  /*
  * Paints all of the yellow stars
  *Starts on the left point of the first star facing east
  *Ends on the right point of the third star facing east
  */
  public void paintStars(){
    
    paintStar(); //Star 1
    
    for (int x = 0; x < 10; x++){
      move();
    }
    turnRight();
    move();
    turnLeft();
    
    paintStar(); //Star 2

    turnRight();
    for (int y = 0; y < 5; y++){
      move();
    }
    turnRight();
    for (int z = 0; z < 4; z++){
      move();
    }
    turnLeft();
    turnLeft();

    paintStar(); //Star 3
  }
}