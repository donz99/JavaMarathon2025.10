package day18;

public class Node {
    private int value;           // ключ узла
    private Node leftChild;          // Левый узел потомок
    private Node rightChild;             // Правый узел потомок

    public void printNode() {            // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение :" +value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
