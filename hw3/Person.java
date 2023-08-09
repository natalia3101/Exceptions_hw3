package hw3;


public class Person {

    String surname;
    String name;
    String patronimicName;
    String birthday;
    String phone;
    String sex;

    public void Person(String surname, String name, String patronimicName, String birthday, String phone, String sex) {
        this.surname = surname;
        this.name = name;
        this.patronimicName = patronimicName;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronimicName() {
        return patronimicName;
    }

    public void setPatronimicName(String patronimicName) {
        this.patronimicName = patronimicName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, name, patronimicName, birthday, phone, sex);
    }


}

