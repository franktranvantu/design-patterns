package com.example.pattern;

public class DocDataMiner extends DataMiner {

    @Override
    public String extractData(String file) {
        System.out.println("Extracting Doc data with file " + file);
        return file;
    }

    @Override
    public String parseData(String rawData) {
        System.out.println("Parsing Doc data with data " + rawData);
        return rawData;
    }

    @Override
    protected boolean needsOpenFile() {
        return false;
    }
}
