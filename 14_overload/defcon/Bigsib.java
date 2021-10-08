/*
Ben Belotser
APCS
HW14 -- Overloaded CONSTRUCTORS
2021-10-07
DISCO:
-Using Overloaded Constructors, you can define multiple objects connected to a member of a class in one concise line of code.
-Default constructors must be present in the code before Overloaded Constructors can be used.
QCC: No unanswered questions

*/



public class BigSib {
 	String HelloMsg;
	String greeting;
        public BigSib () {
		HelloMsg = "Word up" ;
		greeting = "new guy!";
	}

	public void setHelloMsg(String message) {
		HelloMsg = message;

        }


	public String greet(String name) {
                String s;
                s = (HelloMsg +" "+ name);
                return s;
	}
}
