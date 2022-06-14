package jgm.workshop.dto;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/06/2022
 */
public class CreditBankCard extends BankCard {
    public CreditBankCard() {
    }

    public CreditBankCard(String number, User user) {
        super(number, user);
    }
}
