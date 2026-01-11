class MovingAverage {
    int size, sum = 0, count = 0;
    Deque<Integer> queue = new ArrayDeque<>();
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        count++;

        int tail = count > size ? queue.poll() : 0;
        queue.add(val);
        sum = sum - tail + val;
        return (sum * 1.0) / Math.min(count, size);
    }
}