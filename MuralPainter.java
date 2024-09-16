import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    for (int count = 0; count < spaces; count++) {
      paint(color);
      
      if (canMove()) {
        move();
      }
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

  /*
  moves the MuralPainter to the middle of the workspace
  */
  public void moveToMiddle(Integer x,Integer y) {
    while (getX() < x/2) {
      if (getDirection() == "east"){
        move();
      }else turnLeft();
    }
    while (getY() < y/2) {
      if (getDirection() == "south"){
        move();
      }else turnLeft();
    }
  }

  /*
  paints in a diagonal line right
  */
  public void paintDiagonalRight(String color, int spaces){
    for (int count = 0; count < spaces; count++){
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      turnRight();
    }
  }

  /*
  paints in a diagonal line left
  */
  public void paintDiagonalLeft(String color, int spaces){
    for (int count = 0; count < spaces; count++){
      paint(color);
      move();
      turnRight();
      move();
      paint(color);
      turnLeft();
    }
  }

  public void paintTwoLinesLeft(String color, int spaces){
    paintLine(color,spaces);
    turnRight();
    move();
    turnRight();
  }
  public void paintTwoLinesRight(String color, int spaces){
    paintLine(color,spaces);
    turnLeft();
    move();
    turnLeft();
  }
}