package com.lottery;

import com.lottery.io.ConsoleInput;
import com.lottery.io.ConsoleOutput;

public class Main {

    private static final int MAX_LOTTO_NUMBER = 11;
    
    
    public static void main(String[] args) {

        ConsoleOutput consoleOutput = new ConsoleOutput();
        ConsoleInput consoleInput = new ConsoleInput();


        while(true) {
            String userName = consoleInput.inputUserName();

            consoleOutput.showAvailableLottoNumbers(MAX_LOTTO_NUMBER);
            String manualLottoNumbers = consoleInput.inputManualLottoNumbers();

            


        }


    }
}
