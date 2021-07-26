package fr.greg.encaps;

public class car {
//variable statique
    public static int count;

    //Attributs (variables)
    public int _id;
    public String _brand;
    public double _speed;
    public int _power;
    public String _color;


        //Constructeur
    public car (String brand, double speed, int power, String color) {
        this._id = count++;
    this._brand = brand;
    this._speed = speed;
    this._power = power;
    this._color = color;
    }




    //Méthodes

    public String description() {
        String des = "ID -> " + _id + ", Description de ma nouvelle voiture : Marque -> "  +  _brand + ", de couleur -> " + _color;
        return des;
    }

    public String toString() {
        return description();
    }
}
