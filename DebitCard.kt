class DebitCard(override var balance: Int = 0): BankCard(0,0,0, bonusPoints = 0, cashback = 0.0) {
    override fun addMoney() {
        super.addMoney()
    }

    override fun balanceInfo() {
        super.balanceInfo()
    }

}