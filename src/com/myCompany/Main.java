package com.myCompany;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("Пример односторонней очереди (FIFO):");
        System.out.println("Посадка пассажиров в самолет, 10 чел:");

        Queue <Integer> intQueue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Садится пассажир №" + (i + 1));
            intQueue.offer(i + 1);
        }
        System.out.println(intQueue);
        System.out.println("Пассажиры выходят из самолета:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Выходит пассажир №" + intQueue.poll());
        }

        System.out.println("*****************************************");
        System.out.println("Пример двусторонней очереди (LIFO)");

        Deque<Integer> integerDeque = new LinkedList<>();
        System.out.println("Посадка пассажиров в самолет, 10 чел (посадка так же как и в односторонней очереди)\nПоследний пассажир садится в конце:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Садится пассажир №" + (i + 1));
            integerDeque.offerLast(i + 1);
        }

        System.out.println(integerDeque);

        System.out.println("Пассажиры выходят из самолета (последний пассажир выходит первым):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Выходит пассажир №" + integerDeque.pollLast());
        }

        System.out.println("*****************************************");
        System.out.println("Пример работы со стеком");
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Садится пассажир №" + (i + 1));
            linkedList.push(i + 1);
        }

        System.out.println(linkedList);

        for(int i = 0; i < 10; i++) {
            System.out.println("Выходит пассажир №" + linkedList.pop());
        }

    }
}
