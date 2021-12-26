package dequeuethread;

import java.util.ArrayDeque;

public class ReportFIFO implements Report {

    ArrayDeque<Report> fifo = new ArrayDeque<>();

    @Override
    public synchronized void report(Report report) {
        fifo.add(report);
        notifyAll();
    }

    public Report getNextReport() {
        while (fifo.isEmpty())
            try {
                wait();
            } catch (Exception e) {
                System.out.println("");
            }
        return fifo.removeFirst();
    }
}
