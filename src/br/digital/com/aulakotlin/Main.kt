package br.digital.com.aulakotlin

fun main(){
    var nome = meuNome("Eneri", "Leal Junior");

    println("Hello World");
    println("Seja bem vindo " + nome);

    //Criação de lista
    var lista = arrayListOf<String>();
    lista.add("Primeiro elemento");
    println(lista.get(0));
    println(lista[0]);
}

//Criação de função com entrada e retorno
fun meuNome(nome: String, sobrenome: String) : String{
    return nome + " " + sobrenome;
}