package com.plcoding.tracker_domain.repository

interface TrackerRepository {

    suspend fun searchFood()
}