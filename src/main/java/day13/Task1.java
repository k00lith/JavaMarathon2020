package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("U1");
        User user2 = new User("U2");
        User user3 = new User("U3");

        user1.sendMessage(user2, "Hi there");
        user1.sendMessage(user2, "Whats up?");

        user2.sendMessage(user1, "Hi there, user1");
        user2.sendMessage(user1, "Whats up?, user2");
        user2.sendMessage(user1, "Norm");

        user3.sendMessage(user1, "i user3, send to user1");
        user3.sendMessage(user1, "how are you, u1");
        user3.sendMessage(user1, "iam good");

        user1.sendMessage(user3, "Hi there, u3");
        user1.sendMessage(user3, "Whats up? you friend u3");
        user1.sendMessage(user3, "go go go ");

        user3.sendMessage(user1, "Iam glad to hear you, u1");

        MessageDatabase.showDialog(user1, user3);
    }
}
