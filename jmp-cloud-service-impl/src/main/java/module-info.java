/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
module jmp.cloud.service.impl {
    requires jmp.dto;
    requires transitive jmp.service.api;
    exports jgm.workshop.cloud.service.impl;

    provides jgm.workshop.service.api.IService
            with jgm.workshop.cloud.service.impl.Service;
}