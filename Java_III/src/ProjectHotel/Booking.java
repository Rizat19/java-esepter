package ProjectHotel;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Booking {
    private int bookID;
    private boolean bookingStatus;
    private int customerID;
    private int roomID;
    private Calendar bookDate;

    public Booking(int bookID, boolean bookingStatus, int customerID, int roomID, Calendar bookDate) {
        this.bookID = bookID;
        this.bookingStatus = bookingStatus;
        this.customerID = customerID;
        this.roomID = roomID;
        this.bookDate = bookDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public Calendar getBookDate() {
        return bookDate;
    }

    public void setBookDate(Calendar bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookID=" + bookID +
                ", bookingStatus=" + bookingStatus +
                ", customerID=" + customerID +
                ", roomID=" + roomID +
                ", bookDate=" + bookDate +
                '}';
    }
}
