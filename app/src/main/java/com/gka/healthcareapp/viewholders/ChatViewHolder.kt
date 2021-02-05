package com.gka.healthcareapp.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Chat

class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val contactName: TextView = itemView.findViewById(R.id.textView_chat_doctor_name)
    private val message: TextView = itemView.findViewById(R.id.textView_chat_message)
    private val messageTime: TextView = itemView.findViewById(R.id.textView_chat_time)
    private val contactImage: ImageView = itemView.findViewById(R.id.imageView_chat_doctor)

    fun bind(chat: Chat) {
        contactName.text = chat.contactName
        message.text = chat.message
        messageTime.text = chat.time
        contactImage.setImageResource(chat.image)
    }
}