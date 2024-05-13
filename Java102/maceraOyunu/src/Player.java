import java.util.Scanner;

public class Player {

    private int dmg;
    private int hp;
    private int maxHp;
    private int money;
    private String name;
    private GameChar gameChar;
    private String charName;
    private Inventory inventory;
    private Scanner inp = new Scanner(System.in);

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Knight(), new Archer(), new AAATestClass()};

        System.out.println("-------------------------------------------------------------------");
        for(GameChar gameChar : charList){
            System.out.println("ID: " + gameChar.getId() +
                    " \t Karakter: " + gameChar.getName() +
                    " \t Hasar: " + gameChar.getDmg() +
                    " \t Sağlık: " + gameChar.getHp() +
                    " \t Para: " + gameChar.getMoney());
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.print("Karakterini seç: ");
        int selectChar = inp.nextInt();
        switch(selectChar){
            case 1:
                this.gameChar = new Samurai();
                break;
            case 3:
                this.gameChar = new Archer();
                break;
            case 4:
                this.gameChar = new AAATestClass();
                break;
            default:
                this.gameChar = new Knight();
                break;
        }
        this.setCharName(this.gameChar.getName());
        this.setDmg(this.gameChar.getDmg());
        this.setHp(this.gameChar.getHp());
        this.setMaxHp(this.gameChar.getHp());
        this.setMoney(this.gameChar.getMoney());

        System.out.println( this.getCharName() + " karakterini seçtin! İşte özelliklerin:");
        System.out.println("Hasar: " + this.getDmg() +
                " \t Sağlık: " + this.getHp() +
                " \t Para: " + this.getMoney());


    }


    public void printStatus(){
        System.out.println(
                "Silahın: " + this.getInventory().getWeapon().getName() +
                " \t Hasar: " + this.getTotalDmg() +
                " \t Sağlık: " + this.getHp() +
                " \t Zırh: " + this.getArmor().getName() +
                " \t Koruma: " + this.getArmor().getDef() +
                " \t Para: " + this.getMoney());
    }


    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDmg(){
        return dmg + this.getInventory().getWeapon().getDmg();

    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public Armor getArmor(){
        return this.getInventory().getArmor();
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
