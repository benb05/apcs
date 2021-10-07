/*
Benjamin Belotser
APCS
HW13 -- CONSTRUCTORS
2021-10-06
DISCOVERIES:
-Before when we created a new variable in the class, it would have no default value. We can use constructors to change that.
-We could probably set values for multiple variables using constructors.
-Constructors shorten and simplify code blocks, leading to more elegant code.
UNRESOLVED QUESTIONS:
-Does the variable still have to be defined outside the constructor?
-Do non-Instance Variables exist?
*/

public class BigSib {
 	String HelloMsg;
        public BigSib () {
		HelloMsg = "Word up" ;
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
