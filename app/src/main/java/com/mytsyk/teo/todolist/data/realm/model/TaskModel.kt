package com.mytsyk.teo.todolist.data.realm.model

import io.realm.RealmObject

/**
 * Created by teodor on 2/27/17.
 */
 open class TaskModel : RealmObject{
    constructor() : super()

    var title : String? = null
    var note : String? = null
    var priority : String? = null
    var status : Int? = null
    var creatingTime : String? = null
    var updatedTime: String? = null
}