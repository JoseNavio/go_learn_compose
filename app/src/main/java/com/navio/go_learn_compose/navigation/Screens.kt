package com.navio.go_learn_compose.navigation

sealed class Screens(val route: String) {

    object Main : Screens(MAIN_SCREEN)
    object First : Screens(FIRST_SCREEN)
    object Second : Screens(SECOND_SCREEN)

    companion object {
        private const val MAIN_SCREEN = "main_screen"
        private const val FIRST_SCREEN = "first_screen"
        private const val SECOND_SCREEN = "second_screen"
    }
}
