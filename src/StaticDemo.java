public class StaticDemo {
    static int a = 20;

    static void display() {
        System.out.println("This is my static method");
    }

    static {
        System.out.println("This is my static block");
    }
}
        class demo2{
            public static void main(String[] args) {
                System.out.println("This is my static variable " +StaticDemo.a);
                StaticDemo.display();
            }
        }

