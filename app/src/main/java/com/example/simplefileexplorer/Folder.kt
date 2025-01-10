package com.example.simplefileexplorer

class Folder(private val name: String) : FileSystemItem {

    private val children: MutableList<FileSystemItem> = mutableListOf()

    fun addItem(item: FileSystemItem){
        children.add(item)
    }

    override fun getName(): String = name

    override fun getSize(): Long = children.sumOf { it.getSize() }

    override fun display(indent: String): String {
        val sb = StringBuilder()
        sb.append("$indent+ $name/\n")
        children.forEach { sb.append(it.display("$indent   ")) }
        return sb.toString()
    }

}