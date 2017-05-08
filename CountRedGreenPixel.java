/**
 *
 */
package de.tutorials;
 
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
 
import javax.imageio.ImageIO;
 
/**
 * @author daritho
 *
 */
public class CountRedGreenPixel {
  
  /**
  * @param args
  */
  public static void main(String[] args) throws Exception {
    BufferedImage image = ImageIO.read(new File("c:/rgb.bmp"));
    int redCnt = 0;
    int greenCnt = 0;
    int blueCnt = 0;
    for (int x = 0, maxX = image.getWidth(); x < maxX; x++) {
      for (int y = 0, maxY = image.getHeight(); y < maxY; y++) {
        int rgb = image.getRGB(y, x);
        
        Color c = new Color(rgb);
        if (c.getRed() > 0) {
          redCnt++;
        }
        
        if (c.getGreen() > 0) {
          greenCnt++;
        }
        
        if (c.getBlue() > 0) {
          blueCnt++;
        }
      }
    }
    
    System.out.printf(
    "RedCnt: %s, GreenCnt: %s, BlueCnt: %s\n",
    redCnt,
    greenCnt,
    blueCnt);
  }
}