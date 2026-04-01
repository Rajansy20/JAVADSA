public class hero {  
    int arr[];
    int size;
    int ids;

    hero(int size){
        this.size = size;
        this.arr = new int[size];
        this.ids = -1;
    }

    void addlast(int data){
        if(ids == size - 1){
            System.out.println("No space available");                 
        }
        else{
            ids++;
            arr[ids] = data;
        }
    }

    void display(){
        if(ids == -1){
            System.out.println("Nothing");
        }
        else{
            for(int i = 0; i <= ids; i++){
                System.out.println(arr[i]);
            }
        }
    }

    void searchindex(int key){
        if(ids == -1){
            System.out.println("Array is empty");
        }
        else{
            boolean found = false;
            for(int i = 0; i <= ids; i++){
                if(arr[i] == key){
                    System.out.println("Index: " + i);
                    found = true;
                }
            }
            if(!found){
                System.out.println("Element not found");
            }
        }
    }

    void searchelement(int key){
        boolean chck = false;

        if(ids == -1){
            System.out.println("Array is empty");
        }
        else{
            for(int i = 0; i <= ids; i++){
                if(arr[i] == key){
                    chck = true;
                }
            }

            if(chck){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
        }
    }

    void deleteatend(){
        if(ids == -1){
            System.out.println("Array is empty");
        }
        else{
            ids--;
        }
    }

    public static void main(String[] args){
    hero obj = new hero(5);

        obj.addlast(56);
        obj.addlast(45);
        obj.addlast(88);
        obj.addlast(6);
        obj.addlast(86);

        obj.display();

        System.out.println("--------------------------");

        obj.deleteatend();
        obj.display();

        System.out.println("--------------------------");

        obj.searchindex(45);
        obj.searchelement(100);
    }
}
