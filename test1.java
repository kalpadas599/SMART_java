
import java.util.*;

class training {
    String name;
    public training(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Trainer is teaching " + name);
    }

}

public class test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            training ti = new training(name);

            ti.display();
        }
    }
}
