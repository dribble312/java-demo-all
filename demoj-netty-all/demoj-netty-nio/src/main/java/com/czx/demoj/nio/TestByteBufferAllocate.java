package com.czx.demoj.nio;

import java.nio.ByteBuffer;

public class TestByteBufferAllocate {
    public static void main(String[] args) {
System.out.println(ByteBuffer.allocate(16).position());
System.out.println(ByteBuffer.allocateDirect(16).getClass());
    }
}
