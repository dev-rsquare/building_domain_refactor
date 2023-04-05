package kr.co.rsquareon.buildingrefactor.domain.value

import java.security.PrivateKey
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Location(
    // 위도
    private val latitude: Double,

    // 경도
    private val longitude: Double,

    // 좌표?..
    private val geometry: String
) {

}
