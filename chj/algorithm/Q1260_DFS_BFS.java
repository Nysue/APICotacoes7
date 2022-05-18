
package com.company.boostcamp;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1260_DFS_BFS {
    int nodeNumber;
    int edgeNumber;
    int startNodeNumber;
    int[][] table;

    LinkedList<Integer> visited = new LinkedList<>();
    LinkedList<Integer> queue = new LinkedList<>();

    public void main() {
        Scanner scanner = new Scanner(System.in);

        nodeNumber = scanner.nextInt();
        edgeNumber = scanner.nextInt();
        startNodeNumber = scanner.nextInt();
        table = new int[nodeNumber + 1][nodeNumber + 1];


        for (int i = 0; i < edgeNumber; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            table[x][y] = table[y][x] = 1;
        }

        /*for (int i = 0; i < nodeNumber + 1; i++) {
            System.out.print("[ ");
            for (int j = 0; j < nodeNumber + 1; j++) System.out.print(String.format("%d ", table[i][j]));
            System.out.println("]");
        }*/

        // DFS
        queue.add(startNodeNumber);
        DFS();
        for (Integer nodeNumber : visited) System.out.print(nodeNumber + " ");
        System.out.println(" ");

        clearQueue();

        // BFS
        queue.add(startNodeNumber);
        BFS();
        for (Integer nodeNumber : visited) System.out.print(nodeNumber + " ");
    }

    public void BFS() {
        // if no node to visit
        if (queue.isEmpty()) return;
        else {
            // add this node to visited
            int visitNodeNumber = queue.poll();

            // if already visited node
            if (visited.contains(visitNodeNumber)) return;
            visited.add(visitNodeNumber);

            // get node that need to visit, add to queue
            for (int i = 0; i < nodeNumber + 1; i++)
                if (table[visitNodeNumber][i] == 1 && !visited.contains(i)) queue.add(i);

//            printQueue();

            // visit next node
            BFS();
        }
    }

    public void DFS() {
        // if no node to visit
        if (queue.isEmpty()) return;
        else {
            // add this node to visited
            int visitNodeNumber = queue.poll();

            // if already visited node
            if (visited.contains(visitNodeNumber)) return;
            visited.add(visitNodeNumber);

            // get node that need to visit, add to queue
            for (int i = 0; i < nodeNumber + 1; i++)
                if (table[visitNodeNumber][i] == 1 && !visited.contains(i)) {
                    queue.add(i);
                    break;
                }

//            printQueue();

            // visit next node
            DFS();
        }
    }

    public void printQueue() {
        System.out.print("visited : ");
        for (Integer nodeNumber : visited) System.out.print(nodeNumber);
        System.out.print("\nqueue : ");
        for (Integer nodeNumber : queue) System.out.print(nodeNumber);
        System.out.println(" ");
    }

    public void clearQueue() {
        visited.clear();
        queue.clear();
    }
}