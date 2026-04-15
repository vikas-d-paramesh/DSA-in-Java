public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int Size=1;

    public static void addFirst(int data){ //O(1)

        Node newnode= new Node(data);
        if(head==null){
         head=tail=newnode;
         return;
        }
        Size++;

        newnode.next=head;
        head=newnode;

    }

    public static void addLast(int data){//O(1)

        Node newnode= new Node(data);
        if(head==null){
         head=tail=newnode;
         return;
        }
        Size++;
        tail.next=newnode;
        tail=newnode;

    }

    public static void print(){ //O(n)
        Node temp=head;
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Size++;
        Node newnode=new Node(10);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public static int size(){
        Node temp=head;
        int size=0;
        if(head==null){
            return 0;
        }
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;

    }

    
    public static void removeFirst(){
        if(Size==0){
            System.out.println("No data");
            return;
        }
        else if(Size==1){
            head=tail=null;
            Size--;
            return;
        }
        Node temp=head;
        head=head.next;
        Size--;
        temp.next=null;
    }

//     public int removeFirst() { better version

//     if(size == 0) {
//         System.out.println("LL is empty");
//         return Integer.MIN_VALUE;
//     }

//     else if(size == 1) {
//         int val = head.data;
//         head = tail = null;
//         size--;
//         return val;
//     }

//     int val = head.data;
//     head = head.next;
//     size--;

//     return val;
// }

 public static void removeLast(){
        if(Size==0){
            System.out.println("No data");
            return;
        }
        else if(Size==1){
            head=tail=null;
            Size--;
            return;
        }
        Node temp=head;
        int i=0;
        int n=Size;
        while(i<n-2){
            temp=temp.next;
            i++;
        }
        tail=temp;
        temp=temp.next;
        tail.next=null;
       
        Size--;
        
    }

    public static int search(int key){
        Node temp=head;
        for(int i=1;i<=Size;i++){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public static int searchRecersion(Node temp,int key,int index){
        if(temp.data==key){
            return index;
        }
        else if(temp.next==null){
            return -1;
        }
        return searchRecersion(temp.next,key,index+1);
        
    }

    public static void main(String args[]){
            LinkedList ll = new LinkedList();
            print();
            addFirst(5);
            print();
            addFirst(10);
            print();
            addLast(6);
            print();
            addMiddle(0, 10);
            print();
            System.out.println(Size);
            removeFirst();
            print();;
            System.out.println(Size);;;
            removeLast();
            print();
            System.out.println(Size);;;
            System.out.println(search(1));
            Node temp=head;
            System.out.println(searchRecersion(temp,1,0));
    }
}
