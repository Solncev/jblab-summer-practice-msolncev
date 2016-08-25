package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Марат on 25.08.2016.
 */
public class RangeCollection {
    private int min;
    private int max;
    private List<Integer> list = new ArrayList<Integer>();

    public RangeCollection(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public RangeCollection(int max) {
        this(0, max);
    }

    public void add(int x) {
        list.add(x);
    }

    public void remove(int position) {
        list.remove(position);
    }

    public String toString() {
        String s = "";
        for (int x : list) {
            s = s + x + " ";
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
            if (list.isEmpty()) {
                throw new NoSuchElementException("Elements in this collection not found");
            }
            return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                int x;
                if (position > list.size()) {

                    throw new NoSuchElementException("no such element in (" + min + ", " + max + ")");
                } else if (position == list.size()) {
                    position = min;
                    x = list.get(position);
                } else if (position == max) {
                    x = list.get(position);
                    position = min;
                } else {
                    x = list.get(position);
                    position++;
                }
                return x;
            }
            return null;
        }

        @Override
        public void remove() {
            if (position >= list.size()) {
                position = min;
            }
            list.remove(position);
        }
    }

}
