package inclassCoding.W5D3;

public class NodeList {
  Node head;

  public NodeList(Node head) {
    this.head = head;
  }

  public void add(Node node) {
    this.head.next = node; // fix bug
  }

  public void addFirst(Node node){

  }

  public void insert(int idx, Node node){

  }

  public void remove(Node node) {

  }

  public static void main(String[] args) {
    NodeList list = new NodeList(new Node(10));
    list.add(new Node(100));
    list.add(new Node(200));

  }
}
