package jgm.workshop.service.api;

import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.Subscription;
import jgm.workshop.dto.User;

import java.util.List;
import java.util.Optional;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public interface IService {

    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber);

    List<User> getAllUsers();

}
