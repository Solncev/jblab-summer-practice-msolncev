package Iterator;

import java.util.NoSuchElementException;

/**
 * Created by Марат on 25.08.2016.
 */
public class RangeCollection {
    private int min;
    private int max;
    private int size;


    public RangeCollection(int min, int max) {
        this.min = min;
        this.max = max;
        size = max - min + 1;
    }

    public RangeCollection(int max) {
        this(0, max);
    }

    public RangeCollection() {
        this(0);
    }

    public String toString() {
        String s = "";
        for (int i = min; i <= max; i++) {
            s = s + i + " ";
        }
        return s;
    }

    public Iterator<Integer> iterator() {
        return new MyIterator();
    }


    public class MyIterator implements Iterator<Integer> {
        private int position = min;

        @Override
        public boolean hasNext() {
            if (position == size) {
                throw new NoSuchElementException("Elements in this collection not found");
            }
            return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return (position + 1);
            }
            return null;
        }
    }

}
