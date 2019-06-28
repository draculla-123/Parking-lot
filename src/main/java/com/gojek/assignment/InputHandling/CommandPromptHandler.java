package com.gojek.assignment.InputHandling;


import com.gojek.assignment.AbstractProcessor.CommandsProcessor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandPromptHandler extends CommandsProcessor {

    public void process() throws Exception {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            String inputString = bufferRead.readLine();
            validateAndProcess(inputString);
        }
    }



}
