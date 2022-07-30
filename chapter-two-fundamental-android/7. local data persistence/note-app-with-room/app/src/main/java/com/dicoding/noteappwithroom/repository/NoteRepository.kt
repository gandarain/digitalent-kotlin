package com.dicoding.noteappwithroom.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.dicoding.noteappwithroom.database.Note
import com.dicoding.noteappwithroom.database.NoteDao
import com.dicoding.noteappwithroom.database.NoteRoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class NoteRepository(application: Application) {
    private val mNotesDao: NoteDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = NoteRoomDatabase.getDataBase(application)
        mNotesDao = db.noteDao()
    }

    fun getAllNotes(): LiveData<List<Note>> = mNotesDao.getAllNote()

    fun insert(note: Note) {
        executorService.execute{ mNotesDao.insert(note) }
    }

    fun delete(note: Note) {
        executorService.execute { mNotesDao.delete(note) }
    }

    fun update(note: Note) {
        executorService.execute { mNotesDao.update(note) }
    }
}