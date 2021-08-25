package com.example;

import com.example.pattern.CSVDataMiner;
import com.example.pattern.DataMiner;
import com.example.pattern.DocDataMiner;

public class Main {

    public static void main(String[] args) {
        DataMiner dataMiner = new DocDataMiner();
        dataMiner.mine("example.txt");
    }
}
