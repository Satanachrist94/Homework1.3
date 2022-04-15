val DISCOUNT_STANDART = 100
val SILVER_DISCOUNT = 0.05
val PREMIUM_DISCOUNT = 0.01

fun main() {
    val best_user = true
    val price = 100f
    val count = 22f
    val start_discount = 1000
    val start_silver_discount = 10000
    var total_price = price * count
    var discount_standart_price = total_price - DISCOUNT_STANDART
    var discount_silver_price =  total_price - total_price * SILVER_DISCOUNT
    var discount_premium_price =  discount_silver_price - discount_silver_price * PREMIUM_DISCOUNT


    if (total_price > start_silver_discount ) {
        println("Покупка $total_price рублей")
        println("После применения скидки 5 % -> $discount_silver_price рублей")
    }
    if (total_price > start_discount && total_price < start_silver_discount) {
        println("Покупка $total_price рублей")
        println("После применения  скидки -> $discount_standart_price рублей ")

    }
    if (total_price < start_discount) {
        println("Покупка $total_price рублей")

    }
    else if (best_user == true) {
        println("Покупка $total_price рублей")
        println("После применения скидки 5 % -> $discount_silver_price рублей")
        println("После применения скидки 1 % -> $discount_premium_price рублей")
    }
}



























