package com.library

class Book {

String title

String author

int isbn

String dateBorrowed

String returnDate

Student student

String toString(){

"$title, $author, $isbn"
}

    static constraints = {

title()

author()

isbn()

student()

dateBorrowed()

returnDate()


    }
}
