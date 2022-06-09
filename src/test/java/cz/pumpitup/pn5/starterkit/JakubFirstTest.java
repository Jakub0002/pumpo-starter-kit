package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class JakubFirstTest {

    @Test
    public void test(Firefox firefox) {
        firefox
                //.waitSecondsOf(8)
                .openPumpITupPage()
                    .clickGettingStarted()
                .assertThatContainsText("Getting started")
                .assertThatContainsSidebar();

        System.out.println("Test complete");

}
}

