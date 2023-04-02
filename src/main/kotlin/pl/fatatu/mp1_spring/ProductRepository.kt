package pl.fatatu.mp1_spring

import org.springframework.data.repository.CrudRepository

/**
 * Repository interface
 *
 * */

interface ProductRepository : CrudRepository<Product, String>