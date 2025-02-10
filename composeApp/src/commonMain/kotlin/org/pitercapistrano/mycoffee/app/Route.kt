package org.pitercapistrano.mycoffee.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object Splash: Route

    @Serializable
    data object SignIn: Route

    @Serializable
    data object SignUp: Route

    @Serializable
    data object Home: Route

    @Serializable
    data object Cart: Route

    @Serializable
    data object Payment: Route

}