package inittey.com.poputka.model.route

data class Step(val intersection: List<Intersection>,
                val driving_side: String,
                val geometry: Geometry,
                val mode: String,
                val maneuver: Maneuver,
                val weight: Double,
                val duration: Double,
                val name: String,
                val distance: Double)
