package week_5.HotelOperations;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(123,false,false,230,2);

        Reservation reservation = new Reservation("king",5, true);
        System.out.println(reservation.getReservationTotal());

        Employee employee = new Employee("1","Stan","Manager",22.5,61.54);
        System.out.println(employee.totalPay());
        Employee employee2 = new Employee("2","Linda", "Baking",15,21);
        System.out.println(employee2.totalPay());
    }

}
