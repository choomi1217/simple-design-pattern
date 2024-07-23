package iterator.restaurant;

import iterator.restaurant.menu.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
