package ProjectHotel;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, false, 100,1, "single", 10000));
        rooms.add(new Room(2, false, 200,2, "single", 10000));
        rooms.add(new Room(3, false, 300,3, "double", 18000));
        rooms.add(new Room(4, true, 400,4, "double", 18000));
        rooms.add(new Room(5, true, 500,5, "single", 10000));
        rooms.add(new Room(6, true, 600,6, "single", 10000));


        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Symbat","Orazalina", 1 , "symbat123", "symb123"));
        customers.add(new Customer("Rizat","Orazalina", 2 , "rizz", "qwe"));
        customers.add(new Customer("Aidyn","Nurgozhaev", 3 , "aidyn@n", "123"));

        List<Service> services = new ArrayList<>();
        services.add(new Service(1, "Spa", 5000));
        services.add(new Service(2, "Food Door", 7000));
        services.add(new Service(3, "Fitness", 1000));

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(1, true, customers.get(0).getId_number(), rooms.get(0).getRoomID(), new GregorianCalendar(2021, Calendar.JANUARY, 20)));
        bookings.add(new Booking(2, true, customers.get(1).getId_number(), rooms.get(2).getRoomID(), new GregorianCalendar(2021, Calendar.JANUARY, 11)));
        bookings.add(new Booking(3, true, customers.get(2).getId_number(), rooms.get(1).getRoomID(), new GregorianCalendar(2021, Calendar.FEBRUARY, 21)));

        List<Bron> brons = new ArrayList<>();
        System.out.println("-----------------------Автор: Оразалина Ризат-----------------------");
        System.out.println("Добро пожаловать в наш Отель *Golden Plaza*!!!");
        Line();
        boolean isRunning = true;
        while(isRunning){
            try {
                System.out.println(" 1- Регистрация жильца " +
                        "\n2- Статистика по доступным комнатам " +
                        "\n3- Бронирование номеров " +
                        "\n4- Поиск жильца " +
                        "\n5- Статус комнаты " +
                        "\n6- Каталог дополнительных услуг" +
                        "\n7- Войти как клиент "+
                        "\n8- Список/данные бронированных номеров" +
                        "\n0- Выйти:");
                Line();
                int choice = scanner.nextInt();
                if (choice == 1){
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    System.out.println("Введите фамилию: :");
                    String surname = scanner.next();
                    System.out.println("Login:");
                    String login = scanner.next();
                    System.out.println("Password:");
                    String pwd = scanner.next();
                    customers.add(new Customer(name, surname, customers.size(), login, pwd));

                    System.out.println("true- доступные комнаты");
                    for (var room: rooms) {
                        System.out.println(room);
                    }
                    System.out.println("Выберите ID комнату: ");
                    int idRoom = scanner.nextInt();
                    for (var room: rooms) {
                        if(room.getRoomID() == idRoom){
                            room.setAvailable(false);
                        }
                    }

                    bookings.add(new Booking(bookings.size() + 1, true, customers.size(), idRoom,new GregorianCalendar(2021, Calendar.FEBRUARY, 28)));

                    System.out.println("Спасибо за регистрацию!");
                    Line();
                }
                else if(choice == 2){
                    System.out.println("true- доступные комнаты");
                    for (var room: rooms) {
                        if(room.isAvailable()) {
                            System.out.println(room);
                        }
                    }
                    Line();
                }
                else if(choice == 3){
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    System.out.println("Введите фамилию: :");
                    String lastName = scanner.next();
                    System.out.println("Введите телефон в формате 8 707 777 77 77:");
                    String phone = scanner.next();
                    Line();
                    System.out.println("true- доступные комнаты");
                    for (var room: rooms) {
                        System.out.println(room);
                    }
                    System.out.println("Выберите ID комнату: ");
                    int idRoom = scanner.nextInt();
                    for (var room: rooms) {
                        if(room.getRoomID() == idRoom){
                            room.setAvailable(false);
                        }
                    }
                    System.out.println("Спасибо за бронирование номера!");

                    brons.add(new Bron(1, idRoom, name, lastName, phone));
                    Line();

                }
                else if(choice == 4){
                    System.out.println("Введите имя человека: ");
                    String name = scanner.next();
                    System.out.println("Введите фамилию: :");
                    String lastName = scanner.next();
                    String check = null;
                    for(var customer: customers)
                    {
                        if( name.equals(customer.getFirst_name()) && lastName.equals(customer.getLast_name()))
                        {
                            check = name + " "+ lastName + " есть в списке жильцов";
                            break;
                        }
                    }
                    if (check != null) {
                        System.out.println(check);
                    }else{
                        System.out.println(name + " "+ lastName + " нет в списке жильцов");
                    }
                    Line();
                }
                else if(choice == 5){
                    System.out.println("true- доступные, false- недоступные комнаты");
                    for (var room: rooms) {
                        System.out.println(room);
                    }
                    Line();
                    System.out.println("Выберите ID комнату: ");
                    int idRoom = scanner.nextInt();
                    for (var room: rooms) {
                        if(room.getRoomID() == idRoom && !room.isAvailable()){
                            System.out.println("Статус: не свободная комната");
                        }
                        if(room.getRoomID() == idRoom && room.isAvailable()){
                            System.out.println("Статус: свободная комната");
                        }
                    }

                    Line();

                }
                else if(choice == 6){
                    for (var service: services) {
                        System.out.println(service);
                    }
                    Line();
                }
                else if(choice == 8){
                    for (var bron: brons) {
                        System.out.println(bron);
                    }
                    Line();
                }
                else if(choice == 7){
                    System.out.println("Login:");
                    String login = scanner.next();
                    System.out.println("Password:");
                    String pwd = scanner.next();
                    for(var customer: customers)
                    {
                        if( login.equals(customer.getLogin()) && pwd.equals(customer.getPassword()))
                        {
                            customer.Login(customers,bookings,services, rooms, customer.getId_number());
                            break;
                        }
                    }
                    Line();

                }
                else if(choice == 0){
                    System.out.println("До встречи!");
                    isRunning =false;
                }

            }catch (Exception e){
                System.out.println("Ошибка "+e.getMessage());
            }



        }

    }

    public static void Line(){
        for (int i = 0; i<=50; i++){
            System.out.print("=");
        }
        System.out.println();
    }


}
