public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Hello!");
    BigSib spaceboy = new BigSib();
    spaceboy.setHelloMsg("Greetings");
    BigSib timmy = new BigSib();
    timmy.setHelloMsg("How's it hanging");
    BigSib boy = new BigSib();
    boy.setHelloMsg("Hey");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = spaceboy.greet("Neil Armstrong");
    System.out.println(greeting);
    greeting = timmy.greet("Wario");
    System.out.println(greeting);
    greeting = boy.greet("grandma");
    System.out.println(greeting);



  } //end main()
} //end Greet
