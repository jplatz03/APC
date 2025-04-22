package Aufgab_3.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inbox obj = new inbox();
        Mail erste = new Mail("Johannes", "Üben", "Freitag", "Wann üben wr das?");
        Mail zweite = new Mail("Nico", "Dringend", "Sonntag", "Wir müssen das üben");
        Mail dritte = new Mail("Robin", "Überdringend", "Montag", "Was soll das?");
        obj.store.add(erste);
        obj.store.add(zweite);
        obj.store.add(dritte);
        erste.setRead();
        System.out.println("ungelesene Mails: " + obj.countUnread());
        zweite.print();

    }
}
