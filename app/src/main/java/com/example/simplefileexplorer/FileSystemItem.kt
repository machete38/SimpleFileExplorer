package com.example.simplefileexplorer

interface FileSystemItem {
    fun getName(): String
    fun getSize(): Long
    fun display(indent: String = ""): String
}