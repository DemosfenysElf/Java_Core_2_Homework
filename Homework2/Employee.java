package Homework2;

public class Employee {
    private int id;
    private String name;
    private int quantitySpoiled;
    private static int allQuantitySpoiled = 0;

    public Employee (int id,String name){
        this.id = id;
        this.name = name;
        this.quantitySpoiled = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseQuantitySpoiled(int quantitySpoiled) {
        System.out.println(this.name + ": Ура, я испортил водку!");
        this.quantitySpoiled = this.quantitySpoiled + quantitySpoiled;
        allQuantitySpoiled = allQuantitySpoiled + quantitySpoiled;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getQuantitySpoiled() {
        return ("Всего испорчено: " + allQuantitySpoiled + " ед. товара");
    }

    public String getEmployeeQuantitySpoiled() {
        return (this.name + " (ID: " + this.id + ") испортил: " + this.quantitySpoiled + " ед. товара.");
    }

}

