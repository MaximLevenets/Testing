import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestMySortArray extends TestCase {


    boolean check = false;
    SortedArray sortedArray = new SortedArray();


    @Test
    public void testCreateArray() throws Exception{
        int count = 0;
        for (int i =0; i<sortedArray.createArray().length; i++){
            int tmp = sortedArray.createArray()[i];
            if (tmp==0) {
                count++;
            }
        }
        if (count!=sortedArray.createArray().length){
            check = true;
        }
        Assert.assertTrue(check);
    }
        @Test
        public void testSortedArray() throws Exception{

        for (int i = 0; i < sortedArray.sort().length - 1; i++) {
            if (sortedArray.sort()[i] < sortedArray.sort()[i + 1]){
                check = true;
            }
            Assert.assertTrue(check);
        }

    }

}
