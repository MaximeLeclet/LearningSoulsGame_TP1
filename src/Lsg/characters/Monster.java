package Lsg.characters;

public class Monster {

    private static int INSTANCE_COUNT = 0;

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;

    public Monster() {
        INSTANCE_COUNT++;
        name = "Monster_" + INSTANCE_COUNT;
        maxLife = 10;
        life = maxLife;
        maxStamina = 10;
        stamina = maxStamina;
    }

    public Monster(String name) {
        this();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public boolean isAlive() {
        return(this.getLife()>0);
    }

    public void printStats() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return ("[ Lsg.characters.Monster ]\t" + this.getName() + "\tLIFE: " + this.getLife() + "\tSTAMINA: " + this.getStamina() + "\t" + (this.isAlive() ? "(ALIVE)" : "(DEAD)" ));
    }

}
