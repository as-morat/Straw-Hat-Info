package com.example.monkeydluffy.nav

sealed class Screen(val route: String) {
    data object Home: Screen("home")
    data object Detail: Screen("detail")
    data object Info: Screen("info") {
        // Create the route with the argument pattern
        const val routeWithArgs = "info/{characterId}"
        fun createRoute(characterId: Int) = "info/$characterId"
    }
}