import java.util.*

fun main(args: Array<String>) {
    queDiaDaSemana()
}

fun queDiaDaSemana() {
    println("Que dia da semana é hoje?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day){
        1 -> println("Hoje é Domingo!")
        2 -> println("Hoje é Segunda!")
        3 -> println("Hoje é Terça!")
        4 -> println("Hoje é Quarta!")
        5 -> println("Hoje é Quinta!")
        6 -> println("Hoje é Sexta!")
        7 -> println("Hoje é Sabado!")
        else -> println("ZA WARUDO! TOKI WO TOMARE!")
    }
}
