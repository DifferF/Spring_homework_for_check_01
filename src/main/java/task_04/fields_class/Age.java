package task_04.fields_class;

import task_04.UserInterface;

public class Age implements UserInterface {
    private int ageAge;
    public void interUser() {
        System.out.println("Мне " + ageAge);
    }
    public Age(int ageAge) {
        this.ageAge = ageAge;
    }

    public Age() {
    }
}
