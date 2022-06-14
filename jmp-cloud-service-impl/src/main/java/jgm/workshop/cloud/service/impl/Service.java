package jgm.workshop.cloud.service.impl;

import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.Subscription;
import jgm.workshop.dto.User;
import jgm.workshop.service.api.IService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public class Service implements IService {

    private final Map<User, List<BankCard>> userStorage = new ConcurrentHashMap<>();
    private final List<Subscription> subscriptions = new ArrayList<>();

    @Override
    public void subscribe(BankCard bankCard) {
        var user = bankCard.getUser();
        userStorage.computeIfAbsent(user, u -> new ArrayList<>()).add(bankCard);
        subscriptions.add(new Subscription(bankCard.getNumber(), LocalDate.now()));
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return subscriptions.stream()
                .filter(subscription -> subscription.getBankcard().equals(cardNumber))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return List.copyOf(userStorage.keySet());
    }
}
