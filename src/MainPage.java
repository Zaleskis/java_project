/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Hailey
 */
public class MainPage extends Application
{

   private TableView<MusicInfo> music = new TableView<MusicInfo>();
   private ObservableList<MusicInfo> data
           = FXCollections.observableArrayList(
                   new MusicInfo("1", "God's Country", "Country", "2019", "God's Country", "Blake Shelton", "3.27", "Warner Bros.", "154000", "1.25", "English", "9.9", "Good", "mp3"),
                   new MusicInfo("2", "Entre Deux Mondes", "Pop", "2017", "Entre Deux Mondes", "Marc Dupre", "3.45", "L-A BE", "3400", "1.05", "French", "9.7", "Poor", "mp3"),
                   new MusicInfo("3", "High Hopes", "Rock", "2018", "I write sins not tragedies", "Panic! At The Disco", "4.02", "Warner Bros.", "873362", "1.25", "English", "9.2", "Good", "mp4"),
                   new MusicInfo("4", "Treat You Better", "Pop", "2016", "Illuminate", "Shawn Mendes", "3.07", "Sony", "774231", "0.90", "English", "9.9", "Fair", "mp3"),
                   new MusicInfo("4", "Estoy Aqui", "Pop", "1995", "Pies Descalzos", "Shakira", "4.15", "Sony", "40799", "0.90", "Spanish", "8.9", "Good", "mp4"),
                   new MusicInfo("5", "Aquarela", "MPB", "1983", "Acquarello", "Toquinho", "4.16", "Maracana", "5789", "0.75", "Portuguese", "7.7", "Fair", "wma"),
                   new MusicInfo("6", "Stay", "Electronic", "2019", "Stay", "Alessia Cara, Zedd", "4.01", "Warner Bros.", "892046", "1.25", "English", "9.3", "Good", "mp4"),
                   new MusicInfo("7", "Love Me Again", "Electronic", "2018", "John Newman", "John Newman", "3.55", "Sony", "46320", "1.25", "English", "6.7", "Poor", "mp3"),
                   new MusicInfo("8", "Mom", "Country", "2014", "Man Against the Machine", "Garth Brooks", "4.22", "Warner Bros.", "882310", "1.25", "English", "9.9", "Good", "wma")
           //            new MusicInfo("C", "W", "c@example.com"),
           //            new MusicInfo("D", "Y", "d@example.com"),
           //            new MusicInfo("E", "V", "e@example.com")
           );

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
   //protected Button btExit = new Button("Exit");
   protected Button btSearch = new Button("Search");
   protected Button btAdd = new Button("Add");
   //protected Button btEdit = new Button("Edit");
   protected Button btUpdate = new Button("Update");
   protected Button btDelete = new Button("Delete");
//   protected Button btCancel = new Button("Cancel");
   //protected Button btSave = new Button("Save");
   private TextField musicBox = new TextField();

   @Override
   public void start (Stage primaryStage)
   {

      //Root pane
      BorderPane pane = new BorderPane();


      //**right column with gridpane

      GridPane gridPaneR = new GridPane();
      gridPaneR.setPadding(new Insets(100, 30, 60, 30));
      gridPaneR.setHgap(2);
      gridPaneR.setVgap(4);

      //gridpane header
      Label gridHeader = new Label("Current Song: ");
      gridPaneR.setHalignment(gridHeader, HPos.RIGHT);
      gridPaneR.add(gridHeader, 0, 0);

      //gridpane Labels
      Label id = new Label("ID: ");
      gridPaneR.setHalignment(id, HPos.RIGHT);
      gridPaneR.add(id, 0, 1);

      Label title = new Label("Song Title: ");
      gridPaneR.setHalignment(title, HPos.RIGHT);
      gridPaneR.add(title, 0, 2);

      Label genre = new Label("Genre: ");
      gridPaneR.setHalignment(genre, HPos.RIGHT);
      gridPaneR.add(genre, 0, 3);

      Label year = new Label("Year: ");
      gridPaneR.setHalignment(year, HPos.RIGHT);
      gridPaneR.add(year, 0, 4);

      Label album = new Label("Album: ");
      gridPaneR.setHalignment(album, HPos.RIGHT);
      gridPaneR.add(album, 0, 5);

      Label artist = new Label("Artist: ");
      gridPaneR.setHalignment(artist, HPos.RIGHT);
      gridPaneR.add(artist, 0, 6);

      Label time = new Label("Time: ");
      gridPaneR.setHalignment(time, HPos.RIGHT);
      gridPaneR.add(time, 0, 7);

      Label recordL = new Label("Record Label: ");
      gridPaneR.setHalignment(recordL, HPos.RIGHT);
      gridPaneR.add(recordL, 0, 8);

      Label sales = new Label("Sales: ");
      gridPaneR.setHalignment(sales, HPos.RIGHT);
      gridPaneR.add(sales, 0, 9);

      Label price = new Label("Price: ");
      gridPaneR.setHalignment(price, HPos.RIGHT);
      gridPaneR.add(price, 0, 10);

      Label lang = new Label("Language: ");
      gridPaneR.setHalignment(lang, HPos.RIGHT);
      gridPaneR.add(lang, 0, 11);

      Label rating = new Label("Rating: ");
      gridPaneR.setHalignment(rating, HPos.RIGHT);
      gridPaneR.add(rating, 0, 12);

      Label qual = new Label("Quality: ");
      gridPaneR.setHalignment(qual, HPos.RIGHT);
      gridPaneR.add(qual, 0, 13);

      Label fileEx = new Label("File Extension: ");
      gridPaneR.setHalignment(fileEx, HPos.RIGHT);
      gridPaneR.add(fileEx, 0, 14);

      //gridpane textfields
      gridPaneR.setHalignment(stID, HPos.RIGHT);
      gridPaneR.add(stID, 1, 1);

      gridPaneR.setHalignment(stTitle, HPos.RIGHT);
      gridPaneR.add(stTitle, 1, 2);

      gridPaneR.setHalignment(stGenre, HPos.RIGHT);
      gridPaneR.add(stGenre, 1, 3);

      gridPaneR.setHalignment(stYear, HPos.RIGHT);
      gridPaneR.add(stYear, 1, 4);

      gridPaneR.setHalignment(stAlbum, HPos.RIGHT);
      gridPaneR.add(stAlbum, 1, 5);

      gridPaneR.setHalignment(stArtist, HPos.RIGHT);
      gridPaneR.add(stArtist, 1, 6);

      gridPaneR.setHalignment(stTime, HPos.RIGHT);
      gridPaneR.add(stTime, 1, 7);

      gridPaneR.setHalignment(stRecordLabel, HPos.RIGHT);
      gridPaneR.add(stRecordLabel, 1, 8);

      gridPaneR.setHalignment(stSales, HPos.RIGHT);
      gridPaneR.add(stSales, 1, 9);

      gridPaneR.setHalignment(stPrice, HPos.RIGHT);
      gridPaneR.add(stPrice, 1, 10);

      gridPaneR.setHalignment(stLanguage, HPos.RIGHT);
      gridPaneR.add(stLanguage, 1, 11);

      gridPaneR.setHalignment(stRating, HPos.RIGHT);
      gridPaneR.add(stRating, 1, 12);

      gridPaneR.setHalignment(stQuality, HPos.RIGHT);
      gridPaneR.add(stQuality, 1, 13);

      gridPaneR.setHalignment(stFileExtension, HPos.RIGHT);
      gridPaneR.add(stFileExtension, 1, 14);

      //gridpane Buttons  below the text fields
      gridPaneR.add(btAdd, 0, 15);
      gridPaneR.add(btSearch, 1, 15);
      gridPaneR.add(btUpdate, 0, 16);
      //gridPaneR.add(btEdit, 0, 16);
      //gridPaneR.add(btSave, 1, 16);
      gridPaneR.add(btDelete, 1, 16);
      //gridPaneR.add(btExit, 1, 17);


      gridPaneR.setMaxWidth(500);

      gridPaneR.setAlignment(Pos.CENTER);
      ColumnConstraints col = new ColumnConstraints();
      col.setPercentWidth(40);
      gridPaneR.getColumnConstraints().addAll(col, col);

      btAdd.setMaxWidth(Double.MAX_VALUE);
      btSearch.setMaxWidth(Double.MAX_VALUE);
      //btEdit.setMaxWidth(Double.MAX_VALUE);
      //btSave.setMaxWidth(Double.MAX_VALUE);
      //btExit.setMaxWidth(Double.MAX_VALUE);
      btUpdate.setMaxWidth(Double.MAX_VALUE);
      btDelete.setMaxWidth(Double.MAX_VALUE);
//end  of gridPane

      //**top column
      FlowPane topHeader = new FlowPane();
      Text header = new Text("Your Music Box");
      header.setStyle("-fx-font: 50 arial;");
      topHeader.getChildren().add(header);
      topHeader.setAlignment(Pos.CENTER);
      topHeader.setPadding(new Insets(50, 0, 0, 0));


      //tableview left coloumn
      music.setEditable(true);

      TableColumn column1 = new TableColumn("ID");
      column1.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("id"));

      TableColumn column2 = new TableColumn("Title");
      column2.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("title"));

      TableColumn column3 = new TableColumn("Genre");
      column3.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("genre"));

      TableColumn column4 = new TableColumn("Year");
      column4.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("year"));

      TableColumn column5 = new TableColumn("Album");
      column5.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("album"));

      TableColumn column6 = new TableColumn("Artist");
      column6.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("artist"));

      TableColumn column7 = new TableColumn("Time");
      column7.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("time"));

      TableColumn column8 = new TableColumn("Record Label");
      column8.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("recordLabel"));

      TableColumn column9 = new TableColumn("Sales");
      column9.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("sales"));

      TableColumn column10 = new TableColumn("Price");
      column10.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("price"));

      TableColumn column11 = new TableColumn("Language");
      column11.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("language"));

      TableColumn column12 = new TableColumn("Rating");
      column12.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("rating"));

      TableColumn column13 = new TableColumn("Quality");
      column13.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("quality"));

      TableColumn column14 = new TableColumn("File Extension");
      column14.setCellValueFactory(new PropertyValueFactory<MusicInfo, String>("fileExtension"));


      music.setItems(data);
      music.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8, column9, column10, column11, column12, column13, column14);


//      tableView.getItems().add(new MusicInfo(1, ""));
//      tableView.getItems().add(new MusicInfo("Jane", "Deer"));

      VBox tableV = new VBox(music);

      tableV.setMaxSize(900, 900);


      //linking grid, header, & tableview to the rootPane
      pane.setRight(gridPaneR);
      pane.setTop(topHeader);
      pane.setLeft(tableV);


      BorderPane.setMargin(tableV, new Insets(200, 10, 10, 30));

      btAdd.setOnAction(e -> addMusicInfo(stID.getText(), stTitle.getText(), stGenre.getText(), stYear.getText(), stAlbum.getText(), stArtist.getText(), stTime.getText(), stRecordLabel.getText(), stSales.getText(), stPrice.getText(), stLanguage.getText(), stRating.getText(), stQuality.getText(), stFileExtension.getText()));
      btUpdate.setOnAction(e -> updateData(stID.getText(), stTitle.getText(), stGenre.getText(), stYear.getText(), stAlbum.getText(), stArtist.getText(), stTime.getText(), stRecordLabel.getText(), stSales.getText(), stPrice.getText(), stLanguage.getText(), stRating.getText(), stQuality.getText(), stFileExtension.getText()));
      btSearch.setOnAction(e -> searchData(stTitle.getText()));
      btDelete.setOnAction(e -> deleteMusicInfo());

      music.getSelectionModel().selectedIndexProperty().addListener((num) -> displayData());

      Scene scene = new Scene(pane, 1400, 850);

      primaryStage.setTitle(
              "Your Music Box!");
      primaryStage.setScene(scene);

      primaryStage.show();

   }



   public void addMusicInfo (String id, String title, String genre, String year, String album, String artist, String time, String recordLabel, String sales, String price, String language, String rating, String quality, String fileExtension)
   {

      if (id.isEmpty() && title.isEmpty() && genre.isEmpty() && year.isEmpty() && album.isEmpty() && artist.isEmpty() && time.isEmpty() && recordLabel.isEmpty() && sales.isEmpty() && price.isEmpty() && language.isEmpty() && rating.isEmpty() && quality.isEmpty() && fileExtension.isEmpty()) {

         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Must enter information to add a song");
         alert.show();

      }
      else {

         MusicInfo newMusicInfo = new MusicInfo(id, title, genre, year, album, artist, time, recordLabel, sales, price, language, rating, quality, fileExtension);
         data.add(newMusicInfo);

      }

   }


   public void searchData (String title)
   {

      boolean songFound = false;

      for (int i = 0; i < data.size(); i++) {

         if (data.get(i).getTitle().equals(title)) {

            stID.setText(data.get(i).getId());
            stGenre.setText(data.get(i).getGenre());
            stYear.setText(data.get(i).getYear());
            stAlbum.setText(data.get(i).getAlbum());
            stArtist.setText(data.get(i).getArtist());
            stTime.setText(data.get(i).getTime());
            stRecordLabel.setText(data.get(i).getRecordLabel());
            stSales.setText(data.get(i).getSales());
            stPrice.setText(data.get(i).getPrice());
            stLanguage.setText(data.get(i).getLanguage());
            stRating.setText(data.get(i).getRating());
            stQuality.setText(data.get(i).getQuality());
            stFileExtension.setText(data.get(i).getFileExtension());

            songFound = true;

         }

      }

      if (songFound == false) {

         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Song title was not found");
         alert.setContentText("Enter song title that is on the database");
         alert.show();

      }

   }


   public void updateData (String id, String title, String genre, String year, String album, String artist, String time, String recordLabel, String sales, String price, String language, String rating, String quality, String fileExtension)
   {

      int i = music.getSelectionModel().selectedIndexProperty().get();

      try {
         data.get(i).setTitle(title);
         //ID is unchangable 
         data.get(i).setGenre(genre);
         data.get(i).setYear(year);
         data.get(i).setAlbum(album);
         data.get(i).setArtist(artist);
         data.get(i).setTime(time);
         data.get(i).setRecordLabel(recordLabel);
         data.get(i).setSales(sales);
         data.get(i).setPrice(price);
         data.get(i).setLanguage(language);
         data.get(i).setRating(rating);
         data.get(i).setQuality(quality);
         data.get(i).setFileExtension(fileExtension);

         data.set(i, data.get(i));
      }
      catch (Exception ex) {

         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Must select feild to update");
         alert.show();

      }

   }


   public void deleteMusicInfo ()
   {

      int i = music.getSelectionModel().selectedIndexProperty().get();


      data.remove(i);

   }

   public void displayData ()
   {

      int i = music.getSelectionModel().selectedIndexProperty().get();

      stTitle.setText(data.get(i).getTitle());
      stID.setText(data.get(i).getId());
      stGenre.setText(data.get(i).getGenre());
      stYear.setText(data.get(i).getYear());
      stAlbum.setText(data.get(i).getAlbum());
      stArtist.setText(data.get(i).getArtist());
      stTime.setText(data.get(i).getTime());
      stRecordLabel.setText(data.get(i).getRecordLabel());
      stSales.setText(data.get(i).getSales());
      stPrice.setText(data.get(i).getPrice());
      stLanguage.setText(data.get(i).getLanguage());
      stRating.setText(data.get(i).getRating());
      stQuality.setText(data.get(i).getQuality());
      stFileExtension.setText(data.get(i).getFileExtension());


   }


   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      launch(args);
   }

}
