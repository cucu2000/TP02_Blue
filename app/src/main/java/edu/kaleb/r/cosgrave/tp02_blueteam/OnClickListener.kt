package edu.kaleb.r.cosgrave.tp02_blueteam

import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Schools

//Author: Kaleb

interface OnClickListener {

    //Create a function for clicking a School
    fun onSchoolClick(data: Schools){

    }

    //Create a function for clicking a Major
    fun onMajorClick(data: Major) {

    }
}