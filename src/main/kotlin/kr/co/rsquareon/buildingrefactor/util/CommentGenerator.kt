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
            val fields = entity.javaClass.fields
            for (field in fields) {

            }
        }
    }

}