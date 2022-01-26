// Passando um valor direto na args, mudando ele pra int e comparando dentro do print com o $.
//fun main(args: Array<String>) {println("${if(args[0].toInt() >= 12) "Boa tarde Kotlin!" else "Bom dia Kotlin!"}")}


//import java.util.*
//fun main() {
//    alimentarPeixe()
//}
//
//fun alimentarPeixe(){
//    val dia = diaAleatorio() //"terça-feira" foi implementado uma função para sortear o dia da semana
//    val comida = "grilo"
//    println("Hoje é $dia e os peixes vão comer $comida.")
//}
//
//fun diaAleatorio (): String{
//    val semana = listOf("Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
//    "Sexta-feira", "Sabado", "Domingo")
//    return semana[Random().nextInt(7)]
//}

fun main() {
    println("\nSua mensagem é: ${getSorte()}")
}

fun getSorte():String {
    val sorte = listOf(
        "Voce ira encontrar conforto de alguem inesperado!",
        "Voce ganhará uma nova amizade!", "Seja como o vento, suave, frio e implacável!",
        "Amanha é um novo dia!", "Proteja sua familia, seu lar e sua paz!",
        "No labirinto da vida, não é errado andar para trás!", "Hoje é o seu dia, vá e brilhe!",
        "A felicidade pode estar mais perto do que voce imagina!", "Nem tudo o que brilha é jóia!",
        "Seja gentil e o mundo será gentil com voce!"
    )
    print("Digite seu ano de nascimento: ")
    val aniversario = readln()?.toIntOrNull() ?: 1
    // println(aniversario.rem(sorte.size.toInt())) Verificar qual é o indice.
    return sorte[aniversario.rem(sorte.size)]
}