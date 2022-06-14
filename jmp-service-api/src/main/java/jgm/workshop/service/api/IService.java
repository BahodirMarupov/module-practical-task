package jgm.workshop.service.api;

import jgm.workshop.dto.BankCard;
import jgm.workshop.dto.Subscription;
import jgm.workshop.dto.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public interface IService {

    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();

    default double getAverageUsersAge() {
        List<User> subscribedUsers = getAllUsers();
        long usersCount = subscribedUsers.size();
        LocalDate now = LocalDate.now();
        long usersAge = subscribedUsers.stream()
                .map(User::getBirthday)
                .mapToLong(birthDate -> ChronoUnit.YEARS.between(birthDate, now))
                .sum();
        return (double) usersAge / usersCount;
    }

    static boolean isPayableUser(User user) {
        return ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) > 18;
    }

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate);

}
