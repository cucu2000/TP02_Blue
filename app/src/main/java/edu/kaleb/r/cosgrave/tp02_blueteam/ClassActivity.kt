package edu.kaleb.r.cosgrave.tp02_blueteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Classes

class ClassActivity : AppCompatActivity() {

    var cSClasses: ArrayList<Classes> = ArrayList()
    var gDClasses: ArrayList<Classes> = ArrayList()
    var bIClasses: ArrayList<Classes> = ArrayList()

    var bAClasses: ArrayList<Classes> = ArrayList()
    var cEClasses: ArrayList<Classes> = ArrayList()
    var aCClasses: ArrayList<Classes> = ArrayList()

    var dPClasses: ArrayList<Classes> = ArrayList()
    var dMClasses: ArrayList<Classes> = ArrayList()
    var bEClasses: ArrayList<Classes> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        createCSClasses()
        creategDClasses()
        createbIClasses()

        createbAClasses()
        createcEClasses()
        createaCClasses()

        createdPClasses()
        createdMClasses()
        createbEClasses()

    }

    fun createClasses(arrayList: ArrayList<Classes>, Name: String, ID: String) {
        arrayList.add(Classes(arrayList, Name, ID))
    }

    fun createCSClasses() {
        createClasses(cSClasses, "Programming 1", "CS1001")
        createClasses(cSClasses, "Programming 2", "CS2002")
    }

    fun creategDClasses() {
        createClasses(gDClasses, "Algorithm Design", "GD1001")
        createClasses(gDClasses, "C# Programming", "GD2002")
    }

    fun createbIClasses() {
        createClasses(bIClasses, "Environmental Ethics", "BI1001")
        createClasses(bIClasses, "History of Biology", "BI2002")
    }


    fun createbAClasses() {
        createClasses(bAClasses, "Introduction to BA", "BA1001")
        createClasses(bAClasses, "College Algebra", "BA2002")
    }

    fun createcEClasses() {
        createClasses(cEClasses, "Economic Theory", "EC1001")
        createClasses(cEClasses, "International Trade", "EC2002")
    }

    fun createaCClasses() {
        createClasses(aCClasses, "Calculus I", "AC1001")
        createClasses(aCClasses, "Calculus II", "AC2002")
    }


    fun createdPClasses() {
        createClasses(dPClasses, "Dance Notation", "DP1001")
        createClasses(dPClasses, "Music for Dancers.", "DP2002")
    }

    fun createdMClasses() {
        createClasses(dMClasses, "Choreography", "DM1001")
        createClasses(dMClasses, "Dance History.", "DM2002")
    }

    fun createbEClasses() {
        createClasses(bEClasses, "Accounting and Finance", "BE1001")
        createClasses(bEClasses, "International Marketing", "BE2002")
    }
}



