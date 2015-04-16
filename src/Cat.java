/**
 * Created by alexandraqin on 4/14/15.
 */
public class Cat {

  private String name;
  private String favoriteFood;
  private int age;
  private Person owner;

    private static int numberOfLegs = 4;

  public Cat() {
  }

  public Cat(String name) {
    this.name = name;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

    public static boolean isOlder(Cat catNameOne, Cat catNameTwo){

        int catOneAge = catNameOne.getAge();
        int catTwoAge = catNameTwo.getAge();

        if(catOneAge>catTwoAge){
            return true;
        }else{
            return false;
        }
    }

    public void makeBestFriends(Cat catNameA, Cat catNameB){
        catNameB.setFavoriteFood(catNameA.getFavoriteFood());
    }

    public static Cat makeKitten(Cat catNameA, Cat catNameB){
        Cat newKitten = new Cat();
        String catAname = catNameA.getName();
        String catBname = catNameB.getName();
        newKitten.setName(catAname+catBname);
        newKitten.setAge(0);
        return newKitten;
    }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public Person getOwner() {
    return owner;
  }

    public static void adoption (Cat catName, Person pName){
        if(catName.getName().equals("Catwoman")){
            System.out.println("Catwoman will never be anyone's pet!");
        }else{
            catName.setOwner(pName);
        }
    }

    public static boolean isFree(Cat catName){
        if(catName.getOwner()==null){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSibling(Cat catNameA, Cat catNameB){
        if(catNameA.getOwner().equals(catNameB.getOwner())){

            return true;

        }else{
            return false;
        }
    }
}
