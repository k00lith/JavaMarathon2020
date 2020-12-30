/**
 *  * Создать новый объект класса Самолет с произвольными данными.
 *  * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения.
 *  * Вызвать метод info().
 */

package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 1995, 150,30);
        airplane.setYear(2000);
        airplane.setLength(200);
        airplane.fillUp(30);
        airplane.fillUp(30);
        airplane.info();
    }
}
