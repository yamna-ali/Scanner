import java.util.Scanner;

public class GettingUserinput {

    public static void main(String[] args){
        Scanner keybd= new Scanner(System.in);
        String  firstName, lastName;
         int age;

        System.out.println("Please enter your first name ");

    firstName= keybd.nextLine();
    System.out.println("Hi, "+ firstName + " now enter your age");
       //at this point user hit 15 and enters
        age= keybd.nextInt();
        keybd.nextLine();
        System.out.println("you are " + age + " years old. ");
        System.out.println("What is your last name" );
        lastName= keybd.nextLine();
        System.out.println("Nice meeting you "+ firstName + " " + lastName );
}
}
