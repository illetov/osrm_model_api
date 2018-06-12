package inittey.com.poputka.model

/**
* API model
* Created by ANDREY. Y on 1/16/2018.
* Email: inittey@gmail.com
*/
data class GeoRouteItem(var lat: Double,
                        var lon: Double,
                        var display_name: String,
                        var id: Int,
                        var marker: Int) {
}