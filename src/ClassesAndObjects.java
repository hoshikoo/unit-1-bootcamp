/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
      Cat garfield = new Cat ("Garfield");
      garfield.setFavoriteFood("Lasagna");
      garfield.setAge(3);

      Cat pinkPanther = new Cat ("Pink Panther");
      pinkPanther.setFavoriteFood("Grapes");
      pinkPanther.setAge(5);

      Cat catwoman = new Cat ("Catwoman");
      catwoman.setFavoriteFood("chicken");
      catwoman.setAge(8);

      System.out.println(Cat.isOlder(garfield, catwoman));
      Cat newcat = Cat.makeKitten(garfield, catwoman);
      System.out.println(newcat.getName());


      Person jon = new Person("Jon");
      Cat.adoption(garfield, jon);
      System.out.println(garfield.getOwner().getName());
      Cat.adoption(catwoman, jon);
      Cat.isFree(garfield);
      System.out.println(Cat.isSibling(garfield,catwoman));
  }
}
