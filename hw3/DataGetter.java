package hw3;

import java.util.Scanner;

public class DataGetter {
    
    public static void getPersonInfo(Person person) throws RuntimeException {

        Scanner scanner;
        scanner = new Scanner(System.in);
        String inputInfo = scanner.nextLine();

        // делаем массив из введенной строки
        String[] inputArray = inputInfo.split(" ");

        String surname = inputArray[0].trim();
        String name = inputArray[1].trim();
        String patronimicName= inputArray[2].trim();
        String birthday = inputArray[3].trim();
        String phone = inputArray[4].trim();
        String sex = inputArray[5].trim();

        if (inputArray.length != 6) {
            throw new RuntimeException("The info you have entered do not meet the input criteria, please try again");
        }
        else {
            if (surname.isEmpty())
                throw new RuntimeException("You have not enter the surname");
            if (name.isEmpty())
                throw new RuntimeException("You have not enter the name");
            if (patronimicName.isEmpty())
                throw new RuntimeException("You have not enter the patronimic name");
            if (birthday.isEmpty())
                throw new RuntimeException("You have not enter the date of birth");
            if (!phone.matches("\\d+")) {
                throw new RuntimeException("The phone number can contain only numbers");
            }
            if (!sex.equals("m") && !sex.equals("f")) {
                throw new RuntimeException("The sex can be marked either f or m");
            }

            person.Person(surname, name, patronimicName, birthday, phone, sex);
        }
    }

}
