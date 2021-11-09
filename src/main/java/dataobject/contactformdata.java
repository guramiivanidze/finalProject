package dataobject;

import com.github.javafaker.Faker;

public interface contactformdata {
    Faker faker = new Faker();

    String fullName = faker.name().fullName();
    String email = "test@gmail.com";
    String subject = "faker test";
    String simpletext =  "lorem impsumlorem impsumlorem " +
            "impsumlorem impsumlorem impsumlorem impsumlorem impsum";
    String errormsg = "გთხოვთ შეავსოთ ყველა სავალდებულო ველი";
    String successMsg = "ფორმა წარმატებით გაიგზავნა";
}
