public class Palindrom {
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
    public static int Size =1;

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

    public static boolean palindrom(){
        int[] arr=new int[Size];
        Node temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.data;
            temp=temp.next;
            i++;
        }
        boolean istrue=true;
        for(int j=0;j<arr.length/2;j++){
            int n=arr.length;
            if(arr[j]!=arr[n-1]){
                istrue=false;
            }
        }
        return istrue;
    }

    public static void main(String args[]){
            BasicLinkedList ll = new BasicLinkedList();
            print();
            addFirst(5);
            print();
            addFirst(10);
            print();
            addFirst(5);;
            print();
            System.out.println(Size);
            System.out.println(palindrom());;;
    }
    
}
