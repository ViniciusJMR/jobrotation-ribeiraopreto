fun main() {
    println("Digite a palavra a ser invertida: ")
    val s = readln()
    val stringInvertida = inverterString(s)
    println("Palavra invertida: $stringInvertida")

}

fun inverterString(s: String): String {
    var i = s.length-1
    var stringInvertida = ""
    while(i >= 0){
        stringInvertida += s[i]
        i--
    }
    return stringInvertida
}