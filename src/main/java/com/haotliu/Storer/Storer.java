package com.haotliu.Storer;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public interface Storer {
    public void store(File file);
}
