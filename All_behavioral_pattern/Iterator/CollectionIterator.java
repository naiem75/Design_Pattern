import java.util.List;

public class Collection<T> {
    private List<T> elements;

    public Collection(List<T> elements) {
        this.elements = elements;
    }

    public Iterator<T> createIterator() {
        return new CollectionIterator();
    }

    private class CollectionIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public T next() {
            if (hasNext()) {
                T element = elements.get(index);
                index++;
                return element;
            }
            return null; // or throw an exception
        }
    }
}
