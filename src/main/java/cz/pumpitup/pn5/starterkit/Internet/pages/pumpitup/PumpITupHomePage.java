package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.starterkit.Firefox;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;

@Navigate("https://pumpo5.dev/")
@Wait(value = PumpITupHomePage.GettingStarted_BUTTON_XPATH, by = Lookup.XPATH)
public interface PumpITupHomePage extends WebAgentAccessor {

String GettingStarted_BUTTON_XPATH = "/html/body/section/div[2]/p/a";
    @AssertElementPresent(value = "//*[@id=\"getting-started\"]/a/span", by = Lookup.XPATH)
    PumpITupHomePage assertThatContainsText(String text);

    @AssertElementPresent(value = "/html/body/main/aside", by = Lookup.XPATH)
    PumpITupHomePage assertThatContainsSidebar();

    @Click(value = GettingStarted_BUTTON_XPATH, by = Lookup.XPATH)
    PumpITupHomePage clickGettingStarted();



}