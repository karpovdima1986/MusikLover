package ru.netology

fun main() {
    val amount = 2_000
    val customer = true


    val discount = if (amount in 1001..9999) {
        amount - 100
    } else (if (amount > 10_000) {
        amount - (amount * 5 / 100)
    } else amount)

    val discountCustomer = if (customer) discount - (discount * 1 / 100) else discount

    println("Стоимость покупки $discountCustomer руб.")
}