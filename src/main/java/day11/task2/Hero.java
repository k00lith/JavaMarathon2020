package day11.task2;

public abstract class Hero implements PhysAttack {

    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double points = physAtt - (physAtt * hero.physDef);
        if (hero.health - points < 0) {
            hero.health = 0;
        } else {
            hero.health -= points;
        }
    }
}
