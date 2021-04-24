package edu.kaleb.r.cosgrave.tp02_blueteam.Models
//Author: Kaleb

data class Major(
    var Name: String,
    var Head: Person,
){
    var majorName: String
    var majorHead: Person

    init{
        this.majorName = Name
        this.majorHead = Head
    }
}
