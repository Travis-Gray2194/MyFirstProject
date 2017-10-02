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
        System.out.println("What is something interesting about you");
        interesting = keyboard.nextLine();

        String from;
        System.out.println("Where are you from");
        from = keyboard.nextLine();


        System.out.println(" Hey my name is " +name+ " I'm  " +age+" Years old "+" my major during college was " +major+"."+" My java programming experince level is "+experince+" one interesting fact about me  "+interesting+",and I live in "+from);
    }
}
