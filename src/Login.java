import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * @author ninez
 */
public class Login extends Application
{

   @Override
   public void start (Stage primaryStage)
   {

      //creating a pane and setting properties
      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
      pane.setHgap(4);
      pane.setVgap(4);

      //creating the logo image and the button for login and adding into the pane
      Button btLogin = new Button("Login");
      Image image = new Image("logo.png");


      pane.add(new ImageView(image), 0, 0);
      pane.add(btLogin, 0, 3);

      //creating a scene and putting it into the stage
      Scene scene = new Scene(pane, 600, 600);
      primaryStage.setTitle("Login into your Music Box");
      primaryStage.setScene(scene);
      primaryStage.show();

   }


   public static void main (String[] args)
   {
      launch(args);
   }
}
