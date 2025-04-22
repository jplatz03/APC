package Aufgab_1;

public class Textbook extends Book{
    String subject;

    @Override
    public String getInfo(){
        return "Das Buch"+title+"wurde von"+author+"im Jahr"+year+"geschrieben und gehört zum Fach"+subject;
    }
}
