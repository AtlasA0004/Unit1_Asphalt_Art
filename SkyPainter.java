import org.code.neighborhood.*;

/*
*Defines SkyPainter as a subclass of PainterPlus
*Adds the paintSky method
* Used to paint the background and small stars
*/

public class SkyPainter extends PainterPlus{
  
  int rowNum = 1; //Varible used to place the stars and turn the correct way
  
 /**
  *Paint each row black exept for rows 5, 6 and 16, which have white stars
  Starts from the starting position
  Ends in the bottom left corner facing west
  * Precondition: The painter is at the correct start position
  */
  public void paintSky(){
    setPaint(256); //16^2 == 256
    
    while (hasPaint()){
      
      if (rowNum == 5){
        for (int x = 0; x < 8; x++){
         paintMove("black");
       }
        paintMove("white");
        for (int x = 0; x < 6; x++){
         paintMove("black");
       }
      }
        
      else if (rowNum == 6){
        paintMove("black");
        paintMove("white");
        for (int x = 0; x < 13; x++){
          paintMove("black");
       }
      }
        
      else if (rowNum == 15){
        paintMove("black");
        paintMove("white");
        for (int x = 0; x < 13; x++){
         paintMove("black");
       }
      }
        
      else{
        while (canMove()){
          paintMove("black");
        }}
        paint("black");
        if (rowNum < 16){ //Makes sure the painter does not go off screen
          if (rowNum % 2 == 1){ //allows the painter to turn the correct way
            turnRight();
            move();
            turnRight();
          }
          else{
            turnLeft();
            move();
            turnLeft();
          }
        }
        rowNum += 1; //Adds one to the row number
    }
  }
  
}