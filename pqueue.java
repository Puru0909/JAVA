import java.util.*;

public class pqueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        //override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
       /* pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);*/

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name +"->"+ pq.peek().rank);
            pq.remove();
        }


    }
}