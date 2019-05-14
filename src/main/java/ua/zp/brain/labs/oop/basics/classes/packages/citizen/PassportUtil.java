package ua.zp.brain.labs.oop.basics.classes.packages.citizen;

public class PassportUtil {

//5.1 Для PassportUtil в пакете citizen создать статический метод по регистрации брака
    public static void marriageRegistrate(Passport idFirst, Passport idSecond) {

        if (idFirst == null || idSecond == null || idFirst.getId() == idSecond.getId()) {
            return;
        }
        idFirst.setSpouseId(idSecond.getId());
        idSecond.setSpouseId(idFirst.getId());
    }


    private PassportUtil() {
        //закрытый конструктор
    }
}
