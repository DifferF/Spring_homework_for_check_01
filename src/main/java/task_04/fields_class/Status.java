package task_04.fields_class;

import task_04.UserInterface;

public class Status implements UserInterface {

    private String status;
    public void interUser() {
        System.out.println("Я " + status);
    }

    public Status(String status) {
        this.status = status;
    }

    public Status() {
    }
}
