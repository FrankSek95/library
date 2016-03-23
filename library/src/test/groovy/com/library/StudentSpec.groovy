package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when:"A Student has name, email, studentId"

def student=new Student(name: 'Qasim Shah',

email: 'b1035358@my.shu.ac.uk',

studentId: 'b1035358')

then: "the to String method will merge them."

student.toString()=='Qasim Shah, b1035358@my.shu.ac.uk, b1035358'

    }
}
