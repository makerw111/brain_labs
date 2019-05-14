package ua.zp.brain.labs.oop.basics.classes.packages.transport;

//     package-private class PassportUtil {

public class PassportUtil {

     public static Passport changeOwner( Passport oldPassport, String newOwner){
        if (oldPassport == null || newOwner == null) return null;
        Passport newPassport = new Passport();
        newPassport.setIdEngine(oldPassport.getIdEngine());
        newPassport.setNumberRegistration(oldPassport.getNumberRegistration());
        newPassport.setTitle(oldPassport.getTitle());
        newPassport.setType(oldPassport.getType());
        oldPassport.setType("EWRGEG");
        newPassport.setOwnerName(newOwner);
        return newPassport;
     }

   private PassportUtil(){
      //закрытый конструктор
   }
}
