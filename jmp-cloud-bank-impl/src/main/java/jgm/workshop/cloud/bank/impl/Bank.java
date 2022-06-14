package jgm.workshop.cloud.bank.impl;

import jgm.workshop.bank.api.IBank;
import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.BankCardType;
import jgm.workshop.dto.CreditBankCard;
import jgm.workshop.dto.DebitBankCard;
import jgm.workshop.dto.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;

import static jgm.workshop.dto.BankCardType.CREDIT;
import static jgm.workshop.dto.BankCardType.DEBIT;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public class Bank implements IBank {

    private final Map<BankCardType, BiFunction<String, User, BankCard>> cardCreators;

    public Bank() {
        cardCreators = new HashMap<>();
        cardCreators.put(CREDIT, CreditBankCard::new);
        cardCreators.put(DEBIT, DebitBankCard::new);
    }

    @Override
    public BankCard createBankCard(User user, BankCardType cardType) {
        return cardCreators.get(cardType).apply(UUID.randomUUID().toString(), user);
    }
}
