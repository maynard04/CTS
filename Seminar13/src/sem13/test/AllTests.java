package sem13.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GrupaTeste.class, TestGrupaWithDummy.class, TestGrupaWithFake.class, TestGrupaWithStub.class })
public class AllTests {

}
