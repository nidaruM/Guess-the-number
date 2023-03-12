import kotlin.random.Random
fun main(args: Array<String>) {
    var balance = 100
    println("ваш баланс:"+balance+" rub")


    while (true) {
        if (balance > 0) {
            print("ваша ставка в рублях:")
            var rub = readln()!!.toInt()
            if (balance>=rub) {
                println("выберите диапазон от 1 до 100")
                var t = readln()!!.toInt()
                var y = readln()!!.toInt()
                var randomValues = List(1) { Random.nextInt(0, 100) }
                println(randomValues)
                for (n in t..y) {
                    if (n >= randomValues[0] && n <= randomValues.last()) {
                        println("поздравляем, ваш выйгрыш составлеет:" + (rub * 100 / (y - t)))
                        balance = (balance - rub) + (rub * 100 / (y - t))
                        println("ваш баланс: " + balance)
                        break
                    } else if (n == y) {
                        println("нам очень жаль, вы проиграли")
                        balance = balance - rub
                        println("ваш баланс: " + balance+" rub")
                    }
                }
            }
            else if (rub > balance)
            {
                println("не хвотает средств, можете поставить " +balance+ " rub")

            }
        }
        else if (balance<=0)
        {
            println("на балансе 0 руб введите сумму кредита в руб:")
            var kr = readln()!!.toInt()
            balance =balance + kr
            println("ваш баланс :"+balance+" rub")
        }
    }
}