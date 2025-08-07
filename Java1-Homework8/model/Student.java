package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int id;
    private String name;
    private LocalDate birthday;
    private String phone;

    public Student(int id, String name, String birthday, String phone) {
        this.id = id;
        this.name = name;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Birthday: %s | Phone: %s",
                id, name, birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), phone);
    }
}
