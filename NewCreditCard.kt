class NewCreditCard : CreditCard(0, 10000, 0) {

    private var bonusPercent = 1
    override var bonusPoints = 0


    override fun pay(price: Int) {
        println("Сумма списания: ")
        val price: Int = readLine()?.toInt()!!
        if (price > balance + creditLimit) {
            println("Недостаточно средств: ")
            return
        } else if (balance == 0) {
            super.printCheck(price,0 )
        } else if (balance > price) {
            bonusPoints = price * bonusPercent / 100
            println("Начисление бонусов: $bonusPoints")
            super.printCheck(0, balance - price)
        } else {
            val creditCash = price - balance
            bonusPoints = balance * bonusPercent / 100
            println("Начисление бонусов: $bonusPoints")

            super.printCheck(creditCash, 0)
        }
    }

}