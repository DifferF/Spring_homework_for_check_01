package task_04;




import task_04.fields_class.Age;
import task_04.fields_class.MaleFemale;
import task_04.fields_class.Status;
import task_04.fields_class.UserName;

public class User {

    private Status status;
    private MaleFemale maleFemale;
    private Age age;
    private UserName userName;

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public MaleFemale getSex() {
        return maleFemale;
    }

    public void setSex(MaleFemale maleFemale) {
        this.maleFemale = maleFemale;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }


}
