package ProjectHotel;

import java.util.Objects;

public class Room {
    private int roomID;
    private boolean isAvailable;
    private int roomNo;
    private String roomType;
    private int roomFloor;
    private double roomPrice;


    public Room(int roomID, boolean isAvailable, int roomNo, int roomFloor, String roomType, double roomPrice) {
        this.roomID = roomID;
        this.isAvailable = isAvailable;
        this.roomNo = roomNo;
        this.roomFloor = roomFloor;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomID == room.roomID && isAvailable == room.isAvailable && roomNo == room.roomNo && roomFloor == room.roomFloor && Double.compare(room.roomPrice, roomPrice) == 0 && Objects.equals(roomType, room.roomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomID, isAvailable, roomNo, roomType, roomFloor, roomPrice);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", isAvailable=" + isAvailable +
                ", roomNo=" + roomNo +
                ", roomType='" + roomType + '\'' +
                ", roomFloor=" + roomFloor +
                ", roomPrice=" + roomPrice +
                '}';
    }
}
