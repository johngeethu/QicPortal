package com.maximus.qicportaltestautomation.qic_app_manager;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class contains methods to read a PDF from resources and extract values from it
 */
public class PdfHelper {

    public static void main(String[] args) {
        String tempIdFromConfirmationPage = "A19-00000635";
        System.out.println(readThePdf(tempIdFromConfirmationPage));
    }


    /**
     * This method reads a PDF from "resources" folder by the file name and returns data as a String
     * @param tempId The string which provides the name of the saved PDF-file, where the information is stored
     * @return Data from the whole PDF as a String
     */
    public static String readThePdf(String tempId) {

        String text = "";
        try{
        PDDocument document = PDDocument.load(new File("src/test/resources/" + tempId + ".pdf"));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            text = stripper.getText(document);
        }
        document.close();

        }
        catch (Exception ex){
            System.out.println("Can not work with PDDocument");
        }
        return text;
    }


    /**
     * This method reads a text, which can be obtained from the "readThePdf" method.
     * It uses text values of a PDF category name (for example "Enrolee Data" in a Part C PDF file) and a particular line name ("Medicare Number (MBI)") divided by a vertical bar sign (|) and returns a String after the first colon, for example: "Plan Contact|First Name"
     * @param pdfString
     * @return
     * @throws IOException
     */
    private static Map<String, String> parsePdfString(String pdfString)  {
        Set<String> HEADERS = new HashSet<>();
        //Upload Additional Information functionality
        HEADERS.add("Additional Information Submitted via QIC Portal");
        //Part C case submission
        HEADERS.add("Part C Case File Submission - Output to SQID");
        HEADERS.add("Enrollee Data");
        HEADERS.add("Appeal Category & Appeal Type/Item Service");
        HEADERS.add("Definition of Denied Services or Claims");
        HEADERS.add("Provider Identification Data");
        HEADERS.add("Parties");
        HEADERS.add("Plan Information");
        HEADERS.add("Plan Contact");
        HEADERS.add("Plan Alternate Contact");
        HEADERS.add("Appeal Request Information");
        HEADERS.add("MHP Organization Determination");
        HEADERS.add("MHP Reconsideration");
        HEADERS.add("Provider Identification Data");


        Map<String, String> parsedStr = new HashMap<>();
        String[] previousKey = new String[1];
        String[] prefix = {""};
        BufferedReader br = new BufferedReader(new StringReader(pdfString));
        br.lines().forEach(line -> {
            line = line.trim();
            if (!line.isEmpty()) {
                if (!line.contains(":") && HEADERS.contains(line.trim())) {
                    prefix[0] = line;
                } else if(line.contains(":")){
                    String key = prefix[0] + "|" + line.substring(0, line.indexOf(":"));
                    previousKey[0]=key.trim();
                    String value = line.substring(line.indexOf(":") + 1);
                    parsedStr.put(key.trim(), value.trim());
                } else if(!previousKey[0].isEmpty()){
                    parsedStr.put(previousKey[0], parsedStr.get(previousKey[0])+  line.trim());
                }
            }
        });
        try{
        br.close();}
        catch (Exception ex){
            System.out.println("Can not close the BufferedReader");
        }

        return parsedStr;
    }


    /**
     * This method returns a text value of a field in the PDF file
     * @param caseNumber
     * @param pdfLocator
     * @return
     */
    public static String getTextFromPdf(String caseNumber, String pdfLocator)  {
        String fullOriginalText = readThePdf(caseNumber);
        Map<String, String> parsePdfString = parsePdfString(fullOriginalText);
        String text = parsePdfString.get(pdfLocator);

        return text;
    }


}
