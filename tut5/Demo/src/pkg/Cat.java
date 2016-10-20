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

        this("no name", 2);

        numberOfCats ++;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
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
    private String name;
}
