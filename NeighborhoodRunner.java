import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  
  //instansiates AsphaltPainter
  AsphaltPainter john = new AsphaltPainter();
  
  //instantiates a mural painter to paint the background
  MuralPainter bob = new MuralPainter();
    
    //bob paints the background
    bob.paintBackground("black",32);
    
    //john paints on the asphalt
    john.paintAsphalt("fuchsia","purple","black");
  }
}