package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Clac에 run 메서드는 int를 리턴한다.");
    void t(){
        int rs = Calc.run("");
    }
}
