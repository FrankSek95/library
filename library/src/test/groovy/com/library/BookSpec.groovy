package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when:"A book has title, author and isbn"

def book=new Book(title: 'Harry Potter and the Cursed Child',

author: 'J.K. Rowling',

isbn: '123456789')

then: "the to String method will merge them."

book.toString()=='Harry Potter and the Cursed Child, J.K. Rowling, 123456789'

    }
}
