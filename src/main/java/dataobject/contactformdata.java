package dataobject;

import com.github.javafaker.Faker;

public interface contactformdata {
    Faker faker = new Faker();

    String fullName = faker.name().fullName();
    String email = "test@gmail.com";
    String titletest = "faker test";
    String simpletext =  "lorem impsum";


}
