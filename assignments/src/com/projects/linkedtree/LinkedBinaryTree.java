
import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E>{

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Iterable<Position<E>> position() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    protected static class Node<E> implements Position<E>
    {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;
        
        public Node(E e, Node<E> parent, Node<E> left, Node<E> right)
        {
            this.element = e;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
        
        //accessors
        public E getElement()
        {
            return this.element;
        }
        public Node<E> getParent()
        {
            return this.parent;
        }
        public Node<E> getLeft()
        {
            return this.left;
        }
        public Node<E> getRight()
        {
            return this.right;
        }
        
        // setters
        public void setElement(E e)
        {
            this.element = e;
        }
        public void setParent(Node<E> p)
        {
            this.parent = p;
        }
        public void setLeft(Node<E> l)
        {
            this.left = l;
        }
        public void setRight(Node<E> r)
        {
            this.right = r;
        }
    }
    
    protected Node<E> createNode(E e, Node<E> p, Node<E> l,Node<E> r)
    {
        return new Node<E>(e,p,l,r);
    }
    
    protected Node<E> root = null;
    private int size = 0;
    
    public LinkedBinaryTree(){}
    
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException
    {
        if ( !(p instanceof Node))
            throw new IllegalArgumentException();
        Node<E> node = (Node<E>) p;
        if (node.getParent() == node)
            throw new IllegalArgumentException();
        return node;
    }
    
    public int size()
    {
        return size;
    }
    
    public Position<E> root()
    {
        return this.root;
    }
    
    public Position<E> parent(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return node.getParent();
    }
    
    public Position<E> left(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return node.getLeft();
    }
    
    public Position<E> right(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return node.getRight();
    }
    
    public Position<E> addRoot(E e) throws IllegalStateException
    {
        if (!isEmpty())
            throw new IllegalStateException("Tree is not empty");
        
        root = createNode(e,null,null,null);
        size = 1;
        return root;
    }
    
    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException
    {
        Node<E> parent = validate(p);
        if (parent.getLeft() !=null)
            throw new IllegalArgumentException();
        
        Node<E> child = createNode(e,parent,null,null);
        parent.setLeft(child);
        size++;
        return child;
    }
    
    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException
    {
        Node<E> parent = validate(p);
        if (parent.getRight() != null)
            throw new IllegalArgumentException();
        
        Node<E> child = createNode(e,parent,null,null);
        parent.setRight(child);
        size++;
        return child;
    }
    
    public E set(Position<E> p , E e) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }
    
    public void attach(Position<E> p, LinkedBinaryTree<E> t1, 
                                      LinkedBinaryTree<E> t2) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        if (isInternal(p))
            throw new IllegalArgumentException("p must be a leaf");
        
        size += t1.size() + t2.size();
        
        if (!t1.isEmpty())
        {
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root = null;
            t1.size = 0;
        }
        
        if (!t2.isEmpty())
        {
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root = null;
            t2.size = 0;
        }
    }
    
    
}
