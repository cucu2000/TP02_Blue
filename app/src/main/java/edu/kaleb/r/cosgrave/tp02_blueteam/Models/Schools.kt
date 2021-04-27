package edu.kaleb.r.cosgrave.tp02_blueteam.Models

//author: Tristan

//Take In Inputs
data class Schools (var name: String, var address: String){

    //Initialize Inputs
    var schoolName: String
    var schoolAddress: String

    //Init Variables with Inputs
    init {
        this.schoolName = name
        this.schoolAddress = address
    }
}