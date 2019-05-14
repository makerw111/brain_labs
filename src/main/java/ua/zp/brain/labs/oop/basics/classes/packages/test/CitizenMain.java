package ua.zp.brain.labs.oop.basics.classes.packages.test;


import ua.zp.brain.labs.oop.basics.classes.packages.citizen.Passport;
import ua.zp.brain.labs.oop.basics.classes.packages.citizen.PassportUtil;

import java.util.Date;

public class CitizenMain {
    public static void main(String[] args) {

        Passport passport1 = new Passport();
        passport1.setId(131007);
        passport1.setBirthday(new Date());
        passport1.setName("Mykola");
        System.out.println(passport1);

        Passport passport2 = new Passport();
        passport2.setId(135011);
        passport2.setBirthday(new Date());
        passport2.setName("Valya");
        System.out.println(passport2);

        PassportUtil.marriageRegistrate(passport1,passport2);
        System.out.println(passport1);
        System.out.println(passport2);

    }
}
