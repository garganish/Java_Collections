/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author anishgarg
 */
public class queues {
    public static void main(String[] args) {
        Queue<String> qu=new LinkedList<>();
        qu.add("first");
        qu.add("second");
        qu.add("third");
        while(!qu.isEmpty())
        {
            System.out.println("["+qu.remove()+"]");
        }
    }
}
