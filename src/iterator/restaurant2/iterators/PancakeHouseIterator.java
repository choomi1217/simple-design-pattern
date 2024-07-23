package iterator.restaurant2.iterators;


import iterator.restaurant2.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem> {

    private int position = 0;
    private final List<MenuItem> items;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported");
    }
}
