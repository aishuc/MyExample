package com.example.retrofitdemo

import retrofit2.Response
import retrofit2.http.GET

interface AlbumServices {
    @GET("/albums")
    suspend fun getAlbums() :Response<AlbumsX>
}