package io.sweetheart.examples.pis.abstractMembers

object AbstractCurrencyObj {
  abstract class AbstractCurrency {
    type Currency <: AbstractCurrency
    val amount: Long
    def designation: String
    override def toString = amount + " " + designation
    def + (that: Currency): Currency = new Currency {
      val amount = this.amount + that.amount
    }
  }
}
