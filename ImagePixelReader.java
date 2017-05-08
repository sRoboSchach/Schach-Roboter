/**
 *
 */
package de.turoials;
 
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
 
import javax.imageio.ImageIO;
 
/**
 * @author Darimont
 */
public class ImagePixelReader {
  
  /**
  * @param args
  */
  public static void main(String[] args) throws Exception {
    BufferedImage img = ImageIO.read(new File("c:/winter.jpg"));
    
    //Pixelfarbe an stelle x=100, y=50
    int rgb = img.getRGB(100, 50);
    Color c = new Color(rgb);
    System.out.println("Red: " + c.getRed());
    System.out.println("Green: " + c.getGreen());
    System.out.println("Blue: " + c.getBlue());
  }
}