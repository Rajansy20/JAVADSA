class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void addNodeAtBegin(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    void addNodeAtEnd(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }
        // The node which last part is null is the last node
        else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    void addNodeAtPosition(int data, int pos) {
        if(this.head==null){
            this.head=new Node(data);
            return;
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next!=null) {
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
        }

    }

    void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void resverse(Node node) {
        if (node == null) {
            return;
        }
        resverse(node.next);
        System.out.println(node.data);
    }

    int deleteAtBegin() {
        if (this.head == null) {
            return -1;
        } else {
            Node temp = head;
            int data = temp.data;
            head = head.next;
            temp.next = null;
            return data;
        }
    }

    int deleteAtEnd() {
        if (this.head == null) {
            return -1;
        } else {
            Node temp = head;
            Node tt = head;
            while (temp.next != null) {
                tt = temp;
                temp = temp.next;
            }
            int data = temp.data;
            tt.next = null;
            return data;
        }
    }

    int deleteAtPosition(int pos) {
        if (head == null) {
            return -1;
        } else {
            Node temp = head;

            int cnt = 0;
            while (temp.next != null) {
                cnt++;
                if (cnt == pos - 1) {
                    break;
                }
                temp = temp.next;
            }
            Node tt = temp.next;
            temp.next = tt.next;
            tt.next = null;
            return tt.data;
        }
    }

    int magingTwolist(LinkedList list1, LinkedList list2) {
        Node temp = list1.head;
        if (list1.head == null && list2.head == null) {
            return -1;
        } else if (list1.head.next == null) {
            return list1.head.data;
        } else if (list2.head.next == null) {
            return list2.head.data;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = list2.head;
            return 1;
        }
    }

    void modifyNodeAtBegin(int data) {
        if (this.head == null) {
            return;
        } else {
            this.head.data = data;
        }
    }

    void modifyNodeAtEnd(int data) {
        if (this.head == null) {
            return;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.data = data;
        }
    }

    void modifyAtAnyPosition(int data, int pos) {
        if(this.head == null){
            return;
        }
        else{
            Node temp=this.head;
            int cnt=0;
            while (temp.next!=null) {
                if(cnt==pos-1){
                    break;
                }
                temp=temp.next;
                cnt++;
            }
            temp.data=data;
        }
    }

    void modifyExistingWithNewKey(int oldKey, int newKey) {
        if(this.head==null){
            return;
        }
        else{
            Node temp=this.head;
            while (temp.next!=null) {
                if(temp.data==oldKey){
                    temp.data=newKey;
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Key not found");
        }
    }

    boolean search(int key){
        if(this.head==null){
            return false;
        }
        else{
            Node temp=this.head;
            while (temp.next!=null) {
                if(temp.data==key){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeAtBegin(10);
        list.addNodeAtBegin(20);
        // list.addNodeAtEnd(30);
        // list.addNodeAtEnd(40);
        // list.addNodeAtEnd(50);

        list.display();

        // System.out.println("Modify at Begin");
        // list.modifyNodeAtBegin(100);
        // list.display();

        // System.out.println("Modify at End");
        // list.modifyNodeAtEnd(2000);
        // list.display();

        // System.out.println("Modify At Any Position");
        // list.modifyAtAnyPosition(3000, 3);
        // list.display();

        // System.out.println("Modify Existing With New Key");
        // list.modifyExistingWithNewKey(90, 800);
        // list.display();

        // System.out.println("Search Element");
        // System.out.println(list.search(800));

        // LinkedList list2 = new LinkedList();
        // list2.addNodeAtBegin(100);
        // list2.addNodeAtBegin(200);
        // list2.addNodeAtEnd(300);
        // list2.addNodeAtEnd(400);

        // list2.display();
        // System.out.println("Merge");
        // list.magingTwolist(list, list2);

        // System.out.println("After Merging");
        // list.display();

        // System.out.println("Deleted Element is " + list.deleteAtBegin());
        // list.display();
        // System.out.println("Reverse");
        // list.resverse(list.head);
    }
}