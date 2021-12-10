package com.example.idojarasjelentesapp

import retrofit2.Call
import retrofit2.http.*

interface RetroService {

    @GET("users")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun getUsersList(): Call<UserList>

    //https://gorest.co.in/public-api/users?name=a
    @GET("users")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun searchUsers(@Query("name") searchText: String): Call<UserList>


    //https://gorest.co.in/public-api/users/121
    @GET("users/{user_id}")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun getUser(@Path("user_id") user_id: String): Call<UserResponse>


    @POST("users")
    @Headers("Accept:application/json", "Content-Type:application/json",
        "Authorization: Bearer a2fdf16975943d327a4e48decc79e827331eb3ea7eb3f1349e59cd428d7640c8")
    fun createUser(@Body params: User): Call<UserResponse>

    @PATCH("users/{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json",
        "Authorization: Bearer a2fdf16975943d327a4e48decc79e827331eb3ea7eb3f1349e59cd428d7640c8")
    fun updateUser(@Path("user_id") user_id: String, @Body params: User): Call<UserResponse>

    @DELETE("users/{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json",
        "Authorization: Bearer a2fdf16975943d327a4e48decc79e827331eb3ea7eb3f1349e59cd428d7640c8")
    fun deleteUser(@Path("user_id") user_id: String): Call<UserResponse>



}