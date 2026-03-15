package com.rtseditor

import java.nio.ByteBuffer
import java.nio.ByteOrder

object FileIO {

    fun parseBin(bytes:ByteArray):MutableList<Frame>{

        val frames = mutableListOf<Frame>()
        val buffer = ByteBuffer.wrap(bytes)

        buffer.order(ByteOrder.LITTLE_ENDIAN)

        buffer.int
        buffer.int

        while(buffer.remaining() >= 12){

            val sprite = buffer.int
            val layer = buffer.int
            val time = buffer.int

            frames.add(Frame(sprite,layer,time))

        }

        return frames
    }

    fun writeBin(frames:List<Frame>):ByteArray{

        val buffer = ByteBuffer.allocate(frames.size*12+8)

        buffer.order(ByteOrder.LITTLE_ENDIAN)

        buffer.putInt(0x42494C45)
        buffer.putInt(1)

        for(f in frames){

            buffer.putInt(f.spriteId)
            buffer.putInt(f.layer)
            buffer.putInt(f.duration)

        }

        return buffer.array()
    }

}
