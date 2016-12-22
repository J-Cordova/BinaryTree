package com.company;

import java.util.Stack;

public class Tree
{
    Node root = new Node("I Am Root", null, null);

    public Node getRoot()
    {
        return root;
    }

    public void setRoot(Node root)
    {
        this.root = root;
    }


    public Node CreateTestData()
    {
        Node node = new Node("1",
                            new Node("2", new Node("4", null,null), new Node("5", null, null)),
                            new Node("3", new Node("6", null,null), new Node("7", null, null)));

        return node;
    }


    public void RecursiveInorder(Node node)
    {
        if (node == null)
            return;

        RecursiveInorder(node.getLeftChild());
        System.out.println(node.getData().toString());
        RecursiveInorder(node.getRightChild());
    }

    public void RecursivePreorder(Node node)
    {
        if (node == null)
            return;
        System.out.println(node.getData().toString());
        RecursivePreorder(node.getLeftChild());
        RecursivePreorder(node.getRightChild());
    }

    public void RecursivePostorder(Node node)
    {
        if (node == null)
            return;
        RecursivePostorder(node.getLeftChild());
        RecursivePostorder(node.getRightChild());
        System.out.println(node.getData().toString());
    }

    public void IterativeInorder(Node node)
    {
        Stack<Node> s = new Stack<>();
        while ( !s.isEmpty() || node != null)
        if (node != null)
        {
            s.push(node);
            node = node.getLeftChild();// ? node.left
        }
        else
        {
            node = s.pop();//node?s.pop()
            System.out.println(node.getData().toString());//visit(node)
            node = node.getRightChild(); //node?node.right
        }
    }

    public void IterativePreorder(Node node)
    {
        //print
        //left
        //right

        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty() || node != null)
        {
            if(node == null)
            {
                node = stack.pop();
                node = node.getRightChild();
            }
            else
            {
                System.out.println(node.getData());
                stack.push(node);
                node = node.getLeftChild();
            }
        }

    }
    
    public void IterativePostorder(Node node)
    {
        Stack<Node> stack = new Stack<Node>();
        Node lastVisited = null;

        while(!stack.isEmpty() || node != null)
        {
            if (node != null)
            {
                node = node.getLeftChild();
            }
            else
            {
                Node check = stack.peek();

                if (check.getRightChild() != null && check.getRightChild() != lastVisited)
                {
                    node = check.getRightChild();
                }
                else
                {
                    lastVisited = stack.pop();
                    System.out.println(check.getData());
                }

            }

        }
    }

    public Object Search()
    {
        return null;
    }

    public void Insert(Node node)
    {

    }

    public void Delete(Node node)
    {

    }
}
