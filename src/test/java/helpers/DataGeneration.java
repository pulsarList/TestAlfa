package helpers;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGeneration {

    private static final Faker fakerRU = new Faker(new Locale("en"));

    public static String getFullName() {
        return fakerRU.name().firstName() + fakerRU.name().fullName();
    }

    public static String getInvalidName() {
        return fakerRU.name().username();
    }

    public static String getPhone() {
        return fakerRU.phoneNumber().phoneNumber();
    }

    public static String getInvalidPhone() {
        return fakerRU.phoneNumber().cellPhone();
    }

    public static String getEmail() {
        return fakerRU.internet().emailAddress("en");
    }

    public static String getInvalidEmailNot_At() {
        String invalidEmail = fakerRU.internet().emailAddress();
        return invalidEmail.replace("@", "");
    }

    public static String getInvalidEmailNotDot() {
        String invalidEmail = fakerRU.internet().emailAddress();
        return invalidEmail.replace(".", "");
    }

}
