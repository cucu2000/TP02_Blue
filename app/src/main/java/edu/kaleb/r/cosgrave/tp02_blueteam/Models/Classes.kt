package edu.kaleb.r.cosgrave.tp02_blueteam.Models
//Author: Milan

//Take In Inputs
data class Classes(var Name: String, var Id: String) {

    //Initialize Variables
    var classname: String
    var classid: String

    //Init Variables with Inputs
    init {
        this.classname = Name
        this.classid = Id
    }

}