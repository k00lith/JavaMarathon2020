/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель.
 * Выведите в консоль название учебной группы у объекта-студента и название предмета у объекта-преподавателя.
 * Затем, вызовите printInfo() на объектах и посмотрите на результат.
 */

package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vasya","Math" );
        Teacher teacher = new Teacher("Ivan Ivanovich", "Biology");
        student.printInfo();
        teacher.printInfo();
    }
}
