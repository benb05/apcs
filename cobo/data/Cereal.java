public class Cereal {
  private String name, type;
  private int calories, protein, fat, sodium, fiber, carbohydrates, sugar, potassium, vitamins, shelf;
  private double weight, cups, rating;

  public Cereal( String nickname, String nicktype,
                 int nickcalories, int nickprotein, int nickfat, int nicksodium, int nickfiber,
                 int nickcarbohydrates, int nicksugar, int nickpotassium, int nickvitamins, int nickshelf,
                 double nickweight, double nickcups, double nickrating
               )
  {
    name = nickname;
    type = nicktype;
    calories = nickcalories;
    protein = nickprotein;
    fat = nickfat;
    sodium = nicksodium;
    fiber = nickfiber;
    carbohydrates = nickcarbohydrates;
    sugar = nicksugar;
    potassium = nickpotassium;
    vitamins = nickvitamins;
    shelf = nickshelf;
    weight = nickweight;
    cups = nickcups;
    rating = nickrating;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getCalories() {
    return calories;
  }

  public int getProtein() {
    return protein;
  }

  public int getFat() {
    return fat;
  }

  public int getSodium() {
    return sodium;
  }

  public int getFiber() {
    return fiber;
  }

  public int getCarbohydrates() {
    return carbohydrates;
  }

  public int getSugar() {
    return sugar;
  }

  public int getPotassium() {
    return potassium;
  }

  public int getVitamins() {
    return vitamins;
  }

  public int getShelf() {
    return shelf;
  }

  public double getWeight() {
    return weight;
  }

  public double getCups() {
    return cups;
  }

  public double getRating() {
    return rating;
  }

  public String toString() {
    String result = "Name: " + name + "\n";
    result += "Type: " + type + "\n";
    result += "Calories: " + calories + "\n";
    result += "Protein: " + protein + "\n";
    result += "Fat: " + fat + "\n";
    result += "Sodium: " + sodium + "\n";
    result += "Fiber: " + fiber + "\n";
    result += "Carbohydrates: " + carbohydrates + "\n";
    result += "Sugar: " + sugar + "\n";
    result += "Potassium: " + potassium + "\n";
    result += "Vitamins: " + vitamins + "\n";
    result += "Shelf: " + shelf + "\n";
    result += "Weight: " + weight + "\n";
    result += "Cups: " + cups + "\n";
    result += "Rating: " + rating;
    return result;
  }

  public static void main(String[] args) {
    Cereal appleJacks = new Cereal("Apple Jacks", "C", 110, 2, 0, 125, 1, 11, 14, 30, 25, 2, 1.0, 1.0, 33.174094);
    System.out.println(appleJacks);
    System.out.println(appleJacks.getName());
    System.out.println(appleJacks.getType());
    System.out.println(appleJacks.getCalories());
    System.out.println(appleJacks.getProtein());
    System.out.println(appleJacks.getFat());
    System.out.println(appleJacks.getSodium());
    System.out.println(appleJacks.getFiber());
    System.out.println(appleJacks.getCarbohydrates());
    System.out.println(appleJacks.getSugar());
    System.out.println(appleJacks.getPotassium());
    System.out.println(appleJacks.getVitamins());
    System.out.println(appleJacks.getShelf());
    System.out.println(appleJacks.getWeight());
    System.out.println(appleJacks.getCups());
    System.out.println(appleJacks.getRating());
    Cereal cheerios = new Cereal("Cheerios", "C", 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1.0, 1.25, 50.764999);
    System.out.println(cheerios);
    System.out.println(cheerios.getName());
    System.out.println(cheerios.getType());
    System.out.println(cheerios.getCalories());
    System.out.println(cheerios.getProtein());
    System.out.println(cheerios.getFat());
    System.out.println(cheerios.getSodium());
    System.out.println(cheerios.getFiber());
    System.out.println(cheerios.getCarbohydrates());
    System.out.println(cheerios.getSugar());
    System.out.println(cheerios.getPotassium());
    System.out.println(cheerios.getVitamins());
    System.out.println(cheerios.getShelf());
    System.out.println(cheerios.getWeight());
    System.out.println(cheerios.getCups());
    System.out.println(cheerios.getRating());
  }

}
