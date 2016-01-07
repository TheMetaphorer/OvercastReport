package ga.dore.overcastreport.client.report.info;


import ga.dore.overcastreport.client.OCServerCurrent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportInfo {
    public final ReportType reportType;
    public final String player;
    public final String date;
    public final String server;
    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private final Date dateObj = new Date();
    public ReportInfo(ReportType reportType, String player) {
        this.reportType = reportType;
        this.player = player;
        server = OCServerCurrent.server.serverName;
        date = dateFormat.format(dateObj);
    }
}
