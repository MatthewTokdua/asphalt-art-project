import org.code.neighborhood.*;

/*
AsphaltPainter paints asphalt art in the Neighborhood
*/
public class AsphaltPainter extends MuralPainter {

  /*
  paints the entire asphalt art
  */
  public void paintAsphalt(String color, String color2, String color3) {
    moveToCircle();
    paintCircle(color);
    turnAround();
    resetPosition();
    moveToFirstInnerCircle();
    paintFirstInnerCircle(color2);
    resetPosition();
    moveToSecondInnerCircle();
    paintSecondInnerCircle(color3);
  }
  
  /*
  paints the main circle
  */
  public void paintCircle(String color) {
    paintTwoLinesLeft(color,10);
    paintTwoLinesRight(color,12);
    paintTwoLinesLeft(color,14);
    paintTwoLinesRight(color,16);
    paintTwoLinesLeft(color,18);
    paintTwoLinesRight(color,20);
    paintTwoLinesLeft(color,22);
    paintTwoLinesRight(color,24);
    paintTwoLinesLeft(color,26);
    move();
    paintTwoLinesRight(color,26);
    move();
    paintTwoLinesLeft(color,26);
    move();
    paintTwoLinesRight(color,26);
    move();
    paintTwoLinesLeft(color,26);
    move();
    paintTwoLinesRight(color,26);
    move();
    paintTwoLinesLeft(color,26);
    move();
    paintTwoLinesRight(color,26);
    move();
    paintTwoLinesLeft(color,26);
    move();
    move();
    paintTwoLinesRight(color,24);
    move();
    move();
    paintTwoLinesLeft(color,22);
    move();
    move();
    paintTwoLinesRight(color,20);
    move();
    move();
    paintTwoLinesLeft(color,18);
    move();
    move();
    paintTwoLinesRight(color,16);
    move();
    move();
    paintTwoLinesLeft(color,14);
    move();
    move();
    paintTwoLinesRight(color,12);
    move();
    move();
    paintTwoLinesLeft(color,10);
  }

  /*
  paints the first inner part of the circle
  */
  public void paintFirstInnerCircle(String color){
    paintTwoLinesLeft("fuchsia",9);
    paintTwoLinesRight(color,12);
    paintTwoLinesLeft(color,14);
    paintTwoLinesRight(color,16);
    paintTwoLinesLeft(color,18);
    paintTwoLinesRight(color,20);
    paintTwoLinesLeft(color,22);
    move();
    paintTwoLinesRight(color,22);
    move();
    paintTwoLinesLeft(color,22);
    move();
    paintTwoLinesRight(color,22);
    move();
    paintTwoLinesLeft(color,22);
    move();
    paintTwoLinesRight(color,22);
    move();
    paintTwoLinesLeft(color,22);
    move();
    paintTwoLinesRight(color,22);
    move();
    paintTwoLinesLeft(color,22);
    move();
    move();
    paintTwoLinesRight(color,20);
    move();
    move();
    paintTwoLinesLeft(color,18);
    move();
    move();
    paintTwoLinesRight(color,16);
    move();
    move();
    paintTwoLinesLeft(color,14);
    move();
    move();
    paintTwoLinesRight(color,12);
    move();
    move();
  }
  
  /*
  moves to the first inner circle
  */
  public void moveToFirstInnerCircle() {
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
  }
  
  /*
  moves to paint the main circle
  */
  public void moveToCircle() {
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
  }

  /*
  paints the second inner circle
  */
  public void paintSecondInnerCircle(String color) {
    paintTwoLinesLeft(color,10);
    paintTwoLinesRight(color,12);
    paintTwoLinesLeft(color,14);
    paintTwoLinesRight(color,16);
    paintTwoLinesLeft(color,18);
    move();
    paintTwoLinesRight(color,18);
    move();
    paintTwoLinesLeft(color,18);
    move();
    paintTwoLinesRight(color,18);
    move();
    paintTwoLinesLeft(color,18);
    move();
    paintTwoLinesRight(color,18);
    move();
    paintTwoLinesLeft(color,18);
    move();
    paintTwoLinesRight(color,18);
    move();
    paintTwoLinesLeft(color,18);
    move();
    move();
    paintTwoLinesRight(color,16);
    move();
    move();
    paintTwoLinesLeft(color,14);
    move();
    move();
    paintTwoLinesRight(color,12);
    move();
    move();
    paintTwoLinesLeft(color,10);
    move();
    move();
  }

  /*
  moves to the second inner circle
  */
  public void moveToSecondInnerCircle() {
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
  }






  
}