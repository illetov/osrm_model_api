package inittey.com.poputka.model.rest;

import java.util.List;

import inittey.com.poputka.model.GeoRouteItem;
import inittey.com.poputka.model.GeocodingResponseItem;
import inittey.com.poputka.model.route.RouterContainer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * API model
 * Created by ANDREY. Y on 1/17/2018.
 * Email: inittey@gmail.com
 */

public interface APIGeocoding {

    @GET("/reverse.php")
    Call<GeoRouteItem> getReverseGeocoder(
            @Query("lat") Double lat,
            @Query("lon") Double lon,
            @Query("addressdetails") Integer details,
            @Query("format") String format
    );

    @GET("/search?")
    Call<List<GeocodingResponseItem>> getGeocoder(
            @Query("q") String query,
            @Query("limit") Integer limit,
            @Query("format") String format,
            @Query("polygon") Integer polygon,
            @Query("countrycodes") String countryCodes,
            @Query("addressdetails") Integer addrDetails,
            @Query("accept-language") String lang
            );

    @GET("/route/v1/driving/{a},{b};{c},{d}")
    Call<RouterContainer> getRoutingBetweenPoints(
            @Path("a") Double currentA,
            @Path("b") Double currentB,
            @Path("c") Double remoteC,
            @Path("d") Double remoteD,
            @Query("geometries") String geoMetriesFormat,
            @Query("alternatives") Boolean isAllowAlternatives,
            @Query("steps") Boolean isAllowSteps,
            @Query("generate_hints") Boolean isShowHints
    );
}