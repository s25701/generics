
import main.java.eu.glowacki.utp.assignment01.GenericsCollect;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import main.java.eu.glowacki.utp.assignment01.House;





class HouseTest {

    private final static String realestate = "Villa";
    private final static int construction = 2013;

    private House house = new House(realestate, construction);
    private static int counter = 0;

    @BeforeAll
    public static void beforeTest() {
        System.out.println("Before House Tests Compilation...");
    }


    @BeforeEach
    public void before() {

        System.out.println(1 + counter++ + ". Compilation");
    }

    @Test
    public void test() {
        Assert.assertEquals(realestate, house.getRealestate());
        Assert.assertEquals(construction, house.getConstruction());

    }

    @Test
    public void testAggregate() {
        int aggregate = house.aggregate(null);
        Assert.assertEquals(aggregate, construction);

    }

    @Test
    public void testDeepClone() {
       House firstClone = house.deepClone();

        Assert.assertNotEquals(house, firstClone);

        Assert.assertEquals(house.getRealestate(), firstClone.getRealestate());
    }

    @AfterEach
    public void after() {
        System.out.println("compilation succeed :) \n");
    }

    @AfterAll
    public static void afterTest() {
        System.out.println("After Tests Compilation...");
    }
}
