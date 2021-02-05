package com.gka.healthcareapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Chat
import com.gka.healthcareapp.viewholders.ChatViewHolder

class ChatRecyclerAdapter(context: Context, private val chats: List<Chat>) :
    RecyclerView.Adapter<ChatViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val itemView = layoutInflater.inflate(R.layout.rv_chat_item, parent, false)
        return ChatViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chatPosition = chats[position]
        holder.bind(chatPosition)
    }

    override fun getItemCount() = chats.size
}