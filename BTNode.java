class BTNode<E> { //Definisi kelas dan generic type E 
    BTNode left, right; //Atribut
    E data;

    //Konstruktor 
    public BTNode() {
        left = null;
        right = null;
        data = null;
    }

    //Konstruktor dengan argumen
    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }

    //Setter untuk atribut left dan right
    public void setLeft(BTNode n) {
        left = n;
    }

    public void setRight(BTNode n) {
        right = n;
    }

    //Getter untuk atribut left dan right
    public BTNode getLeft() {
        return left;
    }

    public BTNode getRight() {
        return right;
    }

    //Setter dan getter untuk atribut data
    public void setData(E d) {
        data = d;
    }

    public E getData() {
        return data;
    }
}