package com.example.pattern;

public class CSVDataMiner extends DataMiner {

    @Override
    public String extractData(String file) {
        System.out.println("Extracting CSV data with file " + file);
        return file;
    }

    @Override
    public String parseData(String rawData) {
        System.out.println("Parsing CSV data with data " + rawData);
        return rawData;
    }

}
