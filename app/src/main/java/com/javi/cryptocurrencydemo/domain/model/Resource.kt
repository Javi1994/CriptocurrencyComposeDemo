package com.javi.cryptocurrencydemo.domain.model

sealed class Resource {
    class Success<out T>(value: T) : Resource()
    class Error(e: Throwable): Resource()
    class Loading(): Resource()
}