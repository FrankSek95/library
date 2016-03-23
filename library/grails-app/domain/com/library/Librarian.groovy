package com.library

class Librarian {

String name

String email

String userName

String password

String telephone

String toString(){

"$userName, $password, $name"
}

    static constraints = {

userName()

password()

name()

email()

telephone()

    }
}
