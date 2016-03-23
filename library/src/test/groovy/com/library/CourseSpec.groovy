package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when:"A course has title, code and tutor"

def course=new Course(title: 'Web System Design',

code: 'WSD101',

tutor: 'Tonderai Maswera')

then: "the to String method will merge them."

course.toString()=='Web System Design, WSD101, Tonderai Maswera'

    }
}
