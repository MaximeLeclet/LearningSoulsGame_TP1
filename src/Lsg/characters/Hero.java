package Lsg.characters;

public class Hero {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;

    public Hero() {
        name = "Gregooninator";
        maxLife = 100;
        life = maxLife;
        maxStamina = 50;
        stamina = maxStamina;
    }

    public Hero(String name) {
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

    // 6) Portected est la visibilité la plus adaptée pour acceder à cette méthode depuis le même package
    // 7) Public est la visibilité la plus adaptée pour acceder à cette méthode depuis d'autre packages
    public boolean isAlive() {
        return(this.getLife()>0);
    }

    public void printStats() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return ("[ Lsg.characters.Hero ]\t" + this.getName() + "\tLIFE: " + this.getLife() + "\tSTAMINA: " + this.getStamina() + "\t" + (this.isAlive() ? "(ALIVE)" : "(DEAD)" ));
    }

}
