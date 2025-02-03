import org.code.theater.*;
import org.code.media.*;

public class Filter extends ImagePlus {

public Filter(String filename) {
  super(filename);
}

  public void makeNegative() {
  
      Pixel[][] pixels = getPixelsFromImage();

     /*
      * Goes through the 2D array of pixels and uses each of the values and subtracts it by the current number.
      */
     for (int row = 0; row < pixels.length; row++) {
       for (int col = 0; col < pixels[0].length; col++) {
         Pixel currentPixel = pixels[row][col];

         int currentRed = currentPixel.getRed();
         int currentGreen = currentPixel.getGreen();
         int currentBlue = currentPixel.getBlue();


         int newRed = 255 -  currentRed;
         int newGreen = 255 - currentGreen;
         int newBlue = 255 - currentBlue;

         currentPixel.setRed(newRed);
         currentPixel.setGreen(newGreen);
         currentPixel.setBlue(newBlue);
       }
     }
   }

  public void threshold(int value) {
   
 
   Pixel[][] pixels = getPixelsFromImage(); 

   /*
    * This filter turns every color found in the image either white or black based on the RGB values. 
    */
  
   int average = 0; 

   for (int row = 0; row < pixels.length; row++) {
         for (int col = 0; col < pixels[0].length; col++) {
           Pixel currentPixel = pixels[row][col];

           average = (int)(currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue()) / 3; 

           if (average < value) {
             currentPixel.setColor(Color.BLACK);
           } else {
             currentPixel.setColor(Color.WHITE); 
           }
         }
      }
   }


  public void makeSlightlyNegative() {
  
      Pixel[][] pixels = getPixelsFromImage();

     /*
      * Goes through the 2D array of pixels and uses each of the values and subtracts it by the current number.
      */
     for (int row = 0; row < pixels.length; row++) {
       for (int col = 0; col < pixels[0].length; col++) {
         Pixel currentPixel = pixels[row][col];

         int currentRed = currentPixel.getRed();
         int currentGreen = currentPixel.getGreen();
         int currentBlue = currentPixel.getBlue();


         int newRed = 50 -  currentRed;
         int newGreen = 50 - currentGreen;
         int newBlue = 50 - currentBlue;

         currentPixel.setRed(newRed);
         currentPixel.setGreen(newGreen);
         currentPixel.setBlue(newBlue);
       }
     }
   }

   public void thresholdBlueAndGreen(int value) {
   
 
   Pixel[][] pixels = getPixelsFromImage(); 

   /*
    * This filter turns every color found in the image either white or black based on the RGB values. 
    */
  
   int average = 0; 

   for (int row = 0; row < pixels.length; row++) {
         for (int col = 0; col < pixels[0].length; col++) {
           Pixel currentPixel = pixels[row][col];

           average = (int)(currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue()) / 3; 

           if (average < value) {
             currentPixel.setColor(Color.BLUE);
           } else {
             currentPixel.setColor(Color.GREEN); 
           }
         }
      }
   }

  public void makePositive() {
  
      Pixel[][] pixels = getPixelsFromImage();

     /*
      * Goes through the 2D array of pixels and uses each of the values and subtracts it by the current number.
      */
     for (int row = 0; row < pixels.length; row++) {
       for (int col = 0; col < pixels[0].length; col++) {
         Pixel currentPixel = pixels[row][col];

         int currentRed = currentPixel.getRed();
         int currentGreen = currentPixel.getGreen();
         int currentBlue = currentPixel.getBlue();


         int newRed = 255 +  currentRed;
         int newGreen = 255 + currentGreen;
         int newBlue = 255 + currentBlue;

         currentPixel.setRed(newRed);
         currentPixel.setGreen(newGreen);
         currentPixel.setBlue(newBlue);
       }
     }
   }


  


}
