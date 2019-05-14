package ua.zp.brain.labs.oop.basics.classes.packages.test;

import ua.zp.brain.labs.oop.basics.classes.packages.transport.Passport;
import ua.zp.brain.labs.oop.basics.classes.packages.transport.PassportUtil;

public class TransportMain {

    public static void main(String[] args) {
// Call changeOwner as a method class of  PassportUtil
        Passport lanos = PassportUtil.changeOwner(new Passport(), "qwewr");
        System.out.println(lanos);
        lanos = new Passport();
        lanos.setOwnerName("Mykola");
        lanos.setTitle("Avtoshka");
        System.out.println(lanos);
// 8.3 Call changeOwner as a method instance the class of PassportUtil
        Passport lanos2 = lanos.changeOwner("Vasya");
        System.out.println(lanos);
        System.out.println(lanos2);
    }
}