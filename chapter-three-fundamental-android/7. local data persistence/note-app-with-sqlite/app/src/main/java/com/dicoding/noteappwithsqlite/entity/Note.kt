package com.dicoding.noteappwithsqlite.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    var id: Int? = null,
    var title: String? = null,
    var description: String? = null,
    var date: String? = null
) : Parcelable