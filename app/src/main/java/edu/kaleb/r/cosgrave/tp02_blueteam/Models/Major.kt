package edu.kaleb.r.cosgrave.tp02_blueteam.Models
//Author: Kaleb

//Take in Inputs
data class Major(
    var Name: String,
    var Head: Person,
){

    //Intialize Variables
    var majorName: String
    var majorHead: Person

    //Init Variables with Inputs
    init{
        this.majorName = Name
        this.majorHead = Head
    }
}
