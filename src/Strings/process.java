/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.IOException;

/**
 *
 * @author anishgarg
 */
public class process {
    public static void main(String[] args) throws IOException {
        Runtime run=Runtime.getRuntime();
        Process p;
        String comm="/Users/anishgarg/Desktop/yeh/hack.cpp";
        p=run.exec(comm);
    }
           
}
