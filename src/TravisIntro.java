
import java.util.Scanner;

public class TravisIntro {
    public static void main (String args[])
    {
        String name;
        System.out.println("Enter your name");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();

        String age;
        System.out.println("Enter your age");
        age = keyboard.nextLine();

        String experince;
        System.out.println("What is your level of experince with java?");
        experince = keyboard.nextLine();


        String major;
        System.out.println("What was your major during University?");
        major = keyboard.nextLine();

        String interesting;
        long inter;
        System.out.println("What is something interesting about you");
        interesting = keyboard.nextLine();

        String from;
        System.out.println("Where are you from");
        from = keyboard.nextLine();


        System.out.println(" Hey I'm " +name+ " I'm   " +age+ " Years old "+" My major in university was " +major+ " one interesting fact about me is "+" I'm live in "+from);
    }
}
