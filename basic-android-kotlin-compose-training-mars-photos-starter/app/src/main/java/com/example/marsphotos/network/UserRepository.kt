package com.example.marsphotos.network

import com.google.android.datatransport.runtime.dagger.Component

class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) { }
// @Inject lets Dagger know how to create instances of these objects
class UserLocalDataSource @Inject constructor() { }
class UserRemoteDataSource @Inject constructor() { }
// @Component makes Dagger create a graph of dependencies
@Component
interface ApplicationGraph {
    // The return type  of functions inside the component interface is
    // what can be provided from the container
    fun repository(): UserRepository
}