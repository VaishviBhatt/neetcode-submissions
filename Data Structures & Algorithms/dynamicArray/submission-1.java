class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[capacity];
    }

    public int get(int i) {
        if(i < 0){
            return -1;
        }
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;

    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        if (size == 0) {
            return -1; 
        }
        size--;
        return array[size];

    }

    private void resize() {
        capacity = capacity == 0 ? 1 : capacity * 2;
        array = Arrays.copyOf(array, capacity);

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
