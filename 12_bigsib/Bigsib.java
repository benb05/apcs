/*
Benjamin Belotser
APCS
HW12 -- BigSib Pt 3: Preset Greetings
2021-10-05
DISCO:
-A file can utilize a class if it's in the same directory as the original file.
QCC:
-What is static, and what does it mean?
*/


public class BigSib {
        String HelloMsg;
	public void setHelloMsg(String message) {
		HelloMsg = message;

        }


	public String greet(String name) {
                String s;
                s = (HelloMsg +" "+ name);
                return s;
	}
}
