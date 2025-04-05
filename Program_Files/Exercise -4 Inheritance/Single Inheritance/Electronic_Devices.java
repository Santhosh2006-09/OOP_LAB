  import java.util.ArrayList;
  import java.util.Date;
  
  class Device {
      protected String model;
      protected String manufacturer;
      protected String serialNumber;
      protected Date productionDate;
      protected boolean isPoweredOn;
      protected ArrayList<String> operationLog;
      
      public Device(String model, String manufacturer, String serialNumber, Date productionDate) {
          this.model = model;
          this.manufacturer = manufacturer;
          this.serialNumber = serialNumber;
          this.productionDate = productionDate;
          this.isPoweredOn = false;
          this.operationLog = new ArrayList<>();
          logOperation("Device manufactured");
      }
      
      protected void logOperation(String operation) {
          String logEntry = new Date() + " - " + operation;
          operationLog.add(logEntry);
      }
      
      public void powerOn() {
          if (!isPoweredOn) {
              isPoweredOn = true;
              logOperation("Device powered on");
              System.out.println(model + " powered on");
          } else {
              System.out.println(model + " is already on");
          }
      }
      
      public void powerOff() {
          if (isPoweredOn) {
              isPoweredOn = false;
              logOperation("Device powered off");
              System.out.println(model + " powered off");
          } else {
              System.out.println(model + " is already off");
          }
      }
      
      public void displayDeviceInfo() {
          System.out.println("\n=== Device Information ===");
          System.out.println("Model: " + model);
          System.out.println("Manufacturer: " + manufacturer);
          System.out.println("Serial: " + serialNumber);
          System.out.println("Production Date: " + productionDate);
          System.out.println("Status: " + (isPoweredOn ? "ON" : "OFF"));
      }
      
      public void showOperationHistory() {
          System.out.println("\nOperation History for " + model + ":");
          for (String log : operationLog) {
              System.out.println("- " + log);
          }
      }
  }
  
  class Smartphone extends Device {
      private String osVersion;
      private String imei;
      private boolean isLocked;
      private ArrayList<String> installedApps;
      
      public Smartphone(String model, String manufacturer, String serialNumber, 
                      Date productionDate, String osVersion, String imei) {
          super(model, manufacturer, serialNumber, productionDate);
          this.osVersion = osVersion;
          this.imei = imei;
          this.isLocked = true;
          this.installedApps = new ArrayList<>();
          logOperation("Smartphone initialized");
      }
      
      public void unlock(String method) {
          if (isPoweredOn) {
              isLocked = false;
              logOperation("Unlocked via " + method);
              System.out.println(model + " unlocked via " + method);
          } else {
              System.out.println("Cannot unlock - device is powered off");
          }
      }
      
      public void lock() {
          isLocked = true;
          logOperation("Device locked");
          System.out.println(model + " locked");
      }
      
      public void installApp(String appName) {
          if (isPoweredOn) {
              installedApps.add(appName);
              logOperation("App installed: " + appName);
              System.out.println(appName + " installed successfully");
          } else {
              System.out.println("Cannot install app - device is powered off");
          }
      }
      
      public void uninstallApp(String appName) {
          if (installedApps.remove(appName)) {
              logOperation("App uninstalled: " + appName);
              System.out.println(appName + " uninstalled successfully");
          } else {
              System.out.println(appName + " not found in installed apps");
          }
      }
      
      public void listInstalledApps() {
          System.out.println("\nInstalled Apps on " + model + ":");
          if (installedApps.isEmpty()) {
              System.out.println("No apps installed");
          } else {
              for (String app : installedApps) {
                  System.out.println("- " + app);
              }
          }
      }
      
      public void makeCall(String number) {
          if (isPoweredOn && !isLocked) {
              logOperation("Call made to: " + number);
              System.out.println("Calling " + number + "...");
          } else if (!isPoweredOn) {
              System.out.println("Cannot make call - device is powered off");
          } else {
              System.out.println("Cannot make call - device is locked");
          }
      }
      
      @Override
      public void displayDeviceInfo() {
          super.displayDeviceInfo();
          System.out.println("Type: Smartphone");
          System.out.println("OS Version: " + osVersion);
          System.out.println("IMEI: " + imei);
          System.out.println("Lock Status: " + (isLocked ? "LOCKED" : "UNLOCKED"));
          System.out.println("Installed Apps: " + installedApps.size());
      }
  }
  
  public class Electronic_Devices {
      public static void main(String[] args) {
          Smartphone phone = new Smartphone("Galaxy S23", "Samsung", "SN123456", 
                                         new Date(), "Android 13", "IMEI123456789");
          
          phone.displayDeviceInfo();
          phone.powerOn();
          phone.unlock("fingerprint");
          phone.installApp("WhatsApp");
          phone.installApp("Google Maps");
          phone.makeCall("1234567890");
          phone.listInstalledApps();
          phone.uninstallApp("Google Maps");
          phone.lock();
          phone.powerOff();
          phone.showOperationHistory();
      }
  }
