package org.pitercapistrano.mycoffee.datasource

import org.koin.core.component.KoinComponent
import org.pitercapistrano.mycoffee.model.Produto

class DataSource : KoinComponent {

    fun getProdutos(): List<Produto> {
        return listOf(
            Produto(
                foto = "drawable/cappuccino_tradicional.png",
                nome = "Cappuccino tradicional",
                preco = "15.00"
            ),
            Produto(
                foto = "drawable/cafe_expresso.png",
                nome = "Café Expresso",
                preco = "9.90"
            ),
            Produto(
                foto = "drawable/cappuccino_chocolate.png",
                nome = "Cappuccino Gelado Sabor Chocolate",
                preco = "25.00"
            ),
            Produto(
                foto = "drawable/cappuccino_pistache.png",
                nome = "Cappuccino Pistache",
                preco = "22.99"
            ),
            Produto(
                foto = "drawable/bolo_morango.png",
                nome = "Bolo de Morango",
                preco = "30.90"
            ),
            Produto(
                foto = "drawable/pudim.png",
                nome = "Pudim de Leite",
                preco = "16.00"
            )
        )
    }
}

