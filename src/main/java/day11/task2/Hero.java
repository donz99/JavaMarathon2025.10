package day11.task2;

public abstract class Hero {
    private int health=100;
    private int physAtt;
    private int magicAtt;
    private int physArmor;
    private int magicArmor;
    private int healHimself;
    private int healTeamMate;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>100) this.health=100;
        else if (health<0) {this.health=0;
        System.out.println("Персонажа "+this.toString()+" убили.");}
        else this.health=health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public int getPhysArmor() {
        return physArmor;
    }

    public void setPhysArmor(int physArmor) {
        this.physArmor = physArmor;
    }

    public int getMagicArmor() {
        return magicArmor;
    }

    public void setMagicArmor(int magicArmor) {
        this.magicArmor = magicArmor;
    }

    public int getHealHimself() {
        return healHimself;
    }

    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }

    public int getHealTeamMate() {
        return healTeamMate;
    }

    public void setHealTeamMate(int healTeamMate) {
        this.healTeamMate = healTeamMate;
    }
}
