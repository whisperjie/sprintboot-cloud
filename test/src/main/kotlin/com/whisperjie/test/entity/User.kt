package com.whisperjie.test.entity

class User {
var id:Int = 0
    get
    set


    var name:String=""
    get()=field.toUpperCase()
    set

    constructor(){
        println("${id},${name}")
    }

}

