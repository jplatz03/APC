package Aufgab_1;

public class Book extends Publications{
    String author;

    @Override
    public String getInfo(){
        return "Das Buch"+title+"wurde von"+author+"im Jahr"+year+"geschrieben";
    }


}
