import com.company.BinarySearchTree;
import com.company.Node;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTests
{
    @Test
    public void SearchTreeTest()
    {
        int testSearchVal = 2;

        BinarySearchTree tree = new BinarySearchTree(CreateTestData());

        Boolean hasValue = tree.Search(testSearchVal);

        Assert.assertTrue(hasValue);
    }



    private Node CreateTestData()
    {
        Node node = new Node(1,
                new Node(5, new Node(6, null,null), new Node(7, null, null)),
                new Node(2, new Node(3, null,null), new Node(4, null, null))
        );

        return node;
    }
}
