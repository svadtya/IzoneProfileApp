package com.dicoding.picodiploma.izoneprofileapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMemberAdapter(private val listMember: ArrayList<Member>): RecyclerView.Adapter<ListMemberAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_iz_member, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMember.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val member = listMember[position]

        Glide.with(holder.itemView.context)
            .load(member.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = member.name
        holder.tvRole.text = member.role

        holder.itemView.setOnClickListener() {
            onItemClickCallback.onItemClick(listMember[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_member_name)
        var tvRole: TextView = itemView.findViewById(R.id.tv_member_role)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_member_photo)
    }

    interface OnItemClickCallback {
        fun onItemClick(data: Member)
    }
}