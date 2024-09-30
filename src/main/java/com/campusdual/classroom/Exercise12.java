package com.campusdual.classroom;

public class Exercise12 {

    public static void main(String[] args) {

        Car coche = new Car("Mazda", "Demio", "Diesel");

        // 1. verifique si el valor del tacómetro es cero
        System.out.println("Tacómetro a cero: " + coche.isTachometerEqualToZero());

        // 2. Encender el coche comprobando el valor correcto del tacómetro
        if (coche.isTachometerEqualToZero()) // debe estar a 0 revoluciones para proceder a encender
            coche.start();

        // 3. Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        coche.start();

        // 4. Apagar el coche comprobando que el valor del tacómetro es correcto
        if (!coche.isTachometerEqualToZero())
            coche.stop();

        // 5. Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        coche.start();
        coche.accelerate();
        coche.stop();

        // 6. Acelerar el coche
        coche.accelerate();

        // 7. Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for (int i = 0; i < 5; i++) {
            coche.accelerate();
        }

        // 8. Frenar la velocidad
        coche.brake();

        // 9. Frenar hasta un valor negativo (y comprobar que no se puede)
        for (int i = 0; i < 7; i++) {
            coche.brake();
        }

        // 10. Girar el volante 20 grados

        coche.turnAngleOfWheels(20);

        // 11. Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        coche.turnAngleOfWheels(50);
        coche.turnAngleOfWheels(-50);

        // 12. Detener el coche y poner marcha atrás
        coche.stop();
        coche.gear = "R";

        // 13. Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)

        coche.setReverse(true);
    }


}