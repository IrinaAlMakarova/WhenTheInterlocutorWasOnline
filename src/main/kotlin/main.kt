fun main() {
    agoToText(990)
}

fun agoToText(seconds: Int) = when (seconds) {
    in 0..60 -> println("был(а) только что")
    in 61..60 * 60 -> println("был(а) " + minutes(seconds))
    in 60 * 60 + 1..24 * 60 * 60 -> println("был(а) " + hours(seconds))
    in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> println("был(а) вчера")
    in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> println("был(а) позавчера")
    else -> println("был(а) давно")
}

fun minutes(seconds: Int): String {
    val minute = seconds / 60
    return when (minute) {
        1, 21, 31, 41, 51 -> "$minute минуту назад"
        2, 22, 32, 42, 52, 3, 23, 33, 43, 53, 4, 24, 34, 44, 54 -> "$minute минуты назад"
        else -> "$minute минут назад"
    }
}

fun hours(seconds: Int): String {
    val hour = seconds / (60 * 60)
    return when (hour) {
        1, 21 -> "$hour час назад"
        2, 3, 4, 22, 23, 24 -> "$hour часа назад"
        else -> "$hour часов назад"
    }
}
