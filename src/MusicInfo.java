/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class MusicInfo
{
   private String id;
   private String title;
   private String genre;
   private String year;
   private String album;
   private String artist;
   private String time;
   private String recordLabel;
   private String sales;
   private String price;
   private String language;
   private String rating;
   private String quality;
   private String fileExtension;

   public MusicInfo ()
   {
   }

   public MusicInfo (String id, String title, String genre, String year, String album, String artist, String time, String recordLabel, String sales, String price, String language, String rating, String quality, String fileExtension)
   {
      this.id = id;
      this.title = title;
      this.genre = genre;
      this.year = year;
      this.album = album;
      this.artist = artist;
      this.time = time;
      this.recordLabel = recordLabel;
      this.sales = sales;
      this.price = price;
      this.language = language;
      this.rating = rating;
      this.quality = quality;
      this.fileExtension = fileExtension;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

}
