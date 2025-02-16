package com.example.marsphotos.network

class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) { }
// @Inject lets Dagger know how to create instances of these objects
class UserLocalDataSource @Inject constructor() { }
class UserRemoteDataSource @Inject constructor() { }