package jgm.workshop;

import java.time.LocalDate;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/06/2022
 */
public class Subscription {
    private String bankcard;
    private LocalDate startDate;

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
