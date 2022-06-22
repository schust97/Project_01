package com.example.practice01.ui.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice01.R
import com.example.practice01.ui.model.User

class userRecycleView(var userList: ArrayList<User>) : RecyclerView.Adapter<userRecycleView.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_item_userImage: ImageView = itemView.findViewById(R.id.iv_item_userImage)
        var tv_item_userName: TextView = itemView.findViewById(R.id.tv_item_userName)
        var tv_item_message: TextView = itemView.findViewById(R.id.tv_item_message)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
