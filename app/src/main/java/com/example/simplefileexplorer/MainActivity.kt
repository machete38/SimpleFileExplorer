package com.example.simplefileexplorer

import android.icu.text.CaseMap.Fold
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = createSampleFileStructure()
        val tv = findViewById<TextView>(R.id.fileStructureTextView)
        tv.text = root.display()
    }

    private fun createSampleFileStructure(): FileSystemItem {
        val root = Folder("Root")

        val documents = Folder("Documents")
        documents.addItem(File("cv.pdf",1024))
        documents.addItem(File("cat.jpg",2048))

        val music = Folder("Music")
        music.addItem(File("song1.mp4",8888))
        music.addItem(File("song2.mp4",7777))

        val work = Folder("Work")
        val projects = Folder("Projects")
        projects.addItem(File("pres1.pptx", 1024))
        work.addItem(projects)
        val files = Folder("Files")
        files.addItem(File("stats.xlsx", 1024))
        work.addItem(files)

        root.addItem(File("notes.txt", 1024))
        root.addItem(music)
        root.addItem(work)
        root.addItem(files)

        return root
    }


}