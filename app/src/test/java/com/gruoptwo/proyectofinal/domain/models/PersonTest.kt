package com.gruoptwo.proyectofinal.domain.models

import org.junit.Test


class PersonTest() {

    @Test
    fun testPerson() {
        val person = Person("12345678")
        assert(person.dni == "123")
    }
}