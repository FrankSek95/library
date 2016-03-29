package com.library

class Student {

String name

String email

String studentId

Course course

static hasMany=[books: Book, library: Library]

String toString(){

"$name, $email"
}

    static constraints = {

studentId()

name()

email()

course()

}
}
