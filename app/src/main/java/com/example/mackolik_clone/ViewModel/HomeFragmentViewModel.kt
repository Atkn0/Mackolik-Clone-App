package com.example.mackolik_clone.ViewModel

import androidx.lifecycle.ViewModel
import com.example.mackolik_clone.Service.LeagueApiService
import retrofit2.await
import retrofit2.awaitResponse

class HomeFragmentViewModel : ViewModel() {


    val apiService = LeagueApiService()

    suspend fun getDataFromApi(){

        val myList = apiService.getDataService().awaitResponse()


        if (myList.isSuccessful){
            println(myList.body())

        }else if (!myList.isSuccessful){
            val e = myList.raw()
            println(e)
        }
        else{
            println("Hiçbir şey dönmedi")
        }



    }


}