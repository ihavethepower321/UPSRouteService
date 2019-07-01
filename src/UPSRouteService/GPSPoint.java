package UPSRouteService;

import Interface.GraphicsPoint;

public class GPSPoint {

    private double latitude;
    private double longitude;

    public GPSPoint(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public GraphicsPoint getGraphicsPoint() {
        return null;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String toString() {
        return "[lat: " + latitude + ", lon: " + longitude + "]";
    }

}