package hw3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws RuntimeException, IOException {

        System.out.println("Please enter the following fata seperated with a space:\n surname, name, patronimic name, date of birth, phone number(numbers only) and sex(f/m)");

        while (true) {
            try {
                Person person = new Person();
                DataGetter.getPersonInfo(person);
                DataSaver.savePersonInfo(person);

                System.out.println("The data was saved");
                break;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                System.out.println("Try to enter the data again");
            }
        }

    }
}



