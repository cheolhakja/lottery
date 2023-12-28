package com.lottery.io;

public class ConsoleOutput {

    private static final int MAX_LOTTO_NUMBER = 11;

    public void showAvailableLottoNumbers(int maxLottoNumber) {
        for (int i = 0; i < maxLottoNumber; i++) {
            if(i % 4 == 0) {
                System.out.println();
            }

            System.out.printf("%-7d", i+1);

        }
    }
}
