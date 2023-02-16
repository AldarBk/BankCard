abstract class CreditCard(balance: Int, creditLimit: Int, override var creditFunds: Int) :
    BankCard(balance, creditLimit, creditCount = 10000, bonusPoints = 0, cashback = 0.0) {

    override var creditCount = creditLimit
    override var balance = 0
    override var bonusPoints: Int = 0
    override var cashback: Double = 0.0

    override fun pay(price: Int){
        if (price < 0 || price <= balance)
            super.pay(price)
        else{
            val difference = price - balance
            if (balance > 0) balance = 0
            creditFunds -= difference
        }
    }

    fun printCheck(creditCash: Int, balanceCash: Int) {
        creditCount -= creditCash
        println("Списание средств: $creditCount\nСобственные средства:$balance\nКредитные средства: $creditCount")
        println("Кэшбэк: $cashback \nБонусные балл: $bonusPoints \nВсего: ${cashback + bonusPoints + balance}")
    }

}
