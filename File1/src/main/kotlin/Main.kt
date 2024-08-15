package ru.Netology

fun main() {
    val minTax = 35
    val amount = 10000
    var tax = 0

    tax = (amount * 0.0075).toInt()
    if (tax < minTax) {
        tax = minTax
    }

    print("Ваша комиссия составляет: " + tax + "руб.")

}