package jgm.workshop;

import java.time.LocalDate;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/06/2022
 */
public class User {
    private String name;
    private String surname;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
