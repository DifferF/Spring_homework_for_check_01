package task_04;

import task_04.fields_class.Age;
import task_04.fields_class.MaleFemale;
import task_04.fields_class.Status;
import task_04.fields_class.UserName;
/*
Задание 4+
Изменить сильносвязный код на слабосвязный на примере класса User.
 */
public class Main {

    public static void main(String[] args) {

        User myUser = UserFactory.setUser(28,"Миша Крупин","Мужской","Студент");

        myUser.getAge().interUser();
        myUser.getSex().interUser();
        myUser.getUserName().interUser();
        myUser.getStatus().interUser();
    }

}

class UserFactory {

    public static User setUser(int age, String name, String maleFemale,String status){
        User user = new User();
        user.setAge(new Age(age));
        user.setUserName(new UserName(name));
        user.setSex(new MaleFemale(maleFemale));
        user.setStatus(new Status(status));
        return user;
    }

}






