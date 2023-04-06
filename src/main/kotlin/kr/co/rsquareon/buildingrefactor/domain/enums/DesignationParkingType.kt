package kr.co.rsquareon.buildingrefactor.domain.enums

enum class DesignationParkingType(
    private val description: String
) {

    DESIGNATED("지정 주차"),
    BY_ORDER_OF_ARRIVAL("선착순 주차"),
    MIXED("지정/선착순 주차(혼합형)"),
    UNCHECKED("조사 안 됨")
}
