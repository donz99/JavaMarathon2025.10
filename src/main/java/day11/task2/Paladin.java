package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    Paladin(){
//        this.health=100;
        setPhysAtt(15);
        setPhysArmor(50);
        setMagicArmor(20);
        setHealHimself(25);
        setHealTeamMate(10);
    }



    @Override
    public void physicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(this.getPhysAtt()-getPhysAtt()*hero.getPhysArmor()/100));}

    @Override
    public void healHimself() {this.setHealth(this.getHealth()+getHealHimself());}

    @Override
    public void healTeammate(Hero hero) {hero.setHealth(hero.getHealth()+getHealHimself());}

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
