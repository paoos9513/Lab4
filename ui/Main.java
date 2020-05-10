package ui;

import model.Car;
import model.Company;
import model.Motorcycle;
import model.Vehicle;

import java.util.Scanner;

public class Main {
        Scanner scan = new Scanner(System.in);
        Company company;

        //metodo constructor
        public Main(){
            company = new Company("La Eleccion", "232535-5");
            show();

        }

     //-------------------------------------------------------main-------------------------------------------------------

        public static void main(String[] args){
            new Main();
        }

    //----------------------------------------------Impresiones por pantalla--------------------------------------------

        public void show(){
            System.out.println("BIENVENIDO A LA COMPAÑIA LA ELECCION");
            menu();

        }

    //--------------------------------------------------Logica del codigo-----------------------------------------------

        public void menu(){
            System.out.println("ingrese la opcion que desea realizar: ");
            System.out.println("1. Registrar vehículos \n" + "2. Realizar Cotización \n" + "3. Ver Informe \n" );
            int option=scan.nextInt();
            scan.nextLine();

            switch(option){
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

        public void registerVehicle(){

            int option;
            boolean isUsed;
            String carOrMotorcycle;

            System.out.println("Cuantos vehiculos desesa resgistrar");
            option = scan.nextInt();
            scan.nextLine();

            for(int i=0; i<option; i++) {

                System.out.println("Va a registrar un CARRO o una MOTO");
                carOrMotorcycle = scan.nextLine();

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

                if(carOrMotorcycle.equalsIgnoreCase("carro")) {

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
                        int kilometers = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Placa del vehículo");
                        String licensePlates = scan.nextLine();
                        Vehicle car = new Car(brand,
                                model,
                                basePrice,
                                cylinder,
                                typeFuel,
                                "sin asignar",
                                licensePlates,
                                kilometers,
                                numberDoor,
                                typeCar,
                                tintedWindows
                        );
                        company.addVehicle(car);
                    } else {
                        Vehicle car = new Car(brand,
                            model,
                            basePrice,
                            cylinder,
                            typeFuel,
                            "sin asignar",
                            "sin asignar",
                            0,
                            numberDoor,
                            typeCar,
                            tintedWindows
                        );
                        company.addVehicle(car);
                    }


                } else if (carOrMotorcycle.equalsIgnoreCase("Moto")){

                    System.out.println("Tipo de Moto: \n" + "Estandar, Deportiva, Scooter, Cross");
                    String typeMotorcycle = scan.nextLine();

                    if (isUsed) {

                        System.out.println("Kilometraje de la Moto");
                        int kilometers = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Placa de la Moto");
                        String licensePlates = scan.nextLine();

                        Vehicle motorcycle = new Motorcycle(brand,
                                model,
                                basePrice,
                                cylinder,
                                "Gasolina",
                                "Sin asignar",
                                licensePlates,
                                kilometers,
                                typeMotorcycle
                        );
                        company.addVehicle(motorcycle);

                    } else {
                        Vehicle motorcycle = new Motorcycle(brand,
                                model,
                                basePrice,
                                cylinder,
                                "Gasolina",
                                "Sin asignar",
                                "Sin asignar",
                                0,
                                typeMotorcycle
                        );
                        company.addVehicle(motorcycle);
                    }

                }else {

                    System.out.println("El vehiculo ingresado es incorreto");

                }

            }
            System.out.println("El vehÍculo se ha registrado exitosamente");
        }


    //--------------------------------------------cotizaciones para clientes--------------------------------------------

        public void createQuote(){

        }

        //-----------------------------muestra la informacion almacenada de los clientes------------------------------------

        public void showInformation(){

        }
    }
