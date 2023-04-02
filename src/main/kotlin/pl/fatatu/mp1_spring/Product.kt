package pl.fatatu.mp1_spring

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * POJO class
 *
 * Macronutrients per 100g
 *
 * */
@Table("PRODUCT")
data class Product(@Id var id: Int,
                   var name: String,
                   var protein: Int,
                   var fats: Int,
                   var carbohydrates: Int)