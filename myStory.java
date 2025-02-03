import org.code.theater.*;
import org.code.media.*;

public class myStory extends Scene {
  
  private static final String[][] foodList = { {"Fries, Fried Chicken"},
                                              {"Macaroni and Cheese", "Spaghetti"} }; 

  private static final String[][] imageList = { {"fries.jpg", "fried-chicken.jpg"},
                                               {"macaroni-and-cheese.jpg", "spaghetti.jpg"} }; 
  
  public void drawScene() {
    drawFoodScene(); 
  }

  public void drawFoodScene() {
    
    clear("white");
  
    drawText(foodList[0][0], 50, 100);
    pause(0.5);
    drawText(foodList[0][1], 250, 100);
    pause(0.5);

    Filter image2 = new Filter(imageList[0][0]); 
    
    drawImage(image2, 50, 300, 100);
    pause(0.5);
    image2.makeNegative();
    drawImage(image2, 50, 300, 100); 

    pause(1.0);
    
  }
}
  
