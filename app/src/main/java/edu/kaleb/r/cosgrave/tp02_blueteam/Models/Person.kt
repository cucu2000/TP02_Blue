package edu.kaleb.r.cosgrave.tp02_blueteam.Models
//Author: Kaleb

data class Person(
    var Name: String,
    var Position: String,
    var Email: String,
    var Room: String
) {
    var personName: String
    var personPosition: String
    var personEmail: String
    var personRoom: String


    init {
        this.personName = Name
        this.personPosition = Position
        this.personEmail = Email
        this.personRoom = Room
    }
}


