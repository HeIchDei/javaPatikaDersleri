public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private AItem[] AItems;

    public Inventory() {
        this.weapon = new Weapon(-1, "Yumruk",0,0);
        this.armor = new Armor(-1, "Paçavra",0,0);
        AItems = new AItem[3];
    }



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public AItem[] getItems() {
        return AItems;
    }

    public void setItems(AItem[] AItems) {
        this.AItems = AItems;
    }
}