package htmlHelpers;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class HtmlPreparer {

    public static void tableHeaderRaw(PrintWriter out, String... headers) {
        List<String> headersList = Arrays.asList(headers);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<style>\n" +
                "table, th, td {\n" +
                "  border: 1px solid black;\n" +
                "}\n" +
                "</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table class=\"table table-hover\">");
        out.println("<tr>");
        headersList.forEach(header -> out.println("<th>" + header + "</th>"));
        out.println("</tr>");
    }

    public static void tableOtherRaw(PrintWriter out, String... rowValues) {
        List<String> valuesList = Arrays.asList(rowValues);
        out.println("<tr>");
        valuesList.forEach(value -> out.println("<td>" + value + "</td>"));
        out.println("</tr>");
    }
}
