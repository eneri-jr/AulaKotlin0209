package br.digital.com.aulakotlin

//Exercicio 1
//Escrever o código que deve analisar três números inteiros e retornar o maior
//deles.
fun maiorNumero(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, num2, num3)
}

//Exercicio 2
//Escrever o código que deve analisar duas cadeias de texto e, caso sejam
//diferentes, retornar true, ou, caso sejam iguais, retornar false.
fun comparaTexto(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}

//Exercicio 3
//Escrever o código que deve analisar um número inteiro e, caso ele seja par,
//retorna true, caso contrário, retorna false.
fun numeroPar(numero: Int): Boolean {
    return numero % 2 == 0
}

//Exercicio 4
//Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares.
fun printaImpares() {
    for (num in 1..200 step 2) {
            println("$num, ")
    }
}

//Exercicio 5
//Escrever um código que deve analisar quatro números inteiros e, caso numA
//seja maior que numC e numD ou caso numB seja maior que numC e numD,
//retorna true, caso contrário, retorna false.
fun analisaNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

//Exercicio 6
//Escrever um programa que exiba os primeiros 100 números positivos.
fun printaCem() {
    for (num in 1..100) {
        println(num)
    }
}
