package ua.zp.brain.labs.oop.basics.classes.packages.technics;

import java.util.Date;

public class PassportUtil {

    public static void warrantyReplace( Passport idItem ){
        Date warrantyStartDate = new Date();
        idItem.setWarrantyStartDate(warrantyStartDate);
    }

    private PassportUtil(){
        //закрытый конструктор
    }
}
