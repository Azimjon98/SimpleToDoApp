package uz.devazimjon.demo.simpletodoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NoteListActivity : AppCompatActivity() {

    private var binding: NoteListActivityBinding by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NoteListActivityBinding.setContentView(this)


    }
}