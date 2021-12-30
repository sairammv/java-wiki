package beingzero.dequeuethread;

public class NotifyThread extends Thread{

    ReportFIFO reportFIFO;

    NotifyThread(ReportFIFO reportFIFO, String name){
        super(name);
        this.reportFIFO = reportFIFO;
    }


    public void run(){
        while (true){
            reportFIFO.getNextReport();
        }

    }
}
