/*
 Descrição: o programa consulta periodicamente o estado de um conjunto de threads
 Autor: Jorge Rossi
 */

package exercicio01

fun main() {

    val threads = arrayListOf<Thread>()

    threads.add(Thread {
        println("Thread 1")
        Thread.sleep(2000);
    })

    threads.add(Thread {
        println("Thread 2")
        while (true) {
        }
    })

    threads.add(Thread {
        println("Thread 3")
    })

    for (thread in threads) {
        thread.start()
    }

    Thread {
        while (true) {
            for (thread in threads) println("Estado da thread ${thread.id}: ${thread.state}")
            Thread.sleep(1000);
        }
    }.start()
}