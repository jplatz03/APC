package Aufgab_3.src;

public class Mail {
    String sender;
    String subject;
    String message;
    String datetime;
    boolean read = false;

    public void setRead() {
        read = true;
    }

    public Mail(String sender, String subject, String datetime,String message ) {
        this.sender = sender;
        this.message = message;
        this.datetime = datetime;
        this.subject = subject;

    }

    public void print() {
        System.out.println(subject + " from " + sender + " on " + datetime + " : " + message);
    }
}
