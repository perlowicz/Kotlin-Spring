package pl.fatatu.mp1_spring

import org.springframework.web.bind.annotation.*

/**
 * Controller class
 *
 * */

@RestController
class ProductController(val service: ProductService) {

    @GetMapping("/")
    fun index(): List<Product> = service.findProducts()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Product> = service.findProductById(id)

    @PostMapping("/")
    fun post(@RequestBody product: Product) {
        service.save(product)
    }
}