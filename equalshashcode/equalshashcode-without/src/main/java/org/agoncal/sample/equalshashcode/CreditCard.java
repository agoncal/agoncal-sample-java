package org.agoncal.sample.equalshashcode;

public class CreditCard
{
   // ======================================
   // =             Attributes             =
   // ======================================

   private String creditCardNumber;
   private CreditCardType creditCardType;
   private String creditCardExpDate;

   // ======================================
   // =            Constructors            =
   // ======================================

   // ======================================
   // =         Getters & setters          =
   // ======================================

   public String getCreditCardNumber() {
      return creditCardNumber;
   }

   public void setCreditCardNumber(String creditCardNumber) {
      this.creditCardNumber = creditCardNumber;
   }

   public CreditCardType getCreditCardType() {
      return creditCardType;
   }

   public void setCreditCardType(CreditCardType creditCardType) {
      this.creditCardType = creditCardType;
   }

   public String getCreditCardExpDate() {
      return creditCardExpDate;
   }

   public void setCreditCardExpDate(String creditCardExpDate) {
      this.creditCardExpDate = creditCardExpDate;
   }
}