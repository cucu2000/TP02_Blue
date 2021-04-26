package edu.kaleb.r.cosgrave.tp02_blueteam.Models

data class Classes(var Name: String, var Id: String) {

    var classname: String
    var classid: String

    init {
        this.classname = Name
        this.classid = Id
    }

}