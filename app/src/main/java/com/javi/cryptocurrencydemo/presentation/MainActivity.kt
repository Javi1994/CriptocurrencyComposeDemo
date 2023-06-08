package com.javi.cryptocurrencydemo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.javi.cryptocurrencydemo.common.Constants
import com.javi.cryptocurrencydemo.presentation.coin_detail.CoinDetailScreen
import com.javi.cryptocurrencydemo.presentation.coin_list.CoinListScreen
import com.javi.cryptocurrencydemo.presentation.ui.theme.CryptocurrencyDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CryptocurrencyDemoTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.CoinListScreen.route
                ) {
                    composable(
                        route = Screen.CoinListScreen.route
                    ) {
                        CoinListScreen(navController = navController)
                    }
                    composable(
                        route = Screen.CoinDetailScreen.route + "/{${Constants.PARAM_COIN_ID}}"
                    ) {
                        CoinDetailScreen()
                    }
                }
            }
        }
    }
}