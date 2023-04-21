import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ItemTest {
    Item item ;
    @Before
    public void setup(){
        item = new Item("Orange Juice", "3.55", "Food", "4/20/2023");
    }

    @Test
    public void getName() {
        String expected = "Orange Juice";
        String actual = item.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        item.setName("Avocado");

        String expected = "Avocado";
        String actual = item.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPrice() {
        String expected = "3.55";
        String actual = item.getPrice();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPrice() {
        item.setPrice("2.99");

        String expected = "2.99";
        String actual = item.getPrice();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getType() {
        String expected = "Food";
        String actual = item.getType();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setType() {
        item.setType("Tools");

        String expected = "Tools";
        String actual = item.getType();

        Assert.assertEquals(expected , actual);
    }

    @Test
    public void getExpiration() {
        String expected = "4/20/2023";
        String actual = item.getExpiration();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExpiration() {
        item.setExpiration("4/19/2023");

        String expected = "4/19/2023";
        String actual = item.getExpiration();

        Assert.assertEquals(expected,actual);
    }
}