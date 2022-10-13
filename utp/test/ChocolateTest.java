import main.java.eu.glowacki.utp.assignment01.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;



class ChocolateTest {

    private final static String choco = "Biskrem";
    private final static int production = 2013;

    private Chocolate chocolate = new Chocolate(choco, production);
    private static int counter = 0;

    @BeforeAll
    public static void beforeTest() {
        System.out.println("Before Chocolate Tests Compilation...");
    }


    @BeforeEach
    public void before() {

        System.out.println(1 + counter++ + ". Compilation");
    }

    @Test
    public void test() {
        Assert.assertEquals(choco, chocolate.getChoco());
        Assert.assertEquals(production, chocolate.getProduction());

    }

    @Test
    public void testAggregate() {
        int aggregate = chocolate.aggregate(null);
        Assert.assertEquals(aggregate, production);

    }

    @Test
    public void testDeepClone() {
       Chocolate firstClone = chocolate.deepClone();

        Assert.assertNotEquals(chocolate, firstClone);

        Assert.assertEquals(chocolate.getChoco(), firstClone.getChoco());
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
