import java.util.PriorityQueue;

public class HufmanTree {
    public HuffmanNode root;
    public void addAll(HuffmanNode[] dizi){
        PriorityQueue<HuffmanNode> pq=new PriorityQueue<>();
        for(HuffmanNode node:dizi)
            pq.add(node);
        while (pq.size()>1){
            HuffmanNode n1=pq.poll();
            HuffmanNode n2=pq.poll();
            HuffmanNode newNode=new HuffmanNode(null,n1.frequency+n2.frequency,n1,n2);
            pq.add(newNode);
        }
        root=pq.poll();//Son kalan eleman ağacın kökünü verir.
    }

    public void print(){
        System.out.println(print(root, 3));
    }

    private String print(HuffmanNode node, int space){
        if(node==null)
            return "";
        String r="";
        space+=10;
        r+=print(node.right, space);
        r+="\n";
        for (int i = 10; i < space; i++)
            r+=" ";
        if(node.value!=null)
            r+=node.value;
        else r+="*";
        r+=":"+node.frequency;
        r+=print(node.left, space);
        return r;
    }
}
