package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    Shaman(){
//        this.health=100;
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysArmor(20);
        setMagicArmor(20);
        setHealHimself(50);
        setHealTeamMate(30);
    }

    @Override
    public void physicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(this.getPhysAtt()-getPhysAtt()*hero.getPhysArmor()/100));}

    @Override
    public void magicalAttack(Hero hero) {hero.setHealth(hero.getHealth()-(getMagicAtt()-getMagicAtt()*hero.getMagicArmor()/100));}

    @Override
    public void healHimself() {this.setHealth(this.getHealth()+getHealHimself());}

    @Override
    public void healTeammate(Hero hero) {hero.setHealth(hero.getHealth()+getHealTeamMate());}

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
