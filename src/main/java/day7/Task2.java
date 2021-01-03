/**
 * Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
 * который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор
 * случайно сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока,
 * количество игроков на поле меняться не должно, проверить это.
 * Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
 * Вывести количество игроков на поле.
 */

package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(10) + 90);
        Player player2 = new Player(random.nextInt(10) + 90);
        Player player3 = new Player(random.nextInt(10) + 90);
        Player player4 = new Player(random.nextInt(10) + 90);
        Player player5 = new Player(random.nextInt(10) + 90);
        Player player6 = new Player(random.nextInt(10) + 90);
        Player.info();
    }
}
