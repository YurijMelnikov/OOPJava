package HomeWork6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> reportTypes = new ArrayList<>(List.of("PDF",
                "DOC",
                "JSON",
                "XML",
                "TXT"));

        Document document1 = new Document(561, "sale", "random text");
        ReportService report1 = new ReportService(reportTypes, 5,  1, document1);
        report1.createReportFile();
        report1.readReportFile();
        Document document2 = new Document(1000, "losses", "table of losses");
        ReportService report2 = new ReportService(reportTypes, 3,  2, document2);
        report2.createReportFile();
        report2.readReportFile();
    }
}