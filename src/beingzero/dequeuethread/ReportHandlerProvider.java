package dequeuethread;

public class ReportHandlerProvider {

   private static ReportFIFO reportFIFO;
   private static NotifyThread notifyThread;

   static {
       reportFIFO = new ReportFIFO();
       notifyThread = new NotifyThread(reportFIFO, "Notify Thread");
       notifyThread.start();
   }

   Report getReportProvider(){
       return reportFIFO;
   }

}
