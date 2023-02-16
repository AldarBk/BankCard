abstract class BankCard(
    open var balance: Int,
    open var creditLimit: Int,
    open var creditCount: Int,
    open var bonusPoints: Int,
    open var cashback: Double
) {
    val paymentSuccess = false

    open fun addMoney() {
        println("Введите сумму")
        val n = readLine()?.toInt()!!
        balance += n
        println("Пополнение на $n")
    }

    open fun pay() {
        println("Сумма списания: ")
        val n = readLine()
        val actualBalance = balance - n!!.toInt()
        println("Собственные средства: $actualBalance")
    }

    open fun balanceInfo() {
        println("Собственные средства: $balance ")
    }
    open fun creditInfo(){
        println("Кредитный лимит: $creditLimit")

        println("Кредитные средства: $creditCount")
    }
}