package com.opro.ken.lab14_opendata.api;

import com.opro.ken.lab14_opendata.beans.TaipeiTravelInfo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface TaipeiTravelOpenData {

    @GET("http://data.taipei/opendata/datalist/apiAccess?scope=resourceAquire&rid=36847f3f-deff-4183-a5bb-800737591de5")
    Call<TaipeiTravelInfo>getAttractionsTaipeiTravel();

    public static final Retrofit retroifit = new Retrofit.Builder()
            .baseUrl("http//data.taipei")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static final TaipeiTravelOpenData apiService = retroifit.create(TaipeiTravelOpenData.class);
}
