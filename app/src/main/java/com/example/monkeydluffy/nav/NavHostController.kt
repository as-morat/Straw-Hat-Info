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
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen {
                navController.navigate(Screen.Detail.route)
            }
        }

        composable(Screen.Detail.route) {
            DetailScreen(
                onBackPressed = { navController.popBackStack() },
                onDetail = { characterId ->
                    navController.navigate(Screen.Info.createRoute(characterId)) {
                        launchSingleTop = true
                    }
                }
            )
        }

        composable(
            route = Screen.Info.routeWithArgs,
            arguments = listOf(navArgument("characterId") { type = NavType.IntType })
        ) { backStackEntry ->
            val characterId = backStackEntry.arguments?.getInt("characterId") ?: 0
            val character = CharacterRepo.Characters.find { it.id == characterId }

            val firstId = CharacterRepo.Characters.first().id
            val lastId = CharacterRepo.Characters.last().id

            InfoDeskScreen(
                character = character,
                onBack = { navController.popBackStack() },
                onNext = {
                    if (characterId < lastId) {
                        navController.navigate(Screen.Info.createRoute(characterId + 1)) {
                            launchSingleTop = true
                        }
                    }
                },
                onPrev = {
                    if (characterId > firstId) {
                        navController.navigate(Screen.Info.createRoute(characterId - 1)) {
                            launchSingleTop = true
                        }
                    }
                },
                canGoNext = characterId < lastId,
                canGoPrev = characterId > firstId
            )
        }
    }
}