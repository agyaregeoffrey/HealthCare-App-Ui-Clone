package com.gka.healthcareapp.offline

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class PrefManager private constructor() {

    fun saveUserInfo(name: String) {
        editor!!.putString("name", name)
        editor!!.commit()
    }

    fun getName(): String? {
        return sharedPreferences!!.getString("name", "")
    }

    companion object {
        private val sharedPref = PrefManager()
        private var sharedPreferences: SharedPreferences? = null
        private var editor: SharedPreferences.Editor? = null

        @Synchronized
        fun getInstance(context: Context?): PrefManager {
            if (sharedPreferences == null) {
                sharedPreferences = context?.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
                editor = sharedPreferences!!.edit()
            }

            return sharedPref
        }
    }
}