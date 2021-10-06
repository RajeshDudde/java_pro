import java.util.*;

public class NaryTree
{
    private Node root;

    static public class Node
    {
        private List<Node> children;
        private int value;

        public Node(List<Node> children, int value)
        {
            this.children = children;
            this.value = value;
        }

        public void add(Node n)
        {
            if (children == null) children = new ArrayList<>();
            children.add(n);
        }
    }

    public void add(int ... intArray) // throws RootsNotEquals
    {
        if (root == null) root = new Node(null, intArray[0]);
        // if (root.value != intArray[0]) { // throw new RootsNotEquals(); }
      //  else
       // {
            if (intArray.length >= 1) 
            { 
                intArray = Arrays.copyOfRange(intArray, 1, intArray.length);
             }
            add(root, intArray);
        //}
    }

    public static void add(Node tempRoot, int ...intArray)
    {
        boolean present = false;
        int index = -1;

        for (int i = 0; i < intArray.length; i++)
        {
            if (tempRoot.children != null)
            {
                for (int j = 0; j < tempRoot.children.size()-1; j++)
                {
                    if (tempRoot.children.get(j).value == intArray[0]) present = true;
                }
            }
            if (!present) { tempRoot.add(new Node(null, intArray[0])); }
            for (Node f : tempRoot.children)
            {
                index++;
                if (f.value == intArray[0])
                {
                    if (index <= tempRoot.children.size()-1) tempRoot = tempRoot.children.get(index);
                    if (intArray.length >= 1) intArray = Arrays.copyOfRange(intArray, 1, intArray.length);
                    add(tempRoot, intArray);
                    break;
                }
            }
            break;
        }
    }

    public void remove(int r) //throws NodeNotFound
    {
        if (!contains(r))  //throw new NodeNotFound();
        if (root.value == r)
        {
            for (int i = 1; i < root.children.size(); i++)
            {
                root.children.get(0).children.add(root.children.get(i));
            }
            root = root.children.get(0);
        }
        else { remove(root, r); }
    }

    public void remove(Node tempRoot, int r)
    {
        if (tempRoot.children != null)
        {
            for (int i = 0; i < tempRoot.children.size(); i++)
            {
                if (tempRoot.children.get(i).value == r)
                {
                    for (Node n : tempRoot.children.get(i).children) tempRoot.children.add(n);
                    tempRoot.children.remove(i);
                }
                else
                {
                    tempRoot = tempRoot.children.get(i);
                    remove(tempRoot, r);
                    break;
                }
            }
        }
    }

    public boolean contains(int val) { return contains(root, val); }

    private boolean contains(Node n, int val)
    {
        boolean found = false;
        if (n == null) return found;
        if (n.value == val) found = true;
        else if (n.children != null) for (Node f : n.children) { return contains(f, val); }
        return found;
    }

    public void print()
    {
        System.out.println("The root is "+root.value+".");
        for (Node n : root.children)
        {
            System.out.println(n.value+" is a child of the root.");
            printChildren(n);
        }
    }

    public void printChildren(Node n)
    {
        if (n.children != null)
        {
            for (Node child : n.children)
            {
                System.out.println("Node "+n.value+" has node "+child.value+" as a child.");
                printChildren(child);
            }
        }
    }

    public static void main(String[] args) //throws RootsNotEquals, NodeNotFound
    {
        NaryTree poplar = new NaryTree();

        poplar.add( new int[] { 1, 2, 5 });
        poplar.add( new int[] { 1, 4, 0, 0 } );
        poplar.add( new int[] { 1, 3, 6 });
        poplar.add( new int[] { 1, 2, 7 });
        poplar.print();
    }
}