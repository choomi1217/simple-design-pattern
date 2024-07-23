package iterator.restaurant.iterators;

import iterator.restaurant.Iterator;
import iterator.restaurant.menu.MenuItem;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

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
}
