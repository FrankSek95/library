package com.library

class Student {

String name

String email

String studentId

String course

static hasMany=[books: Book, libraries: Library]

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
