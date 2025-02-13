import org.code.theater.*;
import org.code.media.*;
public class TheaterRunner {
  public static void main(String[] args) {
    /* 
    *  2D arrays of captions, each row is a section of the story
    *  and each column is the caption for each image in the section
    */
    Scene images = new Scene();
    MyStory scene = new MyStory();

    // Images go here
    
    ImageFilter Porsche901 = new ImageFilter("901.jpg");
    ImageFilter Porsche930 = new ImageFilter("930.jpg");
    ImageFilter Porsche964 = new ImageFilter("964.jpg");
    ImageFilter Porsche993 = new ImageFilter("993.jpg");
    ImageFilter Porsche996 = new ImageFilter("996.jpeg");
    ImageFilter Porsche997 = new ImageFilter("997.jpeg");
    ImageFilter Porsche991 = new ImageFilter("991.jpg");
    ImageFilter Porsche992 = new ImageFilter("992.jpeg");
   
  // Images of the Porsche 901 with the negative filter (First 911/ pre 911)
    images.drawImage(Porsche901, 0, 75, 400);
    images.pause(1);
    Porsche901.Negative(150);
    images.drawImage(Porsche901, 0, 75, 400);
    images.pause(1);
 // Changes the background color to a purple color (My favorite color)
    images.clear("purple");
    images.pause(1);
 // Images of the different variations of Porsche 911 over the years(930, 964, 993, 996)(Personal Favorites)
    images.drawImage(Porsche930, 25, 50, 350);
    images.pause(1);
    images.drawImage( Porsche964, 25, 0, 350, 25);
    images.pause(1);
    images.drawImage(Porsche993, 30, 50, 350, -25);
    images.pause(1);
    images.drawImage(Porsche996, 30, 100, 350, 20);
    images.pause(1);
    images.clear("purple");
    images.pause(1);
  //Image of a 997 911 variant with the colorShift filter effect applied (2000s Porsche)
    images.drawImage(Porsche997, 0, 75, 400);
    images.pause(1);
    Porsche997.colorShift(50);
    images.drawImage(Porsche997, 0, 75, 400);
    images.pause(1);
    images.clear("purple");
    images.pause(1);
  // Image of the 991 GT3 with a guassian blue filter effect applied (Porsche from a few years ago)
    images.drawImage(Porsche991, 0, 50, 400);
    images.pause(1);
    // guassian blur filter
    images.clear("purple");
  // Image of the 992 Porsche 911 using the purple filter effect applied (Latest Porsche 911)
    images.drawImage(Porsche992, 0, 0, 350);
    images.pause(1);
    Porsche991.Purple(50);
    images.drawImage(Porsche992 , 0, 0, 400);
    Theater.playScenes(images);   
  }
}