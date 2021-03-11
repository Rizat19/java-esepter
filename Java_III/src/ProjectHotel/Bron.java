package ProjectHotel;

public class Bron {
    private int bronID;
    private int roomID;
    private String nameUser;
    private String lastNameUser;
    private String phone;

    public Bron(int bronID, int roomID, String nameUser, String lastNameUser, String phone) {
        this.bronID = bronID;
        this.roomID = roomID;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.phone = phone;
    }

    public int getBronID() {
        return bronID;
    }

    public void setBronID(int bronID) {
        this.bronID = bronID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Bron{" +
                "bronID=" + bronID +
                ", roomID=" + roomID +
                ", nameUser='" + nameUser + '\'' +
                ", lastNameUser='" + lastNameUser + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
