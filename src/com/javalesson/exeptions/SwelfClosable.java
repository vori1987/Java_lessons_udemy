package com.javalesson.exeptions;

import java.io.Closeable;
import java.io.FileNotFoundException;

public interface SwelfClosable extends Closeable {

    @Override
    void close() throws FileNotFoundException;
}
