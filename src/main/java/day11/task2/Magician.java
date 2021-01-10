package day11.task2;

public class Magician extends Hero implements MagicAttack {

    double magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double points = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - points < 0) {
            hero.health = 0;
        } else {
            hero.health -= points;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
