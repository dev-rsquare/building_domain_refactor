package kr.co.rsquareon.buildingrefactor.domain.value

enum class ParkingLotType(
    private val description: String
) {

    SELF("자주식 주차"),
    MECHANIC("기계식 주차"),
    MIXED("자주식/기계식 주차"),
    UNCHECKED("조사 안 됨")
}
