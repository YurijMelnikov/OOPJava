package HomeWork6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

class ReportService {
    ArrayList<String> reportTypes;
    int reportType;

    final ArrayList<String> reportFormats = new ArrayList<>(List.of("To Upper Case",
                "To Lower Case"));

    int reportFormat;
    Document document;

    String reportName;

    public ReportService(ArrayList<String> reportTypes, int reportType,
                         int reportFormat, Document document) {
        this.reportTypes = reportTypes;
        this.reportType = reportType;
        this.reportFormat = reportFormat;
        this.document = document;
    }

    void createReportFile()  {
        try {
            String reportName = String.valueOf(document.getId()) + "_" + document.getName() + "." + reportTypes.get(reportType - 1).toLowerCase();
            File report = new File(reportName);
            this.reportName = reportName;
            report.createNewFile();
            FileWriter write = new FileWriter(reportName);
            switch (this.reportFormat){
                case 1 -> write.write(document.getInfo().toUpperCase());
                case 2 -> write.write(document.getInfo().toLowerCase());
            }
            write.close();
        }
        catch (IOException ignored) {
        }
    }
    void readReportFile (){
        try {
            if (this.reportName != null) {
                System.out.println(new String(Files.readAllBytes(Path.of(this.reportName))));
            }
        }
        catch (IOException ignored){
        }
    }
}