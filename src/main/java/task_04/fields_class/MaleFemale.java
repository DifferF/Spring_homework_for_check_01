package task_04.fields_class;

import task_04.UserInterface;

public class MaleFemale implements UserInterface {

    private String maleFemale;

    public void interUser() {
        System.out.println("Мой пол " + maleFemale);
    }

    public MaleFemale(String maleFemale) {
        this.maleFemale = maleFemale;
    }

    public MaleFemale() {
    }
}
