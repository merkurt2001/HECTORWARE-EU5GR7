package hectorware.stepsdefenitions;

import hectorware.utilities.Driver;
import hectorware.utilities.WebTools;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        WebTools.waitFor(2);

    }
    @After
    public void tearDown(){
        WebTools.waitFor(2);
        Driver.closeDriver();
    }
}
