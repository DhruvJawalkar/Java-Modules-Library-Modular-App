/*
module emailnotification {
    requires notificationservice;

    provides com.notificationservice.NotificationService with com.emailnotification.EmailNotification;
}
 */

module emailnotification{
    //exports com.emailnotification;
    requires notificationservice;
    provides com.notificationservice.NotificationService with com.emailnotification.EmailNotification;
}
