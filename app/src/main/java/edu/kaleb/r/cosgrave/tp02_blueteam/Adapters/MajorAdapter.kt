package edu.kaleb.r.cosgrave.tp02_blueteam.Adapters

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.MainActivity
import edu.kaleb.r.cosgrave.tp02_blueteam.MajorDetail
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major
import edu.kaleb.r.cosgrave.tp02_blueteam.R

//Author: Kaleb

class MajorAdapter(
    var majors: ArrayList<Major>,
    var majorActivity: MajorDetail
): RecyclerView.Adapter<MajorAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txtMajor: TextView = itemView.findViewById(R.id.textViewMajor)
        var txtHead: TextView = itemView.findViewById(R.id.textViewHead)
    }

    override fun getItemCount(): Int {
       return majors.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_majors, parent, false)
        return ViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtMajor.text = "${majors[position].majorName}"
        holder.txtHead.text = "${
            majors[position].Head.personName + System.lineSeparator() +
            majors[position].Head.personPosition + System.lineSeparator() +
            majors[position].Head.personEmail + System.lineSeparator() +
                    majors[position].Head.personRoom
        }"

        holder.itemView.setOnClickListener{
            majorActivity.onMajorClick(majors[position])
        }
    }
}