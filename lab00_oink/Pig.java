/***
 * nnnn - Samantha Hua, Courtney Huang, and Ben Belotser
 * APCS
 * L00: Etterbay Odingcay Oughthray Ollaborationcay
 * 2021-11-09
 * time spent: 2 hrs
 *
DISCO
 - Helper method are super helpful in creating clear and understable code.
 - hasNextLine() allows us to determine whether there are more test cases to go through
 - next() allows us to see the text in each line
QCC
 - Why can't we do PUNCS.indexOf(w) != -1 to search whether or not a String contains punctuation. We tested outside of Pig, and thought that indexOf can search each letter in a String.
 - How can you input Strings with multiple words into a java file (ex: java Pig "hello my name is bob" does not work)?
 - How can the computer see semicolons at the end of inputs inot a java file (ex: java Pig hello;)?
 - How can we resolve this error (Exception in thread "main" java.util.NoSuchElementException)? We did not know what this issue was concerning.
 - We assumed that the punctuation of each input would be at the end of the String. Besides hyphens, can we truly assume that this will be the case?
HOW WE UTILIZED SCANNER DEMO (v2)
 - We used scanner to pass in test cases from an exterior file into our Pig.java
 - It allowed us to see the outputs of a variety of types of test cases all at once
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO
 - If you don't tell the computer to stop before you run out of test cases, you will have a run time error.
 - To resolve this issue, we used hasNextLine()
 
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

import java.util.Scanner;  // Import the Scanner class
public class Pig {

  private static final String VOWELS = "aeiouyAEIOUY";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
  private static final String PUNCS = ".,:;!?"; // doesn't work with ;


  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;

    /* equiv code, wo using indexOf()...
       boolean ans = false;
       for( int i = 0; i < w.length(); i++ ) {
       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
    */
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {

    return allVowels(w).length();

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {
       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    for (int i = 0; i < w.length(); i ++){
        if (isAVowel(w.substring(i, i + 1))){
          return true;
        }
      }
     return false;
    // return w.indexOf(w) >= 0;
  }


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPig( String w ) {

    String ans = "";

    if ( beginsWithVowel(w) )
      ans = w + "way";

    else {
      int vPos = w.indexOf( firstVowel(w) );
      ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
    }

    return ans;
  }

      /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
      return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
      return CAPS.indexOf(letter) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false
      =====================================*/
    public static boolean hasPunc( String w ) {
      // return PUNCS.indexOf(w) != -1; why doesn't this work?
      for (int i=0; i<w.length(); i++) {
        if (isPunc(w.substring(i,i+1)) != false) {
          return true;
        }
      }
      return false;
    }

    public static boolean isASpace(String w) {
      String space = " ";
      return space.indexOf(w) != -1;
    }

    public static String toUpperCase(String w) {
      int x = LOWERCASE.indexOf(w);
      return CAPS.substring(x,x+1);
    }

    public static String toLowerCase(String w) {
      int x = CAPS.indexOf(w);
      return LOWERCASE.substring(x,x+1);
    }
    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {
      return isUpperCase(w.substring(0,1));
    }

    public static String capitalization(String w) {
      String firstLetter = w.substring(0,1);
      String restOfWord = w.substring(1,w.length());
      if (beginsWithUpper(w) == true) {
        String restOfWordStartingLetter = toUpperCase(restOfWord.substring(0,1));
        restOfWord = restOfWord.substring(1,restOfWord.length());
        firstLetter = toLowerCase(firstLetter);
        return restOfWordStartingLetter + restOfWord + firstLetter;
      }
      return restOfWord + firstLetter;
    }

    public static int punctuation(String w) {
      //int l = l.length(); // easier on the eyes
      //return PUNCS.indexOf(w);
      for (int i = 0; i < w.length(); i ++){
          if (isPunc(w.substring(i, i + 1))){
            return i;
          }
        }
       return -1;
    }

    public static String parseString(String w) {
      // not working yet
      // break up a string with multiple words into multiple strings each containing a singular word
      // String[] arrayOfWords = new String[0]; //init return String
      // int previous = 0;
      // int numberOfWords = 0;
      // for( int i = 0; i < w.length(); i++ ) {
      //   if ( isASpace( w.substring(i,i+1) ) ) {
      //     arrayOfWords[numberOfWords] += w.substring(previous, i); //grow the return String[]
      //     previous = i + 1;
      //     numberOfWords++;
      //   }
      // }

      int l = w.length(); //easier on the eyes
      String stringWithoutPunc = w;
      String punc = "";
      if (isAVowel(w.substring(0,1)) == true) {
          int puncIndex = punctuation(w);
          if (puncIndex != -1) {
            stringWithoutPunc = w.substring(0,puncIndex) + w.substring(puncIndex + 1);
            punc = w.substring(puncIndex, puncIndex+1);
          }
          w = capitalization(stringWithoutPunc);
          return w + "way" + punc;
      } else if (((isAVowel(w.substring(0,1))) == false) && (isAVowel(w.substring(1,2)) == false)) {
          int puncIndex = punctuation(w);
          if (puncIndex != -1) {
            stringWithoutPunc = w.substring(0,puncIndex) + w.substring(puncIndex + 1);
            punc = w.substring(puncIndex, puncIndex+1);
          }
          w = capitalization(stringWithoutPunc);
          return w.substring(1,w.length()) + w.substring(0,1) + "ay" + punc;
      } else {
          int puncIndex = punctuation(w);
          if (puncIndex != -1) {
            stringWithoutPunc = w.substring(0,puncIndex) + w.substring(puncIndex + 1);
            punc = w.substring(puncIndex, puncIndex+1);
          }
          w = capitalization(stringWithoutPunc);
          return w + "ay" + punc;

      }

    }
    public static void main( String[] args ) {
      Scanner words = new Scanner(System.in);
      while (words.hasNextLine()) {
        System.out.println(parseString(words.next()));
      }
      // for( String words.nextline() : words ) {
        //word = in.nextString();
      //   System.out.println("parseString \t" + parseString(word));
        // System.out.println("hasPunc \t" + hasPunc(word));
        // System.out.println("hasAVowel \t" + hasAVowel(word));
        // System.out.println( "allVowels \t" + allVowels(word) );
        // System.out.println( "firstVowels \t" + firstVowel(word) );
        // System.out.println( "countVowels \t" + countVowels(word) );
        // System.out.println( "engToPig \t" + engToPig(word) );
      //   System.out.println( "---------------------" );
      // }

    }//end main()

}//end class Pig
