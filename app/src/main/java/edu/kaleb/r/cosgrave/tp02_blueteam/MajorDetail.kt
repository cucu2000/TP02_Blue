package edu.kaleb.r.cosgrave.tp02_blueteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Person

//Author: Kaleb

class MajorDetail : AppCompatActivity() {
    var sarkeyMajors: ArrayList<Major> = ArrayList()
    var meindersMajors: ArrayList<Major> = ArrayList()
    var annLacyMajors: ArrayList<Major> = ArrayList()
    var sarkeyPeople: ArrayList<Person> = ArrayList()
    var meindersPeople: ArrayList<Person> = ArrayList()
    var annLacyPeople: ArrayList<Person> = ArrayList()

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<majorAdapter.ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_major_detail)

        sarkeyPeople()
        sarkeyMajors()

        meindersPeople()
        meindersMajors()

        annLacyPeople()
        annLacyMajors()

        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager


    }

    fun createPeople(arrayList: ArrayList<Person>, Name: String, Position: String, Email: String, Room: String){
        arrayList.add(Person(Name, Position, Email, Room))
    }

    fun createMajor(arrayList: ArrayList<Major>, Name: String, Head: Person){
        arrayList.add(Major(Name, Head))
    }

    fun sarkeyPeople(){
         createPeople(sarkeyPeople, "Jeff Maxwell", "Head of Computer Science", "jmaxwell@okcu.edu", "Sarkeys 201")
         createPeople(sarkeyPeople, "Jeff Price", "Head of Game Design and Animation", "jprice@okcu.edu", "Norick 120")
         createPeople(sarkeyPeople, "Helen Gaudin", "Associate Dean of Biology", "hgaudin@okcu.edu", "Walker 101")
    }

    fun meindersPeople(){
        createPeople(meindersPeople, "Seven Agee", "Dean, Proffessor of Economics", "sagee@okcu.edu", "Meinders 201")
        createPeople(meindersPeople, "Randy Murray", "Professor of Accounting", "rmurray@okcu.edu", "Meinders 120")
    }

    fun annLacyPeople(){
        createPeople(annLacyPeople, "Jo Rowan", "Dance Chair", "jrowan@okcu.edu", "Ann Lacy 201")
        createPeople(annLacyPeople, "Jessica Telfer", "Proffesor of Arts Management", "jtelfer@okcu.edu", "Ann Lacy 120")
        createPeople(annLacyPeople, "Mellanie Shelley", "Associate Dean, Entertainment Business Economic Advisor", "mshelley@okcu.edu", "Ann Lacy 101")
    }

    fun sarkeyMajors(){
        createMajor(sarkeyMajors, "Computer Science", sarkeyPeople[0])
        createMajor(sarkeyMajors, "Game Design and Animation", sarkeyPeople[1])
        createMajor(sarkeyMajors, "Biology", sarkeyPeople[2])
    }

    fun meindersMajors(){
        createMajor(meindersMajors, "Business Administration", meindersPeople[0])
        createMajor(meindersMajors, "Economics", meindersPeople[0])
        createMajor(meindersMajors, "Accounting", meindersPeople[1])
    }

    fun annLacyMajors(){
        createMajor(annLacyMajors, "Dance Performance", annLacyPeople[0])
        createMajor(annLacyMajors, "Dance Management", annLacyPeople[1])
        createMajor(annLacyMajors, "Entertainment Business", annLacyPeople[2])
    }
}