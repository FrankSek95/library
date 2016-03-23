package com.library

class Student {

String name

String email

String studentId

String course

String toString(){

"$name, $email, $studentId"

}

    static constraints = {

studentId()

name()

email()

course()

    }
}
