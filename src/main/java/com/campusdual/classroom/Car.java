package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0; // velocidad actual
    public int tachometer = 0;  // revoluciones por minuito
    public String gear = "N";   // caja de cambios
    public boolean reverse = false;
    public int wheelsAngle = 0; // ángulo de las ruedas!

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0) {
            if (this.speedometer + 20 <= MAX_SPEED) {
                this.speedometer += 20;
                System.out.println("Acelerando: velocidad actual " + this.speedometer + " km/h");
            } else {
                System.out.println("No se puede exceder la velocidad máxima de " + MAX_SPEED + " km/h");
            }
        } else {
            System.out.println("El coche debe estar encendido para acelerar");
        }
    }

    public void brake() { // frenar el coche
        if (this.speedometer - 20 >= 0) {
            this.speedometer -= 20;
            System.out.println("Freno. Velocidad actual: " + this.speedometer);
        } else {
            this.speedometer = 0;
            System.out.println("Coche detenido");
        }

    }

    public void turnAngleOfWheels(int angulo) {
        if (angulo > 45) {
            this.wheelsAngle = 45;
        } else if (angulo < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = angulo;
        }
        System.out.println("Volante girado a " + this.wheelsAngle + " grados");
    }

    public String showSeeringWheelDetail() {
        return "";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";  // marcha en retro
            } else {
                this.gear = "N"; // marcha en neutro
            }
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
        }
    }

    public void showDetails() {
        System.out.println("Coche{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speedometer=" + speedometer +
                ", tachometer=" + tachometer +
                ", gear='" + gear + '\'' +
                ", reverse=" + reverse +
                ", wheelsAngle=" + wheelsAngle +
                '}');

    }


}

