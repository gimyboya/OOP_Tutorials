package pkg;

public class Main {

    public static void main(String[] args) {

        Weapon InvisibleLance = new Weapon("Invisible Lance", 25);
        Weapon FlameBow = new Weapon("Flame bow", 35);

        Character PhantomLance = new Character("Phantom lance", 25);
        Character LegionCommander = new Character("Legion Commander", 15);

        PhantomLance.setWeapon(InvisibleLance);

        LegionCommander.setWeapon(FlameBow);

        PhantomLance.normal_attack(LegionCommander);

        System.out.println(LegionCommander.getName() +"Has " + LegionCommander.getHealth() + "health");

        LegionCommander.magical_attack(PhantomLance);

        System.out.println(PhantomLance.getName() + "has" + PhantomLance.getHealth() + "health");

    }
}
