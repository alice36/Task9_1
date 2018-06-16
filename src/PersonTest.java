import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imie");
        String name = input.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = input.nextLine();

        System.out.println("Podaj wiek");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Podaj pesel");
        String pesel = input.nextLine();

        try{
            Person person = new Person(name, lastName, age, pesel);
            System.out.println(person.toString());
        } catch( NameUndefinedException e){
            System.out.println(e.getMessage());
        } catch( IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
