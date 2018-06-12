package inittey.com.poputka.model.route

data class Maneuver(val bearing_after: Int,
                    val bearing_before: Int,
                    val location: List<Double>,
                    val type: String)
