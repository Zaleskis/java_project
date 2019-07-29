/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class MusicInfo
{
   private int id;
   private String title;
   private String Genre;
   private int year;
   private String album;
   private String artist;
   private double time;
   private String recordLabel;
   private int sales;
   private double price;
   private String language;
   private double rating;
   private double quality;
   private String fileExtension;

   public MusicInfo ()
   {
   }

   public MusicInfo (int id, String title, String Genre, int year, String album, String artist, double time, String recordLabel, int sales, double price, String language, double rating, double quality, String fileExtension)
   {
      this.id = id;
      this.title = title;
      this.Genre = Genre;
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



   public int getId ()
   {
      return id;
   }

   public void setId (int id)
   {
      this.id = id;
   }

   public String getTitle ()
   {
      return title;
   }

   public void setTitle (String title)
   {
      this.title = title;
   }

   public String getGenre ()
   {
      return Genre;
   }

   public void setGenre (String Genre)
   {
      this.Genre = Genre;
   }

   public int getYear ()
   {
      return year;
   }

   public void setYear (int year)
   {
      this.year = year;
   }

   public String getAlbum ()
   {
      return album;
   }

   public void setAlbum (String album)
   {
      this.album = album;
   }

   public String getArtist ()
   {
      return artist;
   }

   public void setArtist (String artist)
   {
      this.artist = artist;
   }

   public double getTime ()
   {
      return time;
   }

   public void setTime (double time)
   {
      this.time = time;
   }

   public String getRecordLabel ()
   {
      return recordLabel;
   }

   public void setRecordLabel (String recordLabel)
   {
      this.recordLabel = recordLabel;
   }

   public int getSales ()
   {
      return sales;
   }

   public void setSales (int sales)
   {
      this.sales = sales;
   }

   public double getPrice ()
   {
      return price;
   }

   public void setPrice (double price)
   {
      this.price = price;
   }

   public String getLanguage ()
   {
      return language;
   }

   public void setLanguage (String language)
   {
      this.language = language;
   }

   public double getRating ()
   {
      return rating;
   }

   public void setRating (double rating)
   {
      this.rating = rating;
   }

   public double getQuality ()
   {
      return quality;
   }

   public void setQuality (double quality)
   {
      this.quality = quality;
   }

   public String getFileExtension ()
   {
      return fileExtension;
   }

   public void setFileExtension (String fileExtension)
   {
      this.fileExtension = fileExtension;
   }


}
