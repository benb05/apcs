import java.util.ArrayList;
 
public class arrayliststuff {
    
    public ArrayList arrayListExpander(ArrayList array, int size){
         int i = 0;
        while(i < size){
            array.add("");
            i++;
        }
        return array;
    }
 
    

    public static void main(String[] args) {
        ArrayList ogarray = new ArrayList();
        arrayliststuff j = new arrayliststuff();
        ogarray.arrayListExpander(ogarray, 5);
        System.out.println(j);

        ;
        
        
        
    }
}