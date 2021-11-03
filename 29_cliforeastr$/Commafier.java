public class Commafier {
    public static void main(String[] args) {
      /*
        //Recursive Tests
        System.out.println("Recursive Tests:");
        System.out.println( commafyR(1) );
        System.out.println( commafyR(100) );
        System.out.println( commafyR(1000) );
        System.out.println( commafyR(10000) );
        System.out.println( commafyR(100000) );
	System.out.println( commafyR(1000000) );
        //Iterative Tests
        System.out.println("Iterative Tests:");        
        System.out.println( commafyF(1) );
        System.out.println( commafyF(100) );
        System.out.println( commafyF(1000) );
        System.out.println( commafyF(10000) );
        System.out.println( commafyF(100000) );
        */
      
    	for(String arg: args){
          int number = Integer.parseInt(arg);
          System.out.println( commafyF(number) );
        }
    }
  //Recursive
    public static String commafyR(int number){
        /**
         * Using Recursion, this method will "commafy" a number
         */
      	String stringNumber = Integer.toString(number);
      	//Base Case
      	if (stringNumber.length() < 4){
          return stringNumber;
        }
        //Recursive Reduction
        return commafyR(number/1000) + "," + stringNumber.substring( stringNumber.length()-3, stringNumber.length() );
    }
  //Iterative
   public static String commafyF(int number) {
        /**
         * Using Iteration, this method will "commafy" a number
         */
        //Convert number to a string
        String stringNumber = Integer.toString(number);
     	String result;
        //If number is less than 1000, and doesnt need commas
        if (stringNumber.length() < 4) {
            return stringNumber;
        }
     	//Find starting point of the loop
     	int start = stringNumber.length()%3;
     	if(start==0){start = 3;};
        result = stringNumber.substring(0, start); //add the numbers before starting point to result
        for (int i = start; i < stringNumber.length(); i = i + 3) {
          result += "," + stringNumber.substring(i, i + 3);
        }
        return result;
   }
} //end for class
