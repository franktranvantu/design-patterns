package com.example.pattern;

public abstract class DataMiner {

    public final void mine(String path) {
        String file = path;
        if (needsOpenFile()) {
            file = openFile(path);
        }
        String rawData = extractData(file);
        String data = parseData(rawData);
        String analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    protected abstract String extractData(String file);

    protected abstract String parseData(String rawData);

    protected boolean needsOpenFile() {
        return true;
    }

    protected String openFile(String path) {
        System.out.println("Opening default file with path " + path);
        return path;
    }

    protected String analyzeData(String data) {
        System.out.println("Analyzing default data with data " + data);
        return data;
    }

    protected void sendReport(String analysis) {
        System.out.println("Sending default report with analysis " + analysis);
    }

    protected void closeFile(String file) {
        System.out.println("Closing default file with file " + file);
    }



}
