package com.mytsyk.teo.todolist.data.realm

/**
 * Created by teodor on 2/27/17.
 */
interface IRealmModule {
    fun addNewTask()

    fun removeTask(taskId: String)

    fun update()

    fun getTasks()
}