package com.tecsup.integrador.api;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

import com.tecsup.integrador.model.User;
import com.tecsup.integrador.model.UserApi;

import retrofit2.Call;
public interface ApiService {

    String API_BASE_URL = "http://54.149.168.221/";
 
    @GET("api/v1/usuarios")
    Call<List<User>> getUsers();

    
    @FormUrlEncoded
    @POST("api/v1/login")
    Call<UserApi> loginUser
            (@Field("username")String username,
             @Field("password") String password
            );
    
    @FormUrlEncoded
    @POST("api/v1/usuarios")
    Call<ResponseMessage> createUsuario(@Field("username") String username,
                                        @Field("password") String password,
                                        @Field("type") String type,
                                        @Field("reg_date") String reg_date);
    
    
}
