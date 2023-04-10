package kr.co.rsquareon.buildingrefactor.util

import java.lang.annotation.ElementType
import java.lang.annotation.Target
import kotlin.annotation.AnnotationRetention.RUNTIME

@Target(ElementType.METHOD, ElementType.FIELD)
@Retention(RUNTIME)
annotation class CommentOverride(
    val target: String,
    val value: String
)
