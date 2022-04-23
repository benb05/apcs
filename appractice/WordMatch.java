import java.util.ArrayList;

public class WordMatch {
    private String secret;

    public WordMatch(String word){
        secret = word;
       
    }

   /*    public int scoreGuess(String guess){
        for(int i = 0; i < guess.length(); i++){
            
        }
    }
    */
   
public static void main(String[] args) {
    WordMatch realword = new WordMatch("gamer");
    System.out.println("" + realword.toString());


}
}