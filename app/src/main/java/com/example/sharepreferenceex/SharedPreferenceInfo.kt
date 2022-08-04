package com.example.sharepreferenceex

import android.content.Context
import android.content.SharedPreferences
import android.widget.TextView

class SharedPreferenceInfo(var context: Context) {
    var name = "TestSharedPreference"

    fun setString(key: String, value: String) {
        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences(name, Context.MODE_PRIVATE)
        val edt = sharedPreferences.edit()
        edt.putString(key, value)
        edt.apply()
    }

    fun getString(key: String): String? {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, "")
    }

    fun setBool(key: String, value: Boolean) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        val edt = sharedPreferences.edit()
        edt.putBoolean(key, value)
        edt.apply()
    }

    fun getBool(key: String): Boolean {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(key, false)
    }

}