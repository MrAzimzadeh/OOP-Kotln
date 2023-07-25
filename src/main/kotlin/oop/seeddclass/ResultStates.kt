package oop.seeddclass

sealed class ResultStates {
    class Success() : ResultStates()
    class Loading() : ResultStates()
}