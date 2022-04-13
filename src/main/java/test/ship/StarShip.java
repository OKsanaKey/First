package test.ship;
/*Crated by Oksana 04 2022*/
public class StarShip {
    /*высота*/
    public double shipHeight;

    //добавить конструктор для корабля
    public StarShip(double shipHeight){ this.shipHeight=shipHeight; }

    //возвращает высоту корабля
    public double getShipHeight() {
        return this.shipHeight;
    }

}
