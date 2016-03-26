package com.library

class Course {

String title

String code

String tutor

String department

String description

static hasMany=[students: Student]

String toString(){
"$title, $code, $tutor"
}

    static constraints = {

title()

description maxSize: 5000

tutor()

code()

department()
    }
}
