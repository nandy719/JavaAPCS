public class SongFinder{
  public static int findTitle(Song[] songs, String target){
     for (int i = 0; i < songs.length; i++){

String word = songs[i].getTitle();
 if (word.equals(target)) {
 return i;
         }
     }
     return -1;
   }
}