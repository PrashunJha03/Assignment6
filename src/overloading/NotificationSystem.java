package overloading;

interface Notification
{
	void sendNotification(String message);
	void showStatus();
}

class EmailNotification implements Notification
{
	String emailId;
	String subject;
	
	@Override
	public void sendNotification(String message)
	{
		System.out.println("EMail   : "+emailId );
		System.out.println("Subject : "+subject);
		System.out.println("Message sent through Email");
	}
	
	@Override
	public void showStatus()
	{
		System.out.println("Status : Email Delivered ");
	}
}


class SMSNotification implements Notification
{
	String mobileNumber;
	String provider;
	
	@Override
	public void sendNotification(String message)
	{
		System.out.println("Mobile Number    : "+mobileNumber);
		System.out.println("Network Provider : "+provider);
		System.out.println("Message sent through SMS ");
	}
	
	@Override
	public void showStatus()
	{
		System.out.println("Status : SMS Delivered ");
	}
}

class PushNotification implements Notification
{
	int deviceId;
	String appName;
	
	@Override
	public void sendNotification(String message)
	{
		System.out.println("Device ID : "+deviceId);
		System.out.println("App Name  : "+appName);
		System.out.println("Message sent through Push Notification ");
	}
	
	@Override
	public void showStatus()
	{
		System.out.println("Status : Push Notification Delivered ");
	}
}

public class NotificationSystem {
	public static void main(String[] args) {
		
		EmailNotification e = new EmailNotification();
		e.emailId = "prashun0@email";
		e.subject = "Notification";
		System.out.println("---------Email Notification--------");
		e.sendNotification("You got a new notification");
		e.showStatus();
		
		SMSNotification s = new SMSNotification();
		s.mobileNumber = "9876543210";
		s.provider= "JIO";
		System.out.println("\n---------SMS Notification--------");
		s.sendNotification("You got a new SMS");
		s.showStatus();
		
		PushNotification p = new PushNotification();
		p.deviceId = 4567;
		p.appName = "Zepto";
		System.out.println("\n---------Push Notification--------");
		p.sendNotification("You got a new Push notification");
		p.showStatus();
	}
}
