package com.secapp.business

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class TradeController {

   static scaffold = Trade

}
