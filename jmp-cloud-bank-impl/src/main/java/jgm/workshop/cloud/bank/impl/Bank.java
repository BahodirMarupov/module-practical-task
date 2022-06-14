package jgm.workshop.cloud.bank.impl;

import jgm.workshop.bank.api.IBank;
import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.BankCardType;
import jgm.workshop.dto.CreditBankCard;
import jgm.workshop.dto.DebitBankCard;
import jgm.workshop.dto.User;

import java.util.UUID;

import static jgm.workshop.dto.BankCardType.CREDIT;
import static jgm.workshop.dto.BankCardType.DEBIT;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public class Bank implements IBank {

    @Override
    public BankCard createBankCard(User user, BankCardType cardType) {
        if (CREDIT.equals(cardType)) {
            return new CreditBankCard(UUID.randomUUID().toString(), user);
        } else if (DEBIT.equals(cardType)) {
            return new DebitBankCard(UUID.randomUUID().toString(), user);
        } else {
            throw new IllegalArgumentException("wrong card type: " + cardType);
        }
    }
}
