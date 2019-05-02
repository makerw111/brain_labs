package ua.zp.brain.labs.oop.basics.classes.lab10;

public class Main {
    public static void main(String[] args) {
        Library newLibrary = new Library("qwerty");
        int index=newLibrary.lookForIndex();
        while (index != -1){
            Film newFilm=new Film("test",0 , "unknown");
            Film[] list = newLibrary.getFilmLibrary();
            list[index]=newFilm;
            System.out.println();
        }
    }
}
