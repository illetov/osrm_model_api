package inittey.com.poputka.model.route

/**
* API model
* Created by ANDREY. Y on 1/18/2018.
* Email: inittey@gmail.com
*/
data class RouterContainer(val routes: List<Route>,
                           val waypoint: List<Waypoint>,
                           val code: String)