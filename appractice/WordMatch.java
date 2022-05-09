import java.lang.*;

public class WordMatch {
    private String secret;

    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        int scoreCounter = 0;
        for(int i = 0; i < guess.length(); i++){

            if (guess.substring(i, i+1).equals(secret.substring(i, i+1))){
                
                scoreCounter += 1;
            }   
                 

        }
        System.out.println(scoreCounter);
        return scoreCounter;
        
}
public static void main(String[] args) {
    WordMatch gamer = new WordMatch("gamer");
 gamer.scoreGuess("gamud");
 

    
}
}