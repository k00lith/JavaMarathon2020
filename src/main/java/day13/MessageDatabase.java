package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    /**
     * Этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
     * Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
     */
    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    /**
     * Возвращает список всех сообщений в “базе данных”
     */
    public static List<Message> getMessages() {
        return messages;
    }

    /**
     *Этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2
     */
    public static void showDialog(User u1, User u2) {
        for (Message msg : messages) {
            if ((msg.getSender() == u1 && msg.getReceiver() == u2) || (msg.getSender() == u2 && msg.getReceiver() == u1)) {
                System.out.println(msg.getSender() + ": " + msg.getText());
            }
        }
    }
}
