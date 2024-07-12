package io.loop.test.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.PizzaOrderWebTableUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. go to https://loopcamp.vercel.app/web-tables.html
2. create a method to test given field for a given name
3. test type
4. test amount
5. test date
6. test street
7. test city
8. test state
9. test zip
10. test card
11. test card number
12. test exp
*/
public class T0_pizza_order extends TestBase {

@Test
    public void test_pizza_type(){
    driver.get("https://loopcamp.vercel.app/web-tables.html");
    String name = "Samuel Jackson";
    String expectedPizzaType = "13, Owl st.";

    String actualPizzaType = PizzaOrderWebTableUtil.returnAnyFieldValue(driver, name, "Street");

    System.out.println("actualPizzaType = " + actualPizzaType);

    Assert.assertEquals(actualPizzaType, expectedPizzaType, "actual does not match exepcted:");
}
}
