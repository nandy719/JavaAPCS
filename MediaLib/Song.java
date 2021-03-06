public class Song{
    private int rating;
    private String title;
    private String singer;
    private int length; //in seconds//
    private double price;
    private boolean favorite;
    private int age; //in days//
    public static double totalCost;
    public static int numSongs;
    public static int ratings;
    public static double averageCost;
    public static double averageRating;
    public Song(){
        rating = 0;
        title = "";
        singer = "";
        length = 0;
        price = 0.0;
        favorite = false;
        age = 0;
        numSongs++;
        totalCost += price;
        ratings += rating;
        averageCost = ((double) totalCost/(double) numSongs);
        averageRating = ((double) ratings/ (double) numSongs);
    }
    public Song (int rate, String title, String singer, int length, double price, boolean fav, int a){
         assert (rate >= 0 && rate <= 10);
         this.rating = rate;
         this.title = title;
         this.singer = singer;
         this.length = length;
         this.price = price;
         favorite = fav;
         age = a;
         numSongs++;
         totalCost += price;
         ratings += rate;
         averageCost = ((double) totalCost/(double) numSongs);
         averageRating = ((double) ratings/ (double) numSongs);
    }
    public Song(String title){
      this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
        
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rate){
        assert (rate >= 0 && rate <= 10);
        rating = rate;
    }
    public String getSinger(){
        return singer;
    }
    public void setSinger(String s){
        singer = s;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        length = l;
    }
    public double getPrice(){
      return price;
    }
    public void setPrice(double p){
      price = p;
    }
    public boolean getFavorite(){
      return favorite;
    }
    public void setFavorite(boolean b){
      favorite = b;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public void displayAge(){// displays in years, months, days//
        int years = age/365;
        int days = age%365;
        int months = days/30;
        days %= 30;
        System.out.println("Years: " + years + " Months: " + months + " Days: " + days);
    }

}