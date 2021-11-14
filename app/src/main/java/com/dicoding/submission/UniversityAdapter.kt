package com.dicoding.submission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class UniversityAdapter(val listUniv: ArrayList<University>) : RecyclerView.Adapter<UniversityAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.row_layout, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val univ = listUniv[position]

        Glide.with(holder.itemView.context)
            .load(univ.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = univ.name
        holder.tvWebsite.text = univ.website

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, UniversityDetail::class.java)
            moveDetail.putExtra(UniversityDetail.EXTRA_PHOTO, univ.photo)
            moveDetail.putExtra(UniversityDetail.EXTRA_NAME, univ.name)
            moveDetail.putExtra(UniversityDetail.EXTRA_KONTAK, univ.kontak)
            moveDetail.putExtra(UniversityDetail.EXTRA_WEBSITE, univ.website)
            moveDetail.putExtra(UniversityDetail.EXTRA_EMAIL, univ.email)
            moveDetail.putExtra(UniversityDetail.EXTRA_INSTAGRAM, univ.ig)
            moveDetail.putExtra(UniversityDetail.EXTRA_ALAMAT, univ.alamat)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.univ_name)
        var tvWebsite: TextView = itemView.findViewById(R.id.univ_website)
        var imgPhoto: ImageView = itemView.findViewById(R.id.univ_photo)
    }

}