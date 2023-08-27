package com.gruoptwo.proyectofinal.domain.models

import org.junit.Test

class PersonTest() {

    @Test
    fun testPerson() {
        val person = Person("John")
        assert(person.name == "John Salch ichom")
    }
}

