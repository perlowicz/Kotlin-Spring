package pl.fatatu.mp1_spring

import org.springframework.stereotype.Service
import java.util.*

/**
 * Service class
 *
 * */

@Service
class ProductService(val db: ProductRepository) {
    fun findProducts(): List<Product> = db.findAll().toList()

    fun findProductByName(name: String): Product = db.findProductByName(name)

    fun save(product: Product) {
        db.save(product)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent)
            listOf(get())
        else
            emptyList()
}