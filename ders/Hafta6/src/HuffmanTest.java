public class HuffmanTest {
    public static void main(String[] args) {
        HuffmanNode n1=new HuffmanNode('a',40,null,null);
        HuffmanNode n2=new HuffmanNode('b',35,null,null);
        HuffmanNode n3=new HuffmanNode('c',20,null,null);
        HuffmanNode n4=new HuffmanNode('d',5,null,null);

        HuffmanNode[] ha={n1, n2, n3, n4};

        HufmanTree tree=new HufmanTree();
        tree.addAll(ha);
        tree.print();
    }
}
