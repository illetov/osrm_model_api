package inittey.com.poputka.model.route

data class Leg(val summary: String,
               val weight: Double,
               val duration: Double,
               val steps: List<Step>,
               val distance: Double)
