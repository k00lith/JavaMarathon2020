package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }
    public void evaluate(Student student) {
        Random random = new Random();
        int mark = random.nextInt(5) + 1;
        String markWord;
        switch(mark) {
            case 5 :
                markWord = "Отлично";
                break;
            case 4 :
                markWord = "Хорошо";
                break;
            case 3 :
                markWord = "удовлетворительно";
                break;
            default:
                markWord = "неудовлетворительно";
        }
        System.out.println(
                "Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " +  object +
                " на оценку " + markWord + "."
        );
    }
}
