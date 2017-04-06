package pkg;

/**
 * Created by gimy on 10/19/2016.
 */
public class Cat {

    /**********
     * ============
     * Data Field
     * ============
     */
    private String name;

    private int age;

    public static int numberOfCats = 0;

    /**********
     * ============
     * End of Data Field
     * ============
     */


    /**********
     * ============
     * Constructors
     * ============
     */

    public Cat(){
        name = "No Name";
        numberOfCats ++;
    }

    public Cat(String n, int a){
        this.name = n;
        this.age = a;
        numberOfCats ++;
    }




    /**********
     * ============
     * End of Constructors
     * ============
     */

    /**********
     * ============
     * Methods
     * ============
     */

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void meow(){
        System.out.println("Meowwww!!!");
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    /**********
     * ============
     * End of Methods
     * ============
     */

}
