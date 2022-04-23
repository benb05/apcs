public class personcreator{
    private String name;
    private int height;
    private int weight;
    private String eyecolor;
    
    public personcreator(){
    }

    public personcreator(String _name, int _height, int _weight, String _eyecolor){
        _name = name;
        _height = height; 
        _weight = weight;
        _eyecolor = eyecolor;

    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(eyecolor);

    }

    public void setName(String _name){
        name = _name;
    }

    public void setHeight(int _height){
        height = _height;
    }

    public void setWeight(int _weight){
        weight = _weight;
    }

    public void setEyeColor(String _eyecolor){
        eyecolor = _eyecolor;
    }



public static void main(String[] args) {
    personcreator bob = new personcreator();
    bob.setName("bob");
    bob.setHeight(50);
    bob.setWeight(150);
    bob.setEyeColor("brown");
    
    bob.showInfo();

}
}