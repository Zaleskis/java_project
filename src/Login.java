import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Administrator
 */
public class Login extends Application
{

   @Override
   public void start (Stage primaryStage)
   {
      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
      pane.setHgap(4);
      pane.setVgap(4);

      //creating button "login' and set the size
      Button btLogin = new Button("Login");
      btLogin.setMaxWidth(Double.MAX_VALUE);

      //adding image and button to the pane
      pane.add(new ImageView("http://truthjuice.co.uk/wp-content/uploads/2011/06/2440_graphic__music_-headphones-_heart.gif"), 0, 0);
      pane.add(btLogin, 0, 3);


      //creating a scene and putting it into the stage
      Scene scene = new Scene(pane, 600, 600);
      primaryStage.setTitle("Login into your Music Box");
      primaryStage.setScene(scene);
      primaryStage.show();


      //action set
      btLogin.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle (ActionEvent e)
         {
            MainPage mainPage = new MainPage(); //create MainPage object
            mainPage.start(MainPage.classStage); //open MainPage
            primaryStage.close(); //close primaryStage of Login class
         }
      });
   }

   /**
    * The main() method is ignored in correctly deployed JavaFX application.
    * main() serves only as fallback in case the application can not be
    * launched through deployment artifacts, e.g., in IDEs with limited FX
    * support. NetBeans ignores main().
    *
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      launch(args);
   }
}
