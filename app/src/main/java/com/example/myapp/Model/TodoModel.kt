package com.example.myapp.Model

class TodoModel {
    var id : Int=0
    var status : Int=0
    var task : String =""

    fun getId() : Int{
        return id
    }
    fun setId():Int{
        return id
    }

    fun getStatus() : Int{
        return status
    }

    fun setStatus() : Int{
        return status
    }

    fun getTask() : String{
        return task
    }

    fun setTask() : String{
        return task
    }
}

