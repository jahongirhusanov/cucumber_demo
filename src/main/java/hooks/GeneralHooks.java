package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class GeneralHooks {
    //ToDo create public method
    //ToDo @Before & @After
    //ToDo Spefify in Runner

    @Before
    public void setUp(Scenario name) {
        System.out.println("---- Before Hook ----");
        System.out.println(name.getName());
        System.out.println(name.getStatus());
    }

    @After
    public void tearDown(Scenario name) {
        System.out.println("---- After Hook ----");
        System.out.println(name.getName());
        System.out.println(name.getStatus());
    }

    // Inject Scenario Object in the hook method

}
