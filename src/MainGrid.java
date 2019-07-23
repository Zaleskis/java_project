import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * @author ninez
 */
public class MainGrid extends Application
{
   protected TextField stID = new TextField();
   protected TextField stTitle = new TextField();
   protected TextField stGenre = new TextField();
   protected TextField stYear = new TextField();
   protected TextField stAlbum = new TextField();
   protected TextField stArtist = new TextField();
   protected TextField stTime = new TextField();
   protected TextField stRecordLabel = new TextField();
   protected TextField stSales = new TextField();
   protected TextField stPrice = new TextField();
   protected TextField stLanguage = new TextField();
   protected TextField stRating = new TextField();
   protected TextField stQuality = new TextField();
   protected TextField stFileExtension = new TextField();
   protected Button btExit = new Button("Exit");
   protected Button btSearch = new Button("Search");
   private TextField musicBox = new TextField();

   @Override
   public void start (Stage primaryStage)
   {


      //creating the UI
      GridPane gridPane = new GridPane();
      gridPane.setHgap(4);
      gridPane.setVgap(4);
      gridPane.add(new Label("Welcome to your MUSIC BOX!"), 0, 0);
      gridPane.add(new Label("ID:"), 0, 1);
      gridPane.add(stID, 1, 1);
      gridPane.add(new Label("Song Title:"), 0, 2);
      gridPane.add(stTitle, 1, 2);
      gridPane.add(new Label("Genre:"), 0, 3);
      gridPane.add(stGenre, 1, 3);
      gridPane.add(new Label("Year:"), 0, 4);
      gridPane.add(stYear, 1, 4);
      gridPane.add(new Label("Album:"), 0, 5);
      gridPane.add(stAlbum, 1, 5);
      gridPane.add(new Label("Artist:"), 0, 6);
      gridPane.add(stArtist, 1, 6);
      gridPane.add(new Label("Time:"), 0, 7);
      gridPane.add(stTime, 1, 7);
      gridPane.add(new Label("Record Label:"), 0, 8);
      gridPane.add(stRecordLabel, 1, 8);
      gridPane.add(new Label("Sales:"), 0, 9);
      gridPane.add(stSales, 1, 9);
      gridPane.add(new Label("Price:"), 0, 10);
      gridPane.add(stPrice, 1, 10);
      gridPane.add(new Label("Language:"), 0, 11);
      gridPane.add(stLanguage, 1, 11);
      gridPane.add(new Label("Rating:"), 0, 12);
      gridPane.add(stRating, 1, 12);
      gridPane.add(new Label("Quality:"), 0, 13);
      gridPane.add(stQuality, 1, 13);
      gridPane.add(new Label("File Extension:"), 0, 14);
      gridPane.add(stFileExtension, 1, 14);
      gridPane.add(btSearch, 1, 15);
      gridPane.add(btExit, 1, 16);


      //setting properties --> you can search by song title, genre, artist, language or file extension
      gridPane.setAlignment(Pos.CENTER);
      musicBox.setAlignment(Pos.CENTER);
      stID.setAlignment(Pos.BOTTOM_RIGHT);
      stTitle.setAlignment(Pos.BOTTOM_RIGHT);
      stGenre.setAlignment(Pos.BOTTOM_RIGHT);
      stYear.setAlignment(Pos.BOTTOM_RIGHT);
      stAlbum.setAlignment(Pos.BOTTOM_RIGHT);
      stArtist.setAlignment(Pos.BOTTOM_RIGHT);
      stTime.setAlignment(Pos.BOTTOM_RIGHT);
      stRecordLabel.setAlignment(Pos.BOTTOM_RIGHT);
      stSales.setAlignment(Pos.BOTTOM_RIGHT);
      stPrice.setAlignment(Pos.BOTTOM_RIGHT);
      stLanguage.setAlignment(Pos.BOTTOM_RIGHT);
      stRating.setAlignment(Pos.BOTTOM_RIGHT);
      stQuality.setAlignment(Pos.BOTTOM_RIGHT);
      stFileExtension.setAlignment(Pos.BOTTOM_RIGHT);
      stID.setEditable(false);
      stYear.setEditable(false);
      stAlbum.setEditable(false);
      stTime.setEditable(false);
      stRecordLabel.setEditable(false);
      stSales.setEditable(false);
      stPrice.setEditable(false);
      stRating.setEditable(false);
      stQuality.setEditable(false);
      GridPane.setHalignment(btSearch, HPos.RIGHT);
      GridPane.setHalignment(btExit, HPos.RIGHT);

      //process event
      btSearch.setOnAction(e -> searchConvertion());


      //creating a scene and putting it into a stage
      Scene scene = new Scene(gridPane, 1400, 850);
      primaryStage.setTitle("Music Box");
      primaryStage.setScene(scene);
      primaryStage.show();



   }


   protected void searchConvertion ()
   {

      //getting values from text fields that are not supposed to be text
      int ID = Integer.parseInt(stID.getText());
      int year = Integer.parseInt(stYear.getText());
      double time = Double.parseDouble(stTime.getText());
      int sales = Integer.parseInt(stSales.getText());
      double price = Double.parseDouble(stPrice.getText());
      double rating = Double.parseDouble(stRating.getText());
      double quality = Double.parseDouble(stQuality.getText());

//creating a search object

//displaying information

      //stID.setText(String.format("%d", ID.getID()));
      //stYear.setText(String.format("%d", year.getYear()));
      //stTime.setText(String.format("%.2f", time.getTime()));
      //stSales.setText(String.format("%d", sales.getSales()));
      //stPrice.setText(String.format("%.2f", price.getPrice()));
      //stRating.setText(String.format("%.2f", rating.getRating()));
      //stQuality.setText(String.format("%.2f", quality.getQuality()));
   }


   public static void main (String[] args)
   {
      launch(args);
   }
}
