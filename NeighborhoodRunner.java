/*
*Paints a cresent moon with large and small stars on a 16*16 grid
*Uses 3 subclasses of painter plus
*/


import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  //Creates a painter for each class
  SkyPainter sky = new SkyPainter();
  StarPainter star = new StarPainter();
  MoonPainter moon = new MoonPainter();

  sky.paintSky(); //The background and white stars

  star.starStart();
  star.paintStars(); //The large yellow stars

  moon.moonStart();
  moon.paintMoon(); //The moon
    
  }
}