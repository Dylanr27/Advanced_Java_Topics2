package DynamicArray;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if(count == items.length){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;

    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i < (count); i++) {
            items[i] = items[i + 1];
        }
        count--;

    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public int max(){
        int maximum = 0;
        for (int number: items) {
            if (number > maximum){
                maximum = number;
            }
        }
        return maximum;
    }

    public Array intersect(Array first, Array second){
        Array inCommon = new Array(1);
        for (int number1 :
                first.items) {
            for (int number2 :
                    second.items) {
                if (number1 == number2){
                    inCommon.insert(number1);
                    break;
                }
            }
        }
        return inCommon;
    }

    public void reverse(){

    }
}
