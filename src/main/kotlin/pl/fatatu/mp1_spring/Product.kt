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
data class Product(@Id var id: String?,
                   val name: String,
                   val protein: Double,
                   val fats: Double,
                   val carbohydrates: Double)