public class arraypractice {
    
  public static  int [] samplearray = {0, 0, 0, 0, 0};
    public static int [] arrayFiller(int [] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);

        }
        return array;
    }

    public static void main(String[] args) {
        arrayFiller(samplearray);
        System.out.println(samplearray[1]);
    }



}
