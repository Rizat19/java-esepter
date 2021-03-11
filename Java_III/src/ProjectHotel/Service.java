package ProjectHotel;

import java.util.ArrayList;
import java.util.Objects;

public class Service {
    private int serviceID;
    private String serviceType;
    private double servicePrice;

    public Service(int serviceID, String serviceType, double servicePrice) {
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.servicePrice = servicePrice;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(float servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return serviceID == service.serviceID && Double.compare(service.servicePrice, servicePrice) == 0 && Objects.equals(serviceType, service.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceID, serviceType, servicePrice);
    }

    @Override
    public String toString() {
        return "HotelService{" +
                "serviceID=" + serviceID +
                ", serviceType='" + serviceType + '\'' +
                ", servicePrice=" + servicePrice +
                '}';
    }
}
