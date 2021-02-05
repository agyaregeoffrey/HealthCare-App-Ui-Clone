package com.gka.healthcareapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.adapters.ChatRecyclerAdapter
import com.gka.healthcareapp.model.Chat


/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatFragment : Fragment() {

    private lateinit var chatRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chatRecyclerView = view.findViewById(R.id.rv_chats)
        chatRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ChatRecyclerAdapter(context, chats = chatData())
            hasFixedSize()
        }
    }

    private fun chatData(): ArrayList<Chat> {
        val chat = ArrayList<Chat>()
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))
        chat.add(Chat("Dr. John Rodriguez", getString(R.string.chat_message), "12:22", R.drawable.person))

        return chat
    }
}