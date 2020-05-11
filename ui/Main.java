package ui;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    Company company;

    //metodo constructor
    public Main() {
        company = new Company("La Eleccion", "232535-5");
        show();

    }

    //-------------------------------------------------------main-------------------------------------------------------

    public static void main(String[] args) {
        new Main();
    }

    //----------------------------------------------Impresiones por pantalla--------------------------------------------

    public void show() {
        System.out.println("BIENVENIDO A LA COMPAÑIA LA ELECCION");
        menu();
        show();
    }

    //--------------------------------------------------Logica del codigo-----------------------------------------------

    public void menu() {
        System.out.println("ingrese la opcion que desea realizar: ");
        System.out.println("1. Registrar vehículos \n" + "2. Realizar Cotización \n" + "3. Ver Informe \n");
        int option = scan.nextInt();
        scan.nextLine();

        switch (option) {
            case 1: {
                registerVehicle();
                break;
            }
            case 2: {
                createQuote();
                break;
            }
            case 3: {
                showInformation();
                break;
            }

        }
    }

    //--------------------------------------------------Registro de vehiculos-------------------------------------------

    public void registerVehicle() {

        int option;
        boolean isUsed;
        String carOrMotorcycle;

        System.out.println("Cuantos vehiculos desesa resgistrar");
        option = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < option; i++) {

            System.out.println("Va a registrar un CARRO o una MOTO");
            carOrMotorcycle = scan.nextLine();
            int kilometers = 0;
            String licensePlate = "Sin asignar";

            if (carOrMotorcycle.equalsIgnoreCase("carro") || carOrMotorcycle.equalsIgnoreCase("Moto")) {

                System.out.println("El vehiculo es usado? SI/ NO");
                isUsed = scan.nextLine().toLowerCase().equals("si");

                System.out.println("Ingrese la marca");
                String brand = scan.nextLine();

                System.out.println("Ingrese el modelo ");
                String model = scan.nextLine();

                System.out.println("Ingrese el precio base");
                int basePrice = scan.nextInt();
                scan.nextLine();

                System.out.println("Cilindraje ");
                int cylinder = scan.nextInt();
                scan.nextLine();

                if (carOrMotorcycle.equalsIgnoreCase("carro")) {

                    System.out.println("Numero de puertas");
                    int numberDoor = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Tipo de combustible : \n" + "(Gasolina, Eléctrico o Híbrido)");
                    String typeFuel = scan.nextLine();

                    System.out.println("Tipo de Carro: \n" + "(Camioneta o sedan)");
                    String typeCar = scan.nextLine();

                    System.out.println("Tiene ventanas polarizadas? SI/NO");
                    boolean tintedWindows = scan.nextLine().toLowerCase().equals("si");

                    if (isUsed) {

                        System.out.println("Kilometraje del vehículo");
                        kilometers = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Placa del vehículo");
                        licensePlate = scan.nextLine();

                    }

                    Vehicle car = new Car(brand,
                            model,
                            basePrice,
                            cylinder,
                            typeFuel,
                            licensePlate,
                            kilometers,
                            numberDoor,
                            typeCar,
                            tintedWindows,
                            isUsed
                    );
                    company.addVehicle(car);

                } else if (carOrMotorcycle.equalsIgnoreCase("Moto")) {

                    System.out.println("Tipo de Moto: \n" + "Estandar, Deportiva, Scooter, Cross");
                    String typeMotorcycle = scan.nextLine();

                    if (isUsed) {

                        System.out.println("Kilometraje de la Moto");
                        kilometers = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Placa de la Moto");
                        licensePlate = scan.nextLine();
                    }

                    Vehicle motorcycle = new Motorcycle(brand,
                            model,
                            basePrice,
                            cylinder,
                            "Gasolina",
                            licensePlate,
                            kilometers,
                            typeMotorcycle,
                            isUsed
                    );
                    company.addVehicle(motorcycle);
                }
                System.out.println("El vehÍculo se ha registrado exitosamente");
            } else {

                System.out.println("El vehiculo ingresado no existe en la compañia");

            }
        }

    }


    //--------------------------------------------cotizaciones para clientes--------------------------------------------

    public void createQuote() {
        int option;

        System.out.println("----------Cotización Compañia La Elección----------");
        System.out.println("----------INFORMACION DEL CLIENTE----------");

        System.out.println("Nombre");
        String name = scan.nextLine();

        System.out.println("Apellido");
        String lastName = scan.nextLine();

        System.out.println("Cedula");
        String id = scan.nextLine();

        System.out.println("Celular");
        String phoneNumber = scan.nextLine();

        System.out.println("Correo Electronico");
        String email = scan.nextLine();

        Client client = new Client(name,
                lastName,
                id,
                phoneNumber,
                email
        );

        System.out.println("----------VEHICULO DE INTERES----------");
        vehicleInterested(client.getVehicles());

        System.out.println("----------SELECCIONE EL VENDEDOR QUE LO ATENDIÓ----------");
        selectSeller(client);



    }



    public void  selectSeller(Client client) {

        for(int i=0; i<company.getArraySeller().length; i++){

            System.out.println("vendedor #: " + i);
            System.out.println("Nombre: "+company.getArraySeller()[i].getName());
            System.out.println("Apellido: "+company.getArraySeller()[i].getLastName());

        }
        int selectedSeller=scan.nextInt();

        if(company.getArraySeller()[selectedSeller].canAddClients()){
            company.getArraySeller()[selectedSeller].addClient(client);
        } else {
            System.out.println("Este vendedor no puede tener más clientes, seleccione otro");
            selectSeller(client);
        }

        System.out.println("Se ha registrado la cotacion correctamente");
    }

    public void vehicleInterested(ArrayList<Vehicle> selectedVehicles) {

        System.out.println("CARRO o MOTO");
        String carOrMotorcycle = scan.nextLine();

        System.out.println("Seleccione el/la " + carOrMotorcycle + " de interés");
        for (int i=0; i<company.getVehicles().size(); i++){

            Vehicle vehicle = company.getVehicles().get(i);
            if(vehicle instanceof Car && carOrMotorcycle.equalsIgnoreCase("carro")) {
                Car car = (Car) vehicle;
                System.out.println("Carro # " + i);
                System.out.println("Marca: " + car.getBrand());
                System.out.println("Modelo :" + car.getModel());
                System.out.println("Precio Base: " + car.getBasePrice());
                System.out.println("Tipo de combustible: " + car.getTypeFuel());
                System.out.println("Cilindraje: " + car.getCylinder());
                System.out.println("Placa: " + car.getLicensePlate());
                System.out.println("Vehiculo usado?: " + car.isUsed());
                System.out.println("Numero de puertas: " + car.getNumberDoor());
                System.out.println("Ventanas polarizadas: " + car.isTintedWindows());
                System.out.println("Tipo de caro: " + car.getTypeCar());
                System.out.println("El precio total es: " + car.getTotalPrice());
            }

            if(vehicle instanceof Motorcycle && carOrMotorcycle.equalsIgnoreCase("moto")) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Moto # " + i);
                System.out.println("Marca: " + motorcycle.getBrand());
                System.out.println("Modelo :" + motorcycle.getModel());
                System.out.println("Precio Base: " + motorcycle.getBasePrice());
                System.out.println("Tipo de combustible: " + motorcycle.getTypeFuel());
                System.out.println("Cilindraje: " + motorcycle.getCylinder());
                System.out.println("Placa: " + motorcycle.getLicensePlate());
                System.out.println("Vehiculo usado?: " + motorcycle.isUsed());
                System.out.println("El precio total es: " + motorcycle.getTotalPrice());
            }

            System.out.println("");

        }

        int vehicleInteresting =scan.nextInt();
        scan.nextLine();

        selectedVehicles.add(company.getVehicles().get(vehicleInteresting));

        System.out.println("Desea añadir otro vehículo? SI/NO");
        String selected = scan.nextLine();

        if (selected.equalsIgnoreCase("si")){
            System.out.println("----------SELECCION OTRO VEHÍCULO----------");
            vehicleInterested(selectedVehicles);
        }

    }

    //-----------------------------muestra la informacion almacenada de los clientes------------------------------------

    public void showInformation() {

        System.out.println("|INFORMACION DEL VENDEDOR| " );
        System.out.println("|NOMBRE| " );
        System.out.println("|APELLIDO| " );
        System.out.println("|IDENTIFICACION| " );

        System.out.println("|INFORMACION DEL CLIENTE| " );
        System.out.println("|NOMBRE| " );
        System.out.println("|APELLIDO| " );
        System.out.println("|IDENTIFICACION| " );
        System.out.println("|TELEFONO| " );
        System.out.println("|EMAIL| " );

        System.out.println("|INFORMACION DEL VEHICULO| " );
        System.out.println("");
    }


}
