public class ArrayMediaLib{
  public static void main(String[] args){
    int[] DBP = {2,5,1,2,4,2,1,3};
    int tot = 0;
    double avg = 0;
    for(int num: DBP){
      tot += num;
    }
    avg =(double) tot/ DBP.length;
    System.out.println(avg);
    System.out.println();
    Song[] topTenSongs = {new Song("The Twist"), new Song("Smooth"), new Song("Mack the Knife"), new Song("How do I live"),
    new Song("Party Rock Anthem"), new Song("I Gotta Feeling"), new Song("Macarena"), new Song("Physical"),
    new Song("You Light Up My Life"), new Song("Hey Jude")};
    for (Song s: topTenSongs){
      System.out.println(s.getTitle());
    }
    System.out.println();
    int index = 0;
    for(Song s: topTenSongs){
      if((index - 2) % 3 == 0) s.setPrice(0.99);
      else s.setPrice(1.29);
      index++;
    }
    for(Song s: topTenSongs){
      System.out.printf("Title: %s Price: %f \n", s.getTitle(), s.getPrice());

  }
    System.out.println();
    for(int i = 0; i < 5; i++){
      Song s = topTenSongs[i];
      System.out.printf("Title: %s Price: %f \n", s.getTitle(), s.getPrice());
      }
    System.out.println();
    for(int i = 0; i < topTenSongs.length; i += 2){
      Song s = topTenSongs[i];
      System.out.printf("Title: %s Price: %f \n", s.getTitle(), s.getPrice());
    }
    System.out.println();
    index = 0;
    for(Song s: topTenSongs){
      if(index % 2 == 0) System.out.printf("Title: %s Price: %f \n", s.getTitle(), s.getPrice());
      index++;
    }
    System.out.println();
      
}
}
  