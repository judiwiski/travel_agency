package fr.lernejo.travelsite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface PredictionEngineClient {
    @GET("/api/travels?userName={userName}")
    Call<List<Inscription>> listUser(@Path("userName") String userName);
}
