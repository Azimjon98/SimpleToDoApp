package uz.devazimjon.demo.simpletodoapp.data.repository

import android.content.SharedPreferences
import uz.devazimjon.demo.simpletodoapp.data.NoteRepository
import uz.devazimjon.demo.simpletodoapp.data.model.Note

class NoteRepositoryImpl(private val preferences: SharedPreferences) : NoteRepository {

    override fun deleteNote(note: Note) {
        TODO("Not yet implemented")
    }

    override fun getNotes(): List<Note> {
        return listOf(
            Note(text = "Title1"),
            Note(text = "Title2")
        )
    }

    override fun saveNote(note: Note) {
        TODO("Not yet implemented")
    }
}
