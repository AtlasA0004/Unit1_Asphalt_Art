import org.code.neighborhood.*;

/*
*Creates the class MoonPainter as a subclass of PainterPlus
*Adds the moonStart and paintMoon methods
*Used to draw the cresent moon
*/

public class MoonPainter extends PainterPlus{
  
  /**
  *Moves the painter to the start of the moon
  *Starts from the original position
  *Ends at the top left of the moon facing east
  */
  public void moonStart(){
    for (int x= 0; x < 6; x++){
      move();
    }
  }


  /**
  *Paints the moon
  *Starts from the top left of the moon facing east
  *Ends one over from the bottom left of the moon facing west
  * Precondition: The painter is at the correct start position
  */
  public void paintMoon(){
    setPaint(138);

    //Row 1
    for (int x= 0; x < 4; x++){
      paint("blue");
      move();
    }

    //Row 2
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("blue");
    paintMove("blue");

    //Row 3
    turnLeft();
    move();
    turnLeft();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paint("blue");

    //Row 4
    turnRight();
    move();
    turnRight();
    move();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("blue");

    //Row 5
    turnLeft();
    move();
    turnLeft();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("blue");

    //Row 6
    turnRight();
    move();
    turnRight();
    move();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paint("blue");

    //Row 7
    move();
    turnLeft();
    move();
    turnLeft();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paint("blue");

    //Row 8
    turnRight();
    move();
    turnRight();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paint("blue");

    //Row 9
    turnLeft();
    move();
    turnLeft();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("blue");
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint("blue");

    //Row 10
    turnRight();
    move();
    turnRight();
    paintMove("blue");
    paintMove("blue");
    move();
    move();
    move();
    move();
    move();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paint("blue");

    //Row 11
    turnLeft();
    move();
    turnLeft();
    move();
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paint("white");

    //Row 12
    turnRight();
    move();
    turnRight();
    for (int x = 1; x<15; x++){
      paintMove("white");
    }
    paint("blue");

    //Row 13
    turnLeft();
    move();
    turnLeft();
    move();
    paintMove("blue");
    for (int x = 1; x<13; x++){
      paintMove("white");
    }
    paint("blue");

    //Row 14
    turnRight();
    move();
    turnRight();
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    for (int x = 1; x<10; x++){
      paintMove("white");
    }
    paint("blue");

    //Row 15
    turnLeft();
    move();
    turnLeft();
    move();
    paintMove("blue");
    paintMove("blue");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("white");
    paintMove("blue");
    paintMove("blue");
    paint("blue");

    //Row 16
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
    paintMove("blue");
  }
}