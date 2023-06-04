package com.javi.cryptocurrencydemo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.NavHost
import com.javi.cryptocurrencydemo.presentation.coin_list.CoinListScreen
import com.javi.cryptocurrencydemo.presentation.coin_list.CoinListViewModel
import com.javi.cryptocurrencydemo.presentation.ui.theme.CryptocurrencyDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val coinListViewModel by viewModels<CoinListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CryptocurrencyDemoTheme {
                //val navController = rememberNavController()
                //NavHost(navController = navController, startDestination = Screen.CoinListScreen.route) {
                //    composable(
                //        route = Screen.CoinListScreen.route
                //    ) {
                //        CoinListScreen()
                //    }
                //    composable(
                //        route = Screen.CoinDetailScreen.route
                //    ) {

                //    }
                //}
            }
        }
    }
}