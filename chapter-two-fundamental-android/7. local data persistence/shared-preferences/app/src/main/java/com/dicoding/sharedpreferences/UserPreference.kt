package com.dicoding.sharedpreferences

import android.content.Context

internal class UserPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "user_pref"
        private const val NAME = "name"
        private const val EMAIL = "email"
        private const val AGE = "age"
        private const val PHONE_NUMBER = "phone"
        private const val LOVE_MU = "isLove"
    }

    private val preference = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setUser(value: UserModel) {
        val editor = preference.edit()
        editor.putString(NAME, value.name)
        editor.putString(EMAIL, value.email)
        value.age?.let { editor.putInt(AGE, it) }
        editor.putString(PHONE_NUMBER, value.phoneNumber)
        editor.putBoolean(LOVE_MU, value.isLove)
        editor.apply()
    }

    fun getUser(): UserModel {
        val model = UserModel()
        model.name = preference.getString(NAME, "")
        model.email = preference.getString(EMAIL, "")
        model.age = preference.getInt(AGE, 0)
        model.phoneNumber = preference.getString(PHONE_NUMBER, "")
        model.isLove = preference.getBoolean(LOVE_MU, false)

        return model
    }
}