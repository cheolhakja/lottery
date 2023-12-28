package com.lottery.io;

import java.util.Scanner;

public class ConsoleInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputUserName() {
        return inputWithMessage("성함을 입력해주세요 (동아리 부원 확인용으로 사용됩니다).");
    }

    public String inputLottoPurchaseAmount() {
        return inputWithMessage("구입금액을 입력해 주세요.");
    }

    public String inputAmountOfManualLotto() {
        return inputWithMessage("수동으로 구매할 로또 수를 입력해 주세요.");
    }

    public String inputManualLottoNumbers() {
        return inputWithMessage("수동으로 구매할 번호를 입력해 주세요.");
    }

    private String inputWithMessage(final String message) {
        System.out.println(message);

        return inputFromUser();
    }

    private String inputFromUser() {
        return SCANNER.nextLine();
    }
}
