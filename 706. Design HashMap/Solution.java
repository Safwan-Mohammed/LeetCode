class MyHashMap {
    int[] map;
    boolean[] flag;
    public MyHashMap() {
        map = new int[1000001];
        flag = new boolean[1000001];
    }
    
    public void put(int key, int value) {
        map[key] = value;
        flag[key] = true;
    }
    
    public int get(int key) {
        return !flag[key] ? -1 : map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}