import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCollection = new HashSet<>();

        if (!collections.isEmpty()) {
            commonCollection.addAll(collections.getFirst());
            collections.forEach(commonCollection::retainAll);
        }

        return commonCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCollection = new HashSet<>();

        collections.forEach(allCollection::addAll);

        return allCollection;
    }
}
