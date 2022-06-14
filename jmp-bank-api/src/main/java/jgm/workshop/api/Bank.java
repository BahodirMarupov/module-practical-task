package jgm.workshop.api;


import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.BankCardType;
import jgm.workshop.dto.User;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public interface Bank {
    BankCard createBankCard(User user, BankCardType cardType);
}
