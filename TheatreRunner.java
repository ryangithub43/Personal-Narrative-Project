import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // MyStory object
    myStory scene = new myStory();
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
  }
}

