package com.sweetzpot.stravazpot.athlete.rest;

import com.sweetzpot.stravazpot.athlete.model.Athlete;
import com.sweetzpot.stravazpot.athlete.model.Stats;
import com.sweetzpot.stravazpot.athlete.model.Zones;
import com.sweetzpot.stravazpot.segment.model.SegmentEffort;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AthleteRest {
    @GET("athlete")
    Call<Athlete> getCurrentAthlete();

    @GET("athletes/{id}")
    Call<Athlete> getAthlete(@Path("id") Integer id);

    @PUT("athlete")
    Call<Athlete> updateAthlete(
            @Query("city") String city,
            @Query("state") String state,
            @Query("country") String country,
            @Query("sex") String sex,
            @Query("weight") Float weight);

    @GET("athlete/zones")
    Call<Zones> getAthleteZones();

    @GET("athletes/{id}/stats")
    Call<Stats> getAthleteStats(@Path("id") Integer id);

    @GET("athletes/{id}/koms")
    Call<List<SegmentEffort>> listAthleteKOMS(
            @Path("id") Integer id,
            @Query("page") Integer page,
            @Query("per_page") Integer perPage);
}