package edu.kaleb.r.cosgrave.tp02_blueteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Adapters.ClassAdapter
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Classes

//Author: Milan
//Intent Methods by Kaleb

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

    lateinit var Test: String
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<ClassAdapter.ViewHolder>

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

        Test = intent.getStringExtra("Major").toString()

        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.classRecyclerView)
        recyclerView.layoutManager = layoutManager

        findMajor(Test)

        recyclerView.adapter = adapter
    }

    fun createClasses(arrayList: ArrayList<Classes>, Name: String, ID: String) {
        arrayList.add(Classes(Name, ID))
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

    fun findMajor(Test: String){
        if (Test.equals("Computer Science")){
            adapter = ClassAdapter(cSClasses, this)

        }else if (Test.equals("Game Design and Animation")){
            adapter = ClassAdapter(gDClasses, this)

        }else if (Test.equals("Biology")){
            adapter = ClassAdapter(bIClasses, this)

        }else if (Test.equals("Business Administration")){
            adapter = ClassAdapter(bAClasses, this)

        }else if (Test.equals("Economics")){
            adapter = ClassAdapter(cEClasses, this)

        }else if (Test.equals("Accounting")){
            adapter = ClassAdapter(aCClasses, this)

        }else if (Test.equals("Dance Performance")) {
            adapter = ClassAdapter(dPClasses, this)

        }else if (Test.equals("Dance Management")) {
            adapter = ClassAdapter(dMClasses, this)

        }else{
            adapter = ClassAdapter(bEClasses, this)

        }
    }
}



