import java.util.HashMap; 
import java.util.Map; 

public class Lyrics{

     public static void main(String[] args) 
    { 
        HashMap<String, String> tracklist 
            = new HashMap<>(); 
  
        System.out.println(tracklist); 
        tracklist.put("Immortalized", "I am immortalized"); 
        tracklist.put("The Warrior", "Bring it, don't sing it"); 
        tracklist.put("The Vengeful One", "I am the dark messiah"); 
        tracklist.put("Ten Thousand Fists", "Ten thousand fists in the air"); 
  
        System.out.println("Size of map is:- "
                           + tracklist.size()); 
  
        System.out.println(tracklist); 
        if (tracklist.containsKey("Immortalized")) { 
            String a = tracklist.get("Immortalized"); 
            System.out.println("value for key"
                               + " \"Immortalized\" is: "
                               + a); 
        } 
  
        System.out.println(tracklist); 
    } 
}
