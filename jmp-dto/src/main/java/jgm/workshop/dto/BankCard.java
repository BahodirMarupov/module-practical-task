package jgm.workshop.dto;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/06/2022
 */
public abstract class BankCard {
    private String number;
    private User user;

    public BankCard() {
    }

    public BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
