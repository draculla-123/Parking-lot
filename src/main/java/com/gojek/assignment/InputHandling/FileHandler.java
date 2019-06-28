package com.gojek.assignment.InputHandling;

import com.gojek.assignment.AbstractProcessor.CommandsProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandler extends CommandsProcessor {

    String filePath = null;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void process() throws Exception {
        File inputFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = br.readLine()) != null) {
            validateAndProcess(line);
        }
    }
}
