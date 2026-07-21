package Types.TreeStruct;

import java.util.ArrayList;

public class Node {
    String name;
    boolean isRoot = false;

    Node parent;

    ArrayList<Node> nodes = new ArrayList<>();

    Node() {}

    Node(String name){
        this.name = name;
    }

    Node(String name, boolean isRoot) {
        this.name = name;
        this.isRoot = isRoot;
    }

    public void AddNode(Node node) {
        nodes.add(node);
        node.parent = this;
    }

    public void RemoveNode(String nodeName) {
        nodes.forEach(node -> {
            if(node.name == nodeName) {
                nodes.remove(node);
                node.parent = null;
            }
        });
    }

    public Node GetParent() {
        return this.parent;
    }

    public void ListNodes() {
        nodes.forEach(node -> {
            System.out.println(node.name);
        });
    }
}
