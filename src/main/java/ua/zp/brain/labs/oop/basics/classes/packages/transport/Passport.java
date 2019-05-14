package ua.zp.brain.labs.oop.basics.classes.packages.transport;

public class Passport {
    private int numberRegistration;
    private String title;
    private String type;
    private int idEngine;
    private String  ownerName;

/*
//Создать публичный, не статический метод changeOwner, который принимает имя
//нового владельца.
//Внутри метода вызвать существующий статический метод, передав в качестве
//объекта паспорта – this.
*/
    public Passport changeOwner(String newName){
        return PassportUtil.changeOwner(this, newName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getNumberRegistration() {
        return numberRegistration;
    }

    public void setNumberRegistration(int numberRegistration) {
        this.numberRegistration = numberRegistration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdEngine() {
        return idEngine;
    }

    public void setIdEngine(int idEngine) {
        this.idEngine = idEngine;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberRegistration=" + numberRegistration +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", idEngine=" + idEngine +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
