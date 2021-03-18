package omc.demo.classes;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {
    public String userID;
    public Cache cache;

    public User(String id) {
        this.userID = id;
        cache = new Cache();
    }


    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
