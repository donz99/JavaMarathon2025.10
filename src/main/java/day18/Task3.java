package day18;

public class Task3 {
    public static void main(String[] args) {
        Node node1= new Node();
        node1.setValue(20);
        insertNode(14, node1);
        insertNode(23, node1);
        insertNode(22, node1);
        insertNode(27, node1);
        insertNode(24, node1);
        insertNode(150, node1);
        insertNode(11, node1);
        insertNode(5, node1);
        insertNode(8, node1);
        insertNode(16, node1);
        insertNode(15, node1);
        insertNode(18, node1);
        dfs(node1);
    }

    public static void insertNode (int value, Node rootNode) {
        Node newNode = new Node();
        newNode.setValue(value);

        if (rootNode == null) {rootNode = newNode;}
        else {Node currentNode = rootNode;
            Node parentNode;
            while (true){parentNode=currentNode;
                if (value == currentNode.getValue()){return;}
                else if (value < currentNode.getValue()){
                    currentNode = currentNode.getLeftChild();
                    if (currentNode==null){
                        parentNode.setLeftChild(newNode);
                        return;}
                }
                else {
                    currentNode=currentNode.getRightChild();
                    if (currentNode==null){
                        parentNode.setRightChild(newNode);
                        return;}}}}}

    public static void dfs (Node rootNode){
        if (rootNode== null) return;
        dfs(rootNode.getLeftChild());
        System.out.println(rootNode.getValue());
        dfs(rootNode.getRightChild());
    }

}