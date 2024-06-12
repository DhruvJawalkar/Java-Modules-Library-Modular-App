/*
module inventory {
    requires transitive bookapi;

    exports com.inventory;
    opens com.inventory to reports;
}
 */

module inventory {
    requires transitive bookapi;
    opens com.inventory to reports;
    exports com.inventory;
}