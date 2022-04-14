import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

// ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW91 -- Deque the Halls
// 2022-04-13
// time spent: 1 hrs

public class MRKPirateBae {
  public static void main(String[] args) {
    PolarExpress<String> ruawatrain = new PolarExpress<String>();
    System.out.println("Does the ruawatrain have no stowaways?\n" + ruawatrain.isEmpty() + "\nAll is well. WAIT, what's that noise?");
    ruawatrain.addFirst("Ben");
    ruawatrain.addFirst("David");
    ruawatrain.addFirst("Josiah");
    ruawatrain.addLast("Ben");
    ruawatrain.addLast("David");
    ruawatrain.addLast("Josiah");
    System.out.println("How many stowaways are on this train?\n" + ruawatrain.size() / 2 + "\n!!!!!\nGET THEM OFF MY TRAIN!");
    System.out.println("The screams of " + ruawatrain.removeFirst() + " can be heard as he falls out the window!");
    System.out.println("Is Josiah still on this train? " + ruawatrain.contains​("Josiah"));
    System.out.println("Wait, what the hell? Who invented cloning?");
    ruawatrain.removeLastOccurrence​("Josiah");
    System.out.println("The status of Josiah on this train: " + ruawatrain.contains("Josiah"));
    System.out.println();
    System.out.println("FINALLY! Where the other stowaways at?\nAh, there's one.");
    System.out.println("What's your name, boy?\n" + ruawatrain.peekFirst());
    System.out.println("WAIT, there's another one! What's your name, kid?\n" + ruawatrain.peekFirst());
    System.out.println("DAMN IT, WHERE THE CLONING MACHINE AT?");
    System.out.println("The screams of " + ruawatrain.removeFirst() + " echo across the room as he is tossed out the door.");
    System.out.println("DON'T FORGET THE CLONE!");
    ruawatrain.remove("David");
    System.out.println("The status of David on this train: " + ruawatrain.contains​("David"));
    System.out.println();
    System.out.println("Where's that last little bugger?");
    System.out.println("Hahahahaha");
    System.out.println("YOU'RE LAUGHING AT ME!");
    System.out.println("Wait what, no, I told the two of them I'd last on here the longest. Now, if you don't mind, I have to go cash in. Bye bye!");
    System.out.println("HEY, I NEED TO TEACH YOU A LESSON! GET OVER HERE!");
    System.out.println("The screams of " + ruawatrain.removeFirst() + " can be heard as he tumbles out of the caboose.");
    System.out.println("The clone of " + ruawatrain.removeLast() + " sneaks off before it can sustain more injuries.");
    System.out.println();
    System.out.println("Ben: GIVE ME THE MONEY, GUYS! WE AGREED TO IT.");
    System.out.println("Josiah: Wait, there was a fine print part that said it was a best of 3");
    System.out.println("David: YEP!");
    System.out.println();
    System.out.println("ROUND TWO COMMENCE!");
    ArrayList<String> r2 = new ArrayList<>(Arrays.asList("Josiah", "David", "Ben", "Ben", "David", "Josiah"));
    ruawatrain.addAll​(r2);
    System.out.println("Current stowaways (and their clones) WICKED");
    Iterator it = ruawatrain.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
