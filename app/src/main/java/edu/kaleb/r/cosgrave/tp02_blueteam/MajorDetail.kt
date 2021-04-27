package edu.kaleb.r.cosgrave.tp02_blueteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Adapters.MajorAdapter
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Person

//Author: Kaleb

class MajorDetail : AppCompatActivity(), OnClickListener {

    //Initialize Variables
    var sarkeyMajors: ArrayList<Major> = ArrayList()
    var meindersMajors: ArrayList<Major> = ArrayList()
    var annLacyMajors: ArrayList<Major> = ArrayList()
    var sarkeyPeople: ArrayList<Person> = ArrayList()
    var meindersPeople: ArrayList<Person> = ArrayList()
    var annLacyPeople: ArrayList<Person> = ArrayList()

    lateinit var Test: String
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<MajorAdapter.ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_major_detail)

        //Get Name of The School from Intent
        Test = intent.getStringExtra("School").toString()

        //Create People and Majors
        sarkeyPeople()
        sarkeyMajors()

        meindersPeople()
        meindersMajors()

        annLacyPeople()
        annLacyMajors()

        //Set RecyclerView Variables
        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.majorRecyclerView)
        recyclerView.layoutManager = layoutManager

        //Checlk which school for correct adapter usage
        adapter = if(Test.equals("Petree College of Arts and Sciences")){
            MajorAdapter(sarkeyMajors, this)
        }else if(Test.equals("Meinders School of Business")){
            MajorAdapter(meindersMajors, this)
        }else{
            MajorAdapter(annLacyMajors, this)
        }
        recyclerView.adapter = adapter
    }

    //Function Create a Person
    fun createPeople(arrayList: ArrayList<Person>, Name: String, Position: String, Email: String, Room: String){
        arrayList.add(Person(Name, Position, Email, Room))
    }

    //Function to create a Major
    fun createMajor(arrayList: ArrayList<Major>, Name: String, Head: Person){
        arrayList.add(Major(Name, Head))
    }

    //Create Sarkey People
    fun sarkeyPeople(){
         createPeople(sarkeyPeople, "Jeff Maxwell", "Head of Computer Science", "jmaxwell@okcu.edu", "Sarkeys 201")
         createPeople(sarkeyPeople, "Jeff Price", "Head of Game Design and Animation", "jprice@okcu.edu", "Norick 120")
         createPeople(sarkeyPeople, "Helen Gaudin", "Associate Dean of Biology", "hgaudin@okcu.edu", "Walker 101")
    }

    //Meinders People
    fun meindersPeople(){
        createPeople(meindersPeople, "Seven Agee", "Dean, Professor of Economics", "sagee@okcu.edu", "Meinders 201")
        createPeople(meindersPeople, "Randy Murray", "Professor of Accounting", "rmurray@okcu.edu", "Meinders 120")
    }

    //Ann Lacy People
    fun annLacyPeople(){
        createPeople(annLacyPeople, "Jo Rowan", "Dance Chair", "jrowan@okcu.edu", "Ann Lacy 201")
        createPeople(annLacyPeople, "Jessica Telfer", "Professor of Arts Management", "jtelfer@okcu.edu", "Ann Lacy 120")
        createPeople(annLacyPeople, "Mellanie Shelley", "Associate Dean, Entertainment Business Economic Advisor", "mshelley@okcu.edu", "Ann Lacy 101")
    }

    //Create Sarkey Majors
    fun sarkeyMajors(){
        createMajor(sarkeyMajors, "Computer Science", sarkeyPeople[0])
        createMajor(sarkeyMajors, "Game Design and Animation", sarkeyPeople[1])
        createMajor(sarkeyMajors, "Biology", sarkeyPeople[2])
    }

    //Meinders Majors
    fun meindersMajors(){
        createMajor(meindersMajors, "Business Administration", meindersPeople[0])
        createMajor(meindersMajors, "Economics", meindersPeople[0])
        createMajor(meindersMajors, "Accounting", meindersPeople[1])
    }

    //Ann Lacy Majors
    fun annLacyMajors(){
        createMajor(annLacyMajors, "Dance Performance", annLacyPeople[0])
        createMajor(annLacyMajors, "Dance Management", annLacyPeople[1])
        createMajor(annLacyMajors, "Entertainment Business", annLacyPeople[2])
    }

    //Override the OnClickListener onMajorClick
    override fun onMajorClick(data: Major) {
        val activityIntent = Intent(this, ClassActivity::class.java)
        activityIntent.putExtra("Major", "${data.majorName}")
        startActivity(activityIntent)
    }
}