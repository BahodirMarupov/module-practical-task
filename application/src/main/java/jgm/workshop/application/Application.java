package jgm.workshop.application;

import jgm.workshop.bank.api.IBank;
import jgm.workshop.cloud.bank.impl.Bank;
import jgm.workshop.cloud.service.impl.Service;
import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.User;
import jgm.workshop.service.api.IService;

import java.time.LocalDate;
import java.time.Month;

import static jgm.workshop.dto.BankCardType.CREDIT;
import static jgm.workshop.dto.BankCardType.DEBIT;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public class Application {

    public static void main(String[] args) {
        User user1 = new User(
                "name1",
                "surname1",
                LocalDate.of(1996, Month.MARCH, 12));
        User user2 = new User(
                "name2",
                "surname2",
                LocalDate.of(1993, Month.DECEMBER, 20));
        System.out.println("\n-------- Users initialized -----------");
        System.out.println(user1);
        System.out.println(user2);

        IBank bank = new Bank();
        BankCard creditCardOfUser1 = bank.createBankCard(user1, CREDIT);
        BankCard debitCardOfUser1 = bank.createBankCard(user1, DEBIT);
        BankCard creditCardOfUser2 = bank.createBankCard(user2, CREDIT);
        BankCard debitCardOfUser2 = bank.createBankCard(user2, DEBIT);
        System.out.println("\n-------- Bank cards initialized ------");
        System.out.println(creditCardOfUser1);
        System.out.println(debitCardOfUser1);
        System.out.println(creditCardOfUser2);
        System.out.println(debitCardOfUser2);

        IService service = new Service();
        service.subscribe(creditCardOfUser1);
        service.subscribe(debitCardOfUser1);
        service.subscribe(creditCardOfUser2);
        service.subscribe(debitCardOfUser2);
        System.out.println("\n------- Subscriptions -----------------");
        service.getSubscriptionByBankCardNumber(creditCardOfUser1.getNumber())
                .ifPresent(System.out::println);
        service.getSubscriptionByBankCardNumber(debitCardOfUser1.getNumber())
                .ifPresent(System.out::println);
        service.getSubscriptionByBankCardNumber(creditCardOfUser2.getNumber())
                .ifPresent(System.out::println);
        service.getSubscriptionByBankCardNumber(debitCardOfUser2.getNumber())
                .ifPresent(System.out::println);
        System.out.println("\n------- All subscribed users ----------");
        System.out.println(service.getAllUsers());

    }
}
