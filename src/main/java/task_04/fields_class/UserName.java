package task_04.fields_class;

import task_04.UserInterface;

public class UserName implements UserInterface {

    private String userName;

    public void interUser() {
        System.out.println("Меня зовут " + userName);
    }

    public UserName(String userName) {
        this.userName = userName;
    }

    public UserName() {
    }
}
