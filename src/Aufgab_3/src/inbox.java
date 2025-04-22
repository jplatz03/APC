package Aufgab_3.src;

import java.util.ArrayList;

public class inbox {
    ArrayList<Mail> store=new ArrayList<>();

    public void printinbox(Mail mail) {
        System.out.println(mail.subject + "from" + mail.sender + "on" + mail.datetime);
    }

    public void headers() {
        for (int i = 0; i < store.size(); i++) {
            printinbox(store.get(i));
        }
    }

    public int countUnread() {
        int unread = 0;
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).read) ;
            unread++;
        }
        return unread;
    }

    public void open(int index) {
        if (index < store.size()) {
            store.get(index).print();
        }
    }

}
