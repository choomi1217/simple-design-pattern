package iterator.restaurant.iterators;

import iterator.restaurant.Iterator;
import iterator.restaurant.menu.MenuItem;

public class DinerIterator implements Iterator {

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
}
