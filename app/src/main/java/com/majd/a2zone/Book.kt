package com.majd.a2zone

var booklist = mutableListOf<Book>()

val BOOK_ID_EXTRA = "bookExtra"

class Book(
    var cover: Int,
    var title: String,
    var description: String,
    val id: Int? = booklist.size
)