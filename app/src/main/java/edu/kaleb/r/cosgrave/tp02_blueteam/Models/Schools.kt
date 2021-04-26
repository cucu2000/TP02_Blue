package edu.kaleb.r.cosgrave.tp02_blueteam.Models

//author: Tristan

data class Schools (var name: String, var address: String){

    var schoolName: String
    var schoolAddress: String

    init {
        this.schoolName = name
        this.schoolAddress = address
    }
}