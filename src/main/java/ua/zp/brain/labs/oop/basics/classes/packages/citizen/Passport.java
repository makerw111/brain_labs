package ua.zp.brain.labs.oop.basics.classes.packages.citizen;

import java.util.Date;

public class Passport {

    private String name;
    private int id;
    private Date birthday;
    private int spouseId;

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                ", spouseId=" + spouseId +
                '}';
    }
}
