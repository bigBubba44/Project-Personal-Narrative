import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image with a threshold filter
 */
public class ImageFilter extends ImagePlus {

  /*
   * Calls the superclass constructor to initialize pixels
   */
  public ImageFilter(String filename) {
    super(filename);
  }
  /*
   * Applies a negative filter to an image
   */
  public void Negative(int value) {
    
      Pixel[][] pixels = getPixelsFromImage();
    // 1. Traverse the 2D array of pixels
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < pixels[0].length; col++){
        // 2. Get current pixel
        Pixel currentPixel = pixels[row][col];

        int red = 255 - currentPixel.getRed();
        int blue = 255 - currentPixel.getBlue();
        int green = 255 - currentPixel.getGreen();

        currentPixel.setColor(new Color(red, green, blue));
      }
    }
   }
  /*
  *  Creates a filter of changing the pixel values to have a purple hue*/
  public void Purple(int value) {
    Pixel[][] pixels = getPixelsFromImage();
    // 1. Traverse the 2D array of pixels
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < pixels[0].length; col++){
        // 2. Get current pixel
        Pixel currentPixel = pixels[row][col];
        int red = currentPixel.getRed() + value;
        int green = currentPixel.getGreen() + value;
        int blue = currentPixel.getBlue() + value;

       red = Math.min(255, (int)(red * 1.0));
       green = Math.max(0, (int)(green * 0.6));
       blue = Math.max(0, (int)(blue * 0.6));

      currentPixel.setColor(new Color(red, green, blue));
      }
    }
  }
  public void colorShift(int value) {
    Pixel[][] pixels = getImagePixels();
    
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        int newRed = pixel.getRed() + value;
        int newGreen = pixel.getGreen() + value;
        int newBlue = pixel.getBlue() + value;

        if (newRed > 255) {
          newRed = 255;
        }

        if (newGreen > 255) {
          newGreen = 255;
        }

        if (newBlue > 255) {
          newBlue = 255;
        }
  
        pixel.setRed(newRed);
        pixel.setGreen(newGreen);
        pixel.setBlue(newBlue);
      }
    }
  }
}