package ua.zp.brain.labs.oop.basics.classes.packages.test;

import ua.zp.brain.labs.oop.basics.classes.packages.technics.Passport;
import ua.zp.brain.labs.oop.basics.classes.packages.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        Date date = new Date(117,6,17,11,33,20);
        System.out.println(date);
        Passport item = new Passport();
        item.setIdPic(2371);
        item.setCost(125);
        item.setCountryMade("USA");
        item.setWarrantyStartDate( date );
        System.out.println(item);

        PassportUtil.warrantyReplace(item);
        System.out.println(item);

    }
}
