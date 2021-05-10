package Block5.Holiday;

import java.util.Comparator;

public class DestinationComparator implements Comparator<Holiday> {
    @Override
    public int compare(Holiday o1, Holiday o2) {
        return o1.getDestination().compareTo(o2.getDestination());
    }
}
