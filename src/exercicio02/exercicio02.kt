/*
 Descrição: o programa executa operações sbore um grupo de threads
 Autor: Jorge Rossi
 */

package exercicio02

fun main() {
    val threadGroup = ThreadGroup("group")

    val thread1 = Thread(threadGroup, "thread1")
    val thread2 = Thread(threadGroup, "thread2")

    thread1.start()
    thread2.start()
    println("Número de threads ativas: ${threadGroup.activeCount()}")

    thread1.interrupt()
    println("Número de threads ativas: ${threadGroup.activeCount()}")

    threadGroup.destroy()
    println("Número de threads ativas: ${threadGroup.activeCount()}")

}