package com.rtseditor

data class Frame(
    var spriteId:Int,
    var layer:Int,
    var duration:Int
)

data class Sprite(
    var name:String,
    var x:Int,
    var y:Int,
    var w:Int,
    var h:Int
)
