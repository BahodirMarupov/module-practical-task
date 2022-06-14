import jgm.workshop.service.api.IService;

/**
 * Author: Bakhodirjon_Marupov
 * Date: 14/06/2022
 */
module jmp.cloud.service.impl {
    requires jmp.dto;
    requires transitive jmp.service.api;
    provides IService with jgm.workshop.cloud.service.impl.Service;
    exports jgm.workshop.cloud.service.impl;
}