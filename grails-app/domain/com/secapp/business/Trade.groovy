package com.secapp.business

class Trade {

   String security
   Date date
   BigDecimal amount

   static constraints = {
      security minSize: 3
   }

}
