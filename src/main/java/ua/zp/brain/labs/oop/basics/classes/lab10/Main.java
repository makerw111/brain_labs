package ua.zp.brain.labs.oop.basics.classes.lab10;

public class Main {
    public static void main(String[] args) {
        Library newLibrary = new Library(" My best films ");
        int index = newLibrary.lookForIndex();
        int sizeLib = newLibrary.sizeLibrary();
        Film[] listLib = newLibrary.getFilmLibrary();

        while (index < sizeLib) {
            Film newFilm = new Film("test", 0, "unknown");
            listLib[index++] = newFilm;
       }
        System.out.println("Вы достигли лимита");

    }
}
