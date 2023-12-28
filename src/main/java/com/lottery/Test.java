package com.lottery;

import com.lottery.io.ConsoleOutput;

public class Test {

    private static final int MAX_LOTTO_NUMBER = 11;


    public static void main(String[] args) {

        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.showAvailableLottoNumbers(MAX_LOTTO_NUMBER);

    }
}
