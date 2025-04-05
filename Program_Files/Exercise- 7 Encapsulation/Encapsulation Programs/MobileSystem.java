class MobilePhone {
    private String brand;
    private int batteryLevel;
    private boolean isOn;

    public MobilePhone(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.isOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPhoneOn() {
        return isOn;
    }

    public void powerOn() {
        if (!isOn && batteryLevel > 0) {
            isOn = true;
            System.out.println(brand + " phone is now ON.");
        } else if (batteryLevel == 0) {
            System.out.println("Battery is dead. Please charge your phone.");
        } else {
            System.out.println("Phone is already ON.");
        }
    }

    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " phone is now OFF.");
        } else {
            System.out.println("Phone is already OFF.");
        }
    }
}

public class MobileSystem {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", 80);

        System.out.println("Phone Brand: " + phone.getBrand());
        System.out.println("Battery Level: " + phone.getBatteryLevel() + "%");
        System.out.println("Phone Status: " + (phone.isPhoneOn() ? "ON" : "OFF"));

        phone.powerOn();
 
        phone.powerOff();
    }
}
