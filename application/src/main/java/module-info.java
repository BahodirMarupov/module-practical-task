/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
module application {
    requires jmp.service.api;
    requires jmp.bank.api;
    requires jmp.dto;

    uses jgm.workshop.service.api.IService;
    uses jgm.workshop.bank.api.IBank;
}