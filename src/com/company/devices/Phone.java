package com.company.devices;
import com.company.Application;
import com.company.Human;
import com.company.Sellable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Phone extends Device implements Sellable {

    private static final String DEAFAULT_APP_VERSION = "latest";
    private static final String DEAFUALT_APP_SERVER = "www.app.com";
    private static final String DEAFUALT_APP_PROTOCOL ="https" ;
    private static final int DEAFAULT_APP_PORT = 433 ;
    public String operationSystem;
    public Double screenSize;

    static final public String servAdd = "www.javaApp.com";
    static final public String protocol = "https";
    static final public String version = "1.01.01";



    String getOSVersion() {
        return "5.32.1";
    }

    public Set<Application> appSet;



    public String toString() {
        return producer + " " + model + " " + operationSystem + " " + screenSize + " " + yearOfProduction;
    }

    public void turnOn() {
        System.out.println("It's working!!!");
    }

    public void installAnnApp(String appName){
        this.installAnnApp(appName,DEAFAULT_APP_VERSION);

    }
    public void installAnnApp(String appName,String appVersion){
        this.installAnnApp(appName,appVersion,DEAFUALT_APP_SERVER);

    }
    public void installAnnApp(String appName,String appVersion,String appUrl){
        URL url = null;
        try {
            url = new URL(DEAFUALT_APP_PROTOCOL,appUrl,DEAFAULT_APP_PORT,appName + "-" + appVersion);
            this.installAnnApp(appUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    public void installAnnApp(List<String> appList){
        for(String appName:appList){;
            installAnnApp(appName);
        }

    }
    public void installAnnApp(Url url){
        System.out.println("Sprawdzanie miejsca na dysku");
        System.out.println("Sprawdzanie ustawień ochrony rodzicielskiej");
        System.out.println("Sprawdzanie stanu konta");
        System.out.println("Obsługa płatności");
        System.out.println("Potwierdzenie płatności");
        System.out.println("Pobieranie aplikacji");
        System.out.println("Rozpakowanie aplikacji");
        System.out.println("Instalacja");
        System.out.println("Obsługa błędów");
        System.out.println("Zainstalowane aplikacje ");


    }




    public void installApp(Human buyer,Application app){
       if(buyer.getCash() >= app.getPrize()){
            System.out.println("Możesz kupić aplikacje.");
            appSet.add(app);
           buyer.setCash(buyer.getCash() - app.getPrize());

        }else{
            System.out.println("nie możesz kupić aplikacji.");

        }


    }
    public boolean isInstall(Application app){
        if(appSet.contains(app)){
            return true;

        }else{
            return false;
        }
    }
    public boolean isInstallByName(Application app, String name){
        if(appSet.contains(app.getName()))
        {
            return true;

        }else{
            return false;
        }


    }
    public void displayFreeApp(Application app,Double prize){
        for (Application a : appSet) {
            if (app.getPrize() == null) {
                System.out.print(app.getName() + " ,");
            }

            }
    }
    public double allAppsValue(){
        double value = 0;
        for (Application app : appSet) {
            if (app != null) {
                value += app.getPrize();
            }

        }
        return value;
    }
    public void freAppsList(){
        for (Application app:appSet) {
            if(app.getPrize()== 0 || app.getPrize() == null)
                System.out.println(app.getName());

        }
    }



    @Override
    public void sell(Human seller, Human buyer, double prize) {
        if (seller.getMobilePhone() != null) {
            System.out.println("Mam telefon do sprzedania!");
        } else {
            System.out.println("Nie mam telefonu do sprzedania.");
        }
    }

}







