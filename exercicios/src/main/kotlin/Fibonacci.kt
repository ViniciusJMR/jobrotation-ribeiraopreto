fun main(){
    println("Digite o valor a ser procurado:")
    val num = readln().toInt()
    println("Digite o valor máximo de indíces:")
    val max = readln().toInt()

    val resultado = fibonacci(num, max)

    if(resultado){
        println("O número $num pertence a sequência com $max indíces.")
    }
    else{
        println("O número $num não pertence a sequência com $max indíces.")
    }
}

fun fibonacci(num: Int, max:Int): Boolean{
    var atual = 1
    var aux = 0
    var flag = false

    for(i in 1..max){
        if(num == atual || num == aux)
            flag = true

        atual += aux
        aux = atual - aux
    }

    return flag
}