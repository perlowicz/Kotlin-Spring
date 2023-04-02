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

    @GetMapping("/product/{name}")
    fun index(@PathVariable name: String): Product = service.findProductByName(name)

    @PostMapping("/")
    fun post(@RequestBody product: Product) {
        service.save(product)
    }
}