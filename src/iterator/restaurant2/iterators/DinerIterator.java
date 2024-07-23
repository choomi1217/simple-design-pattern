package iterator.restaurant2.iterators;

import iterator.restaurant2.menu.MenuItem;

import java.util.Iterator;

public class DinerIterator implements Iterator<MenuItem> {

    private final MenuItem[] items;
    private int position = 0;

    public DinerIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported");
    }
}
