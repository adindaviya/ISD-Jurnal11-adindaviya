class BinaryTree<E> { //Definisi kelas dan generic type E
    private BTNode root; //Atribut

    //Konstruktor
    public BinaryTree() {
        root = null;
    }

    //Metode isEmpaty() untuk mengembalikan nilai boolean(true atau false)
    public boolean isEmpty() {
        return root == null;        
    }

    //Menambahkan node baru
    public void insert(E data) {        
        root = insert(root, data);      
    }

    //Melakukan proses penambahan node baru secara rekursif
    private BTNode insert(BTNode node, E data) {       
        if (node == null) {                             
            node = new BTNode(data);                    
        }
        else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    //Menghitung jumlah node yang ada dalam binnary tree
    public int countNodes() {
        return countNodes(root);
    }

    //Metode rekursif yang menghitung jumlah node dalam subtree
    private int countNodes(BTNode r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    //Untuk mencari nilai “val” dalam binary tree
    public boolean search(E val) {
        return search(root, val);
    }

    //Metode rekursif mencaro nilai tertentu dalam binnary tree, dimulai dari node yang diberikan
    private boolean search(BTNode r, E val) {
        if (r.getData() == val) {
            return true;
        }
        if (r.getLeft() != null)  {
            if (search(r.getLeft(), val)) {
                return true;
            }
        }
        if (r.getRight() != null) {
            if (search(r.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

    //Melakukan tranversal inorder pada binary tree
    public void inorder() {             
        inorder(root);                  
    }

    //Metode rekursif digunakan untuk melakukan traversal inorder pada subtree 
    private void inorder(BTNode r) {                    
        if (r != null) {                                
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    //Melakukan tranversal preorder pada binary tree
    public void preorder() {
        preorder(root);
    }

    //Metode rekursif yang akan melakukan traversal preorder pada subtree 
    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    //Melakukan tranversal postorder pada binary tree
    public void postorder() {
        postorder(root);
    }

    //Metode rekursif yang akan melakukan traversal postorder pada subtree 
    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}