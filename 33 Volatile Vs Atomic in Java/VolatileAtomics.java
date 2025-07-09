
public class VolatileAtomics {
    private volatile int volatileCounter = 0;
    public void incrementVolatile() {
        volatileCounter++;
    }

    public void incrementAtomic() {
        // atomicCounter.incrementAndGet();
    }

    public int getVolatileCounter() {
        return volatileCounter;
    }

    public int getAtomicCounter() {
        // return atomicCounter.get();
         return volatileCounter;
    }
}
