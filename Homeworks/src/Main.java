import cz.cvut.k36.omo.hw.hw01.Homework1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Homework1 instance1 = new Homework1();
        Homework1 instance2 = new Homework1();

        System.out.println("instance1.f() = " + instance1.f());
        System.out.println("instance1.g() = " + instance1.g());
        System.out.println("instance1.h() = " + instance1.h());
        for (int i = 0; i < 5; i++) {
            instance1.h();
        }
        System.out.println("instance1.h() = " + instance1.h());
        System.out.println("instance1.i() = " + instance1.i());

        System.out.println();

        System.out.println("instance2.f() = " + instance2.f());
        System.out.println("instance2.g() = " + instance2.g());
        System.out.println("instance2.h() = " + instance2.h());
        for (int i = 0; i < 7; i++) {
            instance2.h();
        }
        System.out.println("instance2.h() = " + instance2.h());
        System.out.println("instance2.i() = " + instance2.i());

    }
}