package edu.kaleb.r.cosgrave.tp02_blueteam
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Classes

//Author: Milan

class ClassAdapter(var classes: ArrayList<Classes>, var mainActivity: MainActivity): RecyclerView.Adapter<ClassAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView = itemView.findViewById(R.id.TextViewName)
        var txtId: TextView = itemView.findViewById(R.id.TextViewId)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_classes_details, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtName.text = "${classes[position].classname}"
        holder.txtId.text = "${classes[position].classid}"
    }
}