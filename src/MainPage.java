/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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

   protected TableView table = new TableView();
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
   protected Button btAdd = new Button("Add");
   protected Button btEdit = new Button("Edit");
   protected Button btDelete = new Button("Delete");
   protected Button btCancel = new Button("Cancel");
   protected Button btSave = new Button("Save");
   private TextField musicBox = new TextField();

   @Override
   public void start (Stage primaryStage)
   {
//      Button btn1 = new Button("One");
//      Button btn2 = new Button("Two");
//      Button btn3 = new Button("Three");
//      Button btn4 = new Button("Four");
//      Button btn5 = new Button("Five");
//      Button btn6 = new Button("Six");
//      Button btn7 = new Button("Seven");

      //Root pane
      BorderPane pane = new BorderPane();


      //**right column with gridpane

      GridPane gridPaneR = new GridPane();
      gridPaneR.setPadding(new Insets(100, 30, 10, 30));
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
      gridPaneR.add(btEdit, 0, 15);
      gridPaneR.add(btSave, 1, 15);
      gridPaneR.add(btCancel, 0, 16);
      gridPaneR.add(btDelete, 1, 16);

      gridPaneR.setMaxWidth(500);

      gridPaneR.setAlignment(Pos.CENTER);
      ColumnConstraints col = new ColumnConstraints();
      col.setPercentWidth(40);
      gridPaneR.getColumnConstraints().addAll(col, col);

      btEdit.setMaxWidth(Double.MAX_VALUE);
      btSave.setMaxWidth(Double.MAX_VALUE);
      btCancel.setMaxWidth(Double.MAX_VALUE);
      btDelete.setMaxWidth(Double.MAX_VALUE);


      //**top column
      FlowPane topHeader = new FlowPane();
      Text header = new Text("Your Music Box");
      header.setStyle("-fx-font: 50 arial;");
      topHeader.getChildren().add(header);
      topHeader.setAlignment(Pos.CENTER);
      topHeader.setPadding(new Insets(50, 0, 0, 0));


      //tableview left coloumn
      TableView tableView = new TableView();

      TableColumn<String, MusicInfo> column1 = new TableColumn<>("ID");
      column1.setCellValueFactory(new PropertyValueFactory<>("id"));

      TableColumn<String, MusicInfo> column2 = new TableColumn<>("Title");
      column2.setCellValueFactory(new PropertyValueFactory<>("title"));

      TableColumn<String, MusicInfo> column3 = new TableColumn<>("Genre");
      column2.setCellValueFactory(new PropertyValueFactory<>("genre"));

      TableColumn<String, MusicInfo> column4 = new TableColumn<>("Year");
      column2.setCellValueFactory(new PropertyValueFactory<>("year"));

      TableColumn<String, MusicInfo> column5 = new TableColumn<>("Album");
      column2.setCellValueFactory(new PropertyValueFactory<>("album"));

      TableColumn<String, MusicInfo> column6 = new TableColumn<>("Time");
      column2.setCellValueFactory(new PropertyValueFactory<>("time"));

      TableColumn<String, MusicInfo> column7 = new TableColumn<>("Record Label");
      column2.setCellValueFactory(new PropertyValueFactory<>("recordLabel"));

      TableColumn<String, MusicInfo> column8 = new TableColumn<>("Sales");
      column2.setCellValueFactory(new PropertyValueFactory<>("sales"));

      TableColumn<String, MusicInfo> column9 = new TableColumn<>("Price");
      column2.setCellValueFactory(new PropertyValueFactory<>("price"));

      TableColumn<String, MusicInfo> column10 = new TableColumn<>("Language");
      column2.setCellValueFactory(new PropertyValueFactory<>("language"));

      TableColumn<String, MusicInfo> column11 = new TableColumn<>("Rating");
      column2.setCellValueFactory(new PropertyValueFactory<>("rating"));

      TableColumn<String, MusicInfo> column12 = new TableColumn<>("Quality");
      column2.setCellValueFactory(new PropertyValueFactory<>("quality"));

      TableColumn<String, MusicInfo> column13 = new TableColumn<>("File Extension");
      column2.setCellValueFactory(new PropertyValueFactory<>("fileExtension"));

      tableView.getColumns().add(column1);
      tableView.getColumns().add(column2);
      tableView.getColumns().add(column3);
      tableView.getColumns().add(column4);
      tableView.getColumns().add(column5);
      tableView.getColumns().add(column6);
      tableView.getColumns().add(column7);
      tableView.getColumns().add(column8);
      tableView.getColumns().add(column9);
      tableView.getColumns().add(column10);
      tableView.getColumns().add(column11);
      tableView.getColumns().add(column12);
      tableView.getColumns().add(column13);

//      tableView.getItems().add(new MusicInfo(1, ""));
//      tableView.getItems().add(new MusicInfo("Jane", "Deer"));

      VBox tableV = new VBox(tableView);

      tableV.setMaxSize(900, 500);

      pane.setRight(gridPaneR);
      pane.setTop(topHeader);
      pane.setLeft(tableV);

      BorderPane.setMargin(tableV, new Insets(200, 10, 10, 30));

//      Scene scene = new Scene(vbox);
//      btn7.setMaxWidth(Double.MAX_VALUE);
//
//      btn7.setMaxHeight(Double.MAX_VALUE);
//      pane.setCenter(btn7);

//      VBox rightPane = new VBox(btn2, btn3, btn4);
//// or, if you prefer a FlowPane, comment out above and uncomment
//// the two statements below
////FlowPane rightPane = new FlowPane(Orientation.VERTICAL, 10, 10);
////rightPane.getChildren().addAll(btn2, btn3, btn4);
//
//      rightPane.setAlignment(Pos.CENTER);
//
//      btn2.setMaxWidth(Double.MAX_VALUE);
//
//      btn3.setMaxWidth(Double.MAX_VALUE);
//
//      btn4.setMaxWidth(Double.MAX_VALUE);
//
//      rightPane.setSpacing(
//              10);
//
//
//      GridPane topPane = new GridPane();
//
//      topPane.setHgap(
//              10);
//      topPane.setAlignment(Pos.CENTER);
//      ColumnConstraints col = new ColumnConstraints();
//
//      col.setPercentWidth(
//              50);
//      topPane.getColumnConstraints()
//              .addAll(col, col);
//      btn5.setMaxWidth(Double.MAX_VALUE);
//
//      btn1.setMaxWidth(Double.MAX_VALUE);
//
//      topPane.add(btn5,
//                  0, 0);
//      topPane.add(btn1,
//                  1, 0);
//      topPane.setMaxWidth(Double.MAX_VALUE);
//
//
//      BorderPane pane = new BorderPane();
//
//      pane.setRight(rightPane);
//
//      pane.setTop(topPane);
//
//      btn7.setMaxWidth(Double.MAX_VALUE);
//
//      btn7.setMaxHeight(Double.MAX_VALUE);
//
//      pane.setCenter(btn7);
//
//// ** add all 3 nodes to BorderPane **
//      BorderPane.setMargin(rightPane, new Insets(10));
//      BorderPane.setMargin(topPane, new Insets(10));
//      BorderPane.setMargin(btn7, new Insets(10));
//      StackPane root = new StackPane();
//      root.getChildren().addAll();
      Scene scene = new Scene(pane, 1400, 850);

      primaryStage.setTitle(
              "Hello World!");
      primaryStage.setScene(scene);

      primaryStage.show();
   }

   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      launch(args);
   }

}
