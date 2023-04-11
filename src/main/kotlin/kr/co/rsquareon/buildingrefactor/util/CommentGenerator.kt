package kr.co.rsquareon.buildingrefactor.util

import org.hibernate.Session
import javax.persistence.EntityManager

class CommentGenerator(
    private val entityManager: EntityManager
) {

    fun generateComment() {
        val entities = entityManager.entityManagerFactory
            .metamodel
            .entities

        for (entity in entities) {
            val clazz = Class.forName(entity.name)
            println(clazz.name)


            val fields = entity.javaClass.fields
            val attributes = entity.attributes
            for (attribute in attributes) {
                println(attribute.name)
            }

            println("${entity.name} - ${fields.size}")
            for (field in fields) {
                println("${field.name}")
                println("${field.getAnnotationsByType(CommentOverrides::class.java)} - ${field.getAnnotationsByType(CommentOverride::class.java)}")
            }
        }
    }

}