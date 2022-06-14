package jgm.workshop.application.exception;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
public class SubscriptionNotFoundException extends RuntimeException{
    public SubscriptionNotFoundException(String message) {
        super(message);
    }
}
