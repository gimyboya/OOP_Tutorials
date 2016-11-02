package pkg;

/**
 * Created by gimy on 11/2/2016.
 */
public class Character {
    private String name;
    private int health;
    private int mana;
    private int health_potion;
    private int attack_strength;
    private Weapon weapon = new Weapon("Dagger", 10);

    public Character(String n,int strength){
        this.name = n;
        this.attack_strength = strength;
        this.health = 100;
        this.mana = 50;
        this.health_potion = 3;

    }

    public boolean isAlive(){
        if(this.health > 0){
            System.out.println(this.name + "is alive!");
            return true;
        }else{
            System.out.println(this.name + "is dead!");
            return false;
        }
    }




    public void drink_health_potion(){
        if(this.health_potion > 0){
            if(this.health < 100 ){
                this.health = this.health + 10;
                this.health_potion--;
                if(this.health > 100){
                    this.health = 100;
                }
                System.out.println("you used one potion for health you still have only" + this.health_potion);
            }else{
                System.out.println("you are healthy!");
            }
        }else{
            System.out.println("health potion out of stock");
        }
    }


    public void recive_damage(int strength){

        this.health = this.health - strength;
        System.out.println(this.getName() + "received " + strength + " damage" );
    }

    public void normal_attack(Character enemy){

        enemy.recive_damage(enemy.weapon.getDamage());
        System.out.println(this.getName() + " attacked " + enemy.getName() + "with " + this.weapon.getName() );
    }

    public void magical_attack(Character enemy){

        if(mana > 0){
            enemy.recive_damage(enemy.getAttack_strength());
            this.setMana((this.getMana() - 10));
            System.out.println(this.getName() + "attacked" + enemy.getName());
        }else{
            System.out.println("your mana is vanished!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int healh) {
        this.health = healh;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHealth_potion() {
        return health_potion;
    }

    public void setHealth_potion(int health_potion) {
        this.health_potion = health_potion;
    }

    public int getAttack_strength() {
        return attack_strength;
    }

    public void setAttack_strength(int attack_strength) {
        this.attack_strength = attack_strength;
    }

    public void setWeapon(Weapon w){
        this.weapon = w;
        System.out.println(this.getName() + "Is using " + w.getName() + " now");
    }
}
