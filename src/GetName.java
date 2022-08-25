import java.util.Scanner;

public class GetName {
    public static void main(String[] args) {
        Scanner ref= new Scanner(System.in);
        System.out.print("Write any name here:- ");
        String s=ref.nextLine();
        System.out.println("your given name is : " +s);
    }

}
