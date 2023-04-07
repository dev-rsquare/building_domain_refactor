package kr.co.rsquareon.buildingrefactor.domain.floor.space.value

enum class WarehouseAgencyType(
    private val description: String
) {

    RENT("임대"),
    CONSIGNMENT("수탁"),
    RENTANDCONSIGNMENT("임대+수탁"),
    UNCHECKED("조사 안 됨")

}