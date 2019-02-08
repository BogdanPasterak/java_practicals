package differentCoatTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerCreateTest.class, CustomerGetterSetterTest.class, CustomerToStringTest.class,
		PaintRequiredCalculatorTest.class, SurfaceCalculatorTest.class })
public class AllTests {

}
