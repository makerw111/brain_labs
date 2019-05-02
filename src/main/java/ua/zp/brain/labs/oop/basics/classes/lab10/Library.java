package ua.zp.brain.labs.oop.basics.classes.lab10;

public class Library {
    private final Film[] filmLibrary;
    private final String nameLibrary;

    {
        filmLibrary = new Film[5];
        filmLibrary[0] = new Film("first", 90, Film.COMEDY);
        filmLibrary[1] = new Film("second", 120, Film.FANTASY);
        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String a) {
        this.nameLibrary = a;
        System.out.println("Library " + this.nameLibrary + " successfully");
    }

    public Film[] getFilmLibrary() {
        return filmLibrary;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public int lookForIndex (){

        for (int i = 0; i < filmLibrary.length; i++) {
            if(null==filmLibrary[i]){
                return i;
            }
        }
        return -1;
    }
}
