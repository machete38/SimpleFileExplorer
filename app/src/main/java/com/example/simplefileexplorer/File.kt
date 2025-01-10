package com.example.simplefileexplorer

class File(private val name: String, private val size: Long): FileSystemItem {
    override fun getName(): String = name

    override fun getSize(): Long = size

    override fun display(indent: String): String = "$indent- $name (${size}B)\n"
}