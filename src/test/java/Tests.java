import org.junit.jupiter.api.Test;
import reallifeobject.Human;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SuppressWarnings(value = "all")
public class Tests {


    Human s1 = new Human("Pavel", 24, (short) 71, 172L);
    Human s2 = new Human("Pavel", 24, (short) 71, 172L);
    Human s3 = new Human("Andrei", 32, (short) 76, 165L);
    Human s4 = new Human("Sergiu", 18, (short) 92, 183L);

    @Test
    public void getValueFromHashMap() {
        Map<Human, String> humanMap = new HashMap<>();

        humanMap.put(s1, "Object 1");
        humanMap.put(s3, "Object 3");
        assertTrue(humanMap.containsKey(s2), "We can get with 3 object the entry value of object 1 ");
    }

    @Test
    public void ifTwoObjectAreIdentical() {


        assertEquals(s2, s1, "The object are identical");
        assertTrue(s1.hashCode() == s2.hashCode(), "Their hashCode is identical");
        


    }

    @Test
    public void ifTwoObjectAreNotIdentical() {


        assertFalse(s3.equals(s4), "The object are not identical");
        assertFalse(s3.hashCode() == s4.hashCode(), "Their hashCode is not identical");
      

    }

    @Test
    public void listContainsObject() {
        List<Human> humanList = new ArrayList<>();
        humanList.add(s1);
        humanList.add(s3);
        humanList.add(s4);

        assertTrue(humanList.contains(s2), "The list contains object with the same instance values");
    }

}
