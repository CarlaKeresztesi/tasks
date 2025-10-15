package com.ck.tasks3.bandwidth;

public class BandwidthApp {
    public static void main(String[] args) {

        double maxNetworkBandwidth = 1000_000_000; //1000Mbps
        int users = 200;
        double appABandwidth = 200_000;
        double appBBandwidth = 100_000;
        double newAppBandwidth = 350_000;


        double networkCapacity = maxNetworkBandwidth;
        double currentUsage = users * (appABandwidth + appBBandwidth);
        double currentAvailability = networkCapacity - currentUsage;
        double newAppsRequirements = users * newAppBandwidth ;
        double bandwidthAvailable = (networkCapacity - (currentUsage + newAppsRequirements)) / 1000_000; //in Mbps

        System.out.printf("Network capacity in bps: %,.0f%n", networkCapacity); // %,.0f => groups digits with commas, 0 decimals.
        System.out.printf("Current usage in bps: %,.0f%n", currentUsage);
        System.out.printf("Current availability in bps: %,.0f%n", currentAvailability);
        System.out.printf("New applications requirements in bps: %,.0f%n", newAppsRequirements);
        System.out.printf("Bandwidth available if the new application is installed, in Mbps: %.2f%n", bandwidthAvailable);

    }
}

// %,.0f%n = “Format as a floating-point number with commas, no decimal digits, and then start a new line.”
// %.2f%n = “Print as a floating-point number, with two digits after the decimal, then go to a new line.”
