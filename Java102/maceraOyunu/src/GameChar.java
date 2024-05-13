public abstract class GameChar {

    private int id;
    private String name;
    private int dmg;
    private int hp;
    private int money;

    public GameChar(String name, int dmg, int hp, int money, int id) {
        this.name = name;
        this.dmg = dmg;
        this.hp = hp;
        this.money = money;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.hp = hp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
