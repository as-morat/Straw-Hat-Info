package com.example.monkeydluffy.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.monkeydluffy.detail.DetailScreen
import com.example.monkeydluffy.home.HomeScreen
import com.example.monkeydluffy.info.InfoDeskScreen
import com.example.monkeydluffy.info.data.CharacterRepo

@Composable
fun NavHostController(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen { navController.navigate(Screen.Detail.route) }
        }

        composable(Screen.Detail.route) {
            DetailScreen(
                onBackPressed = { navController.popBackStack() },
                onDetail = { id ->
                    navController.navigate(Screen.Info.createRoute(id))
                }
            )
        }

        composable(
            route = Screen.Info.route,
            arguments = listOf(
                navArgument("characterId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val characterId = backStackEntry.arguments?.getInt("characterId") ?: 0
            val character = CharacterRepo.Characters.find { it.id == characterId }

            InfoDeskScreen(
                character = character,
                {navController.navigate(Screen.Home.route)},
                { navController.popBackStack() }
            )
        }
    }
}