package inittey.com.poputka.model.route

data class Route(val geometry: Geometry,
                 val legs: List<Leg>,

                 val weight_name: String,
                 val weight: String,
                 val duration: String,
                 val distance: String

)
