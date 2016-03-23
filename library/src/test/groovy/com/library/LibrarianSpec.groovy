package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when:"A Librarian has userName, password and name"

def librarian=new Librarian(userName: 'b3013131',

password: 'password',

name: 'Shabaz Khalid')

then: "the to String method will merge them."

librarian.toString()=='b3013131, password, Shabaz Khalid'

    }
}
