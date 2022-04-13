import test.ship.StarShip;

public class World {

    public static void main(String[] args) {
        //создаю экземпляр класса корабля
        StarShip ship = new StarShip(253.25);
        displayHeigh(ship);
    }
    public static void displayHeigh(StarShip ship) {
        System.out.println("Высота корабля составляет : " + ship.getShipHeight());
    }
}
