package ua.zp.brain.labs.oop.basics.classes.lab10;

public class Film {

    private String name;
    private int duration;
    private String genre;

    public static final String COMEDY = "comedy";
    public static final String FANTASY = "fantasy";
    public static final String HORRORS = "horrors";

    {
        System.out.println("Создается новый Фильм");
    }

    public Film(String name, int duration, String genre){
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + this.name + " успешно создан ");
    }

}
