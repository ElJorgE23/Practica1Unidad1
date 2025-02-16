package com.example.marsphotos.network

import com.google.android.datatransport.runtime.dagger.Component
// Create an instance of the application graph
val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()
// Grab an instance of UserRepository from the application graph
val userRepository: UserRepository = applicationGraph.repository()
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