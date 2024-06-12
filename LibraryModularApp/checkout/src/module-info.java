/*
module checkout {
    requires inventory;
    requires notificationservice;

    exports com.checkout;

    uses com.notificationservice.NotificationService;
}
 */

module checkout{
    requires inventory;
    requires notificationservice;
    uses com.notificationservice.NotificationService;

    exports com.checkout;
}