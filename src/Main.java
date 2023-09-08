import Chaise.Objet;
import User.User;

public class Main {
    public static void main(String[] args) {
        Objet obj1 = new Objet("obj1");
        Objet obj2 = new Objet("obj1", 4, "rouge", "bois");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        User u1 = new User();
        u1.setName("Tom");
        User u2 = new User("Toto");
        User u3 = new User("Toto2");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}