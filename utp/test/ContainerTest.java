import main.java.eu.glowacki.utp.assignment01.*;
import main.java.eu.glowacki.utp.assignment01.sample.Text;
import org.junit.Assert;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.List;

class ContainerTest {
    List<House> container3 = Arrays.asList(new House(2022), new House(2015),new House(2000));
    List<Chocolate> container4 = Arrays.asList(new Chocolate(), new Chocolate("B"),new Chocolate("C"));
    public Container<House, Integer> container= new Container<>(container3);
    public Container<Chocolate, Integer> container2= new Container<>(container4);
    private static int counter = 0;

    @BeforeAll
    public static void beforeTest() {
        System.out.println("Before Container Tests Compilation...");
    }

    @BeforeEach
    public void before() {
        System.out.println(1 + counter++ + ". Compilation");

        container.elements().add(new House("Villa", 2022));
        container.elements().add(new House("Flat", 2015));
        container.elements().add(new House("Studio", 2000));
        container.elements().add(new House("Room", 2012));

        container2.adds(new Chocolate("Bitter", 2200));
        container2.adds(new Chocolate("Milk", 1890));

    }

    @Test
    public void testAggregateAll() {
        System.out.println("TEST : testAggregateAll");
        Integer checker = container.aggregateAllElements();
        Assert.assertEquals((Integer) 2000, checker);
    }

    @Test
    public void testCloneElementAtIndex() {
        System.out.println("TEST : testCloneElementAtIndex");

        House cloneHouse = container.cloneElementAtIndex(0);
        Assert.assertEquals(cloneHouse.getRealestate(), container.get(0).getRealestate());
        Assert.assertNotEquals(cloneHouse, container.get(1));

    }

    @Test
    public void testElementsAdds() {

        System.out.println("TEST : testElementsAdds");
        List<Chocolate> list = new ArrayList<>();
        list.add(new Chocolate("Bitter", 2200));
        list.add(new Chocolate("Milk", 1890));

        Assert.assertEquals(list.get(1).getChoco(), container2.elements().get(1).getChoco());

    }

    @AfterEach
    public void after() {
        System.out.println("Successful Compilation :) \n");
    }

    @AfterAll
    public static void afterTest() {
        System.out.println("After Tests Compilation...");
    }


}
