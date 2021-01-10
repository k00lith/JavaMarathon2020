package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    double magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
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
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 25 > 100) {
            hero.health = 100;
        } else {
            hero.health += 25;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
