import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть ваше ім'я: ");
        String name=scanner.nextLine();
        System.out.println("Введіть ваше прізвище: ");
        String surname=scanner.nextLine();
        System.out.println("Введіть який ви курс(1-4): ");
        int course=scanner.nextInt();
        System.out.println("Введіть рік вступу: ");
        int yearEntered=scanner.nextInt();
        scanner.nextLine();

        Student student;

        System.out.println("Чи плануєте ви поступати на магістратуру?: ");
        String answer=scanner.nextLine();
        boolean magistr=answer.equalsIgnoreCase("так");
        if (magistr){
            student=new Magistr(name,surname,course,yearEntered,magistr);
        }
        else{
            student=new Student(name, surname, course,yearEntered);
        }

        student.printInfo();


    }
}