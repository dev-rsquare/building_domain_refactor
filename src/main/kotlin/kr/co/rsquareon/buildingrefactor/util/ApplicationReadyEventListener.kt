package kr.co.rsquareon.buildingrefactor.util

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import javax.persistence.EntityManager

@Component
class ApplicationReadyEventListener(
    private val entityManager: EntityManager
) {

    @EventListener(ApplicationReadyEvent::class)
    fun onApplicationReady() {
        val commentGenerator = CommentGenerator(entityManager)
        commentGenerator.generateComment()
    }
}