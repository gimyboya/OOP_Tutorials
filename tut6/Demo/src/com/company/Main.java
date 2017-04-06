package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Weapon Dagger = new Weapon("Dagger", 10);
        Weapon InvisibleLance = new Weapon("Invisible Lance", 25);
        Weapon FlameBow = new Weapon("Flame Bow", 35);

        Character PhantomLancer = new Character("Phantome Lancer", 25);
        Character LegionCommander = new Character("Legion Commander", 15);

      PhantomLancer.setWeapon(InvisibleLance);

      LegionCommander.setWeapon(FlameBow);

      PhantomLancer.normal_attack(LegionCommander);

      System.out.println(LegionCommander.getName() +"Has " + LegionCommander.getHealth() + "health");

      LegionCommander.magical_atack(PhantomLancer);

      System.out.println(PhantomLancer.getName() + "has" + PhantomLancer.getHealth() + "health");


    }
}
