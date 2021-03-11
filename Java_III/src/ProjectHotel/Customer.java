package ProjectHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private String first_name;
    private String last_name;
    private int id_number;
    private String login;
    private String password;

    public Customer(String first_name, String last_name, int id_number, String login, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_number = id_number;
        this.login = login;
        this.password = password;
    }

    public Customer(){}

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", id_number=" + id_number +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public void Login(List<Customer> customers, List<Booking> bookings, List<Service> services, List<Room> rooms, int id){
        if (true){

            int idRoom=0;
            while(true) {
                System.out.println("Хотите выселится? 1-да, 0-нет, 2-услуги :");
                int nmb = scanner.nextInt();
                if (nmb == 1) {
                    System.out.println("До встречи!");

                    for (var booking : bookings) {
                        if (booking.getCustomerID() == id) {
                            idRoom = booking.getRoomID();
                            bookings.remove(booking);
                        }
                    }


                    for (var room : rooms) {
                        if (room.getRoomID() == idRoom) {
                            System.out.println("До скорей встречи! \nКомната  ID: "+idRoom+" свободна");
                            room.setAvailable(true);
                        }

                    }
                    break;


                } else if (nmb == 0) {
                    System.out.println("ок");
                    break;
                } else if (nmb == 2) {
                    panelCustomer(services);
                }
            }
        }
    }

    public void panelCustomer(List<Service> services){

            try {
                System.out.println("Каталог дополнительных услуг" +
                        "\n");
                System.out.println("=======================================================");
                for (var service: services) {
                    System.out.println(service);
                }
                System.out.println("Выбрана Каталог дополнительных услуг, выберите ID : ");
                int nmb1 = scanner.nextInt();
                System.out.println("Вы выбрали "+services.get(nmb1-1));

            }

            catch (Exception e){
                System.out.println("Ошибка");
            }

    }

}
