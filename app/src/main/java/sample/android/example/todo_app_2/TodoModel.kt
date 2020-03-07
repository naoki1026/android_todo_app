package sample.android.example.todo_app_2

import io.realm.RealmObject

open class TodoModel : RealmObject() {

    //タイトル
    var title : String = ""

    //期日(yyyy/mm/dd)
    var deadLine : String =  ""

    //タスク内容
    var taskDetail : String = ""

    //タスク完了フラグ
    var isCompleted : Boolean = false


}