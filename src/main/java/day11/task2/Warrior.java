package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    Warrior(){
//        this.health=100;
        setPhysAtt(30);
        setPhysArmor(80);
    }

    @Override
    public void physicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(this.getPhysAtt()-getPhysAtt()*hero.getPhysArmor()/100));}

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
