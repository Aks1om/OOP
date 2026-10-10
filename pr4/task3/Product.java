package pr4.task3;

public enum Product {
    BOOK(Catalog.BOOKS), PHONE(Catalog.ELECTRONICS), T_SHIRT(Catalog.CLOTHES);

    private final Catalog catalog;

    Product(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }
}
