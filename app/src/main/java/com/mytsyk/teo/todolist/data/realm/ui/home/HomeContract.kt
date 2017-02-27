package com.mytsyk.teo.todolist.data.realm.ui.home

import com.mytsyk.teo.todolist.data.realm.model.TaskModel
import io.realm.RealmResults

/**
 * Created by teodor on 2/27/17.
 */
interface HomeContract {
    interface HomeModel{
        fun getTaskList() : RealmResults<TaskModel>
        fun removeTaskFromRealm(taskId: String)
    }

    interface HomeView{

    }

    interface HomePresenter{

    }

}