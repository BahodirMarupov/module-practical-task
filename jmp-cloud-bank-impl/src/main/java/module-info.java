import jgm.workshop.bank.api.IBank;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
module jmp.cloud.bank.impl {
    requires jmp.dto;
    requires transitive jmp.bank.api;
    provides IBank with jgm.workshop.cloud.bank.impl.Bank;
    exports jgm.workshop.cloud.bank.impl;
}