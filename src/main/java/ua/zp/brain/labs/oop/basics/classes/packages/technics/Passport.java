package ua.zp.brain.labs.oop.basics.classes.packages.technics;
import java.util.Date;

public class Passport {
    private int idPic;
    private String countryMade;
    private int cost;
    private Date warrantyStartDate;

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public int getIdPic() {
        return idPic;
    }

    public void setIdPic(int idPic) {
        this.idPic = idPic;
    }

    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "idPic=" + idPic +
                ", countryMade='" + countryMade + '\'' +
                ", cost=" + cost +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
