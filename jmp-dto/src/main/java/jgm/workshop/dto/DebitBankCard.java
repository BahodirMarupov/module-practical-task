package jgm.workshop.dto;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 13/06/2022
 */
public class DebitBankCard extends BankCard{
    public DebitBankCard() {
    }

    public DebitBankCard(String number, User user) {
        super(number, user);
    }
}
