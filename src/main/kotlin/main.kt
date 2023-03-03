package ru.netology

fun main() {
    val amount = 1_000 // сумма перевода
    val commissionPercentage = 0.75 // процент комиссии
    val minimalCommission = 35 // минимальная комиссия
    val commissionAmount = amount * commissionPercentage / 100 // расчет комиссии
    var totalCommission = if (commissionAmount < minimalCommission) minimalCommission else commissionAmount // итоговая комиссия
    println("Комиссия за перевод составит" + " " + totalCommission + " " + "рублей.")
}