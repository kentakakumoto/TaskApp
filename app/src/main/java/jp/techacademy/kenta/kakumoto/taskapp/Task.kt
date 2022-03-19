package jp.techacademy.kenta.kakumoto.taskapp

import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Task: RealmObject(), Serializable {
    var title: String = ""
    var contents: String = ""
    var date: Date = Date()

    @PrimaryKey
    var id: Int = 0
}