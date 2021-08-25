package com.example.pattern;

public class PDFDataMiner extends DataMiner {

    @Override
    public String extractData(String file) {
        System.out.println("Extracting PDF data with file " + file);
        return file;
    }

    @Override
    public String parseData(String rawData) {
        System.out.println("Parsing PDF data with data " + rawData);
        return rawData;
    }

}
