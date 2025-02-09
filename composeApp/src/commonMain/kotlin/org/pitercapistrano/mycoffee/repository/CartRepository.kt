package org.pitercapistrano.mycoffee.repository

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.pitercapistrano.mycoffee.datasource.DataSource
import org.pitercapistrano.mycoffee.model.Produto

class CartRepository : KoinComponent {
    private val dataSource: DataSource by inject()

    fun getProdutos(): List<Produto> {
        return dataSource.getProdutos()
    }
}
