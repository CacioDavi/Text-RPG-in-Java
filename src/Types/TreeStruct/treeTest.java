package Types.TreeStruct;

public class treeTest {
    Node map      = new Node("Mapa", true);
    Node Reino    = new Node("Reino");
    Node Cidade   = new Node("Cidade");
    Node Vilarejo = new Node("Vilarejo");
    Node Casa     = new Node("Casa");

    public void main() {
        map.AddNode(Reino);
        Reino.AddNode(Cidade);
        Cidade.AddNode(Vilarejo);
        Vilarejo.AddNode(Casa);

        Vilarejo.ListNodes();
    }
}
