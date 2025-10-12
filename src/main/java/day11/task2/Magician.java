package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    Magician(){
//        this.health=100;
        setPhysAtt(5);
        setMagicAtt(20);
        setMagicArmor(80);
    }

    @Override
    public void physicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(this.getPhysAtt()-getPhysAtt()*hero.getPhysArmor()/100));}

    @Override
    public void magicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(getMagicAtt()-getMagicAtt()*hero.getMagicArmor()/100));}

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
