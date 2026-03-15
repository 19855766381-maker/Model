package com.rtseditor

object EditorCore {

    fun addFrame(list:MutableList<Frame>,frame:Frame){

        list.add(frame)

    }

    fun removeFrame(list:MutableList<Frame>,index:Int){

        if(index < list.size){

            list.removeAt(index)

        }

    }

}
