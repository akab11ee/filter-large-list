package com.example.citysearchapp.repository.interfaces

import com.example.citysearchapp.data.entity.City

/**
 * @Author: Akash Abhishek
 * @Date: 22 June 2022
 */

interface CityRepository {

    /**
     * insert city data
     */
    suspend fun insert(cityList: List<City>): Boolean

    /**
     * search city with specific query
     */
    suspend fun search(query: String): List<City>

    /**
     * get all available cities data
     */
    suspend fun getAll(): List<City>

    /**
     * clear all cities
     */
    fun clear()
}