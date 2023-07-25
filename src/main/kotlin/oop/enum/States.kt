package oop.enum

enum class States {
    SUCCESS, LOADING, ERROR
}

fun main() {
    var result = States.LOADING
    processRwsult(result)

}

fun processRwsult(result: States) {
    when (result) {
        States.SUCCESS -> {

        }

        States.LOADING -> {

        }

        States.ERROR -> {

        }
    }
}