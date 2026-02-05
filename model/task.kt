package com.example.week1kotlinperusteet.model

data class Task(
    val id: Int,
    val title: String,
    val description: String = "",
    val priority: Int = 0,
    val dueDate: String,
    val done: Boolean = false,

    )