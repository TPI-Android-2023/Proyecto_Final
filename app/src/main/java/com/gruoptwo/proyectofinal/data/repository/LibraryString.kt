package com.gruoptwo.proyectofinal.data.repository

object LibraryString {

    const val REGEX_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
    const val REGEX_PASSWORD= "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}\$"


    fun validEmail(email: String): Boolean {
        return email.matches(REGEX_EMAIL.toRegex())
    }

    fun validPassword(password: String): Boolean {
        return password.matches(REGEX_PASSWORD.toRegex())
    }

    fun validUserName(userName: String): Boolean {
        return userName != null && userName.length >= 3
    }
}