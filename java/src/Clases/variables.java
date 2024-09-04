package Clases;

public class variables {

    //TIPOS DE DATOS PRIMITIVOS

        //VARIABLES de Numeros Enteros

    //byte: Emplea un solo byte (8 bits) de almacenamiento
    //Esto permite almacenar valores entre [-128 , 127].
    byte numeroByte = 9;

    //short: Emplea el doble de almacenamiento de (byte)
    //Esto permite almacenar valores entre [-32.768, 32.767].
    short numeroShort = 32767;

    //int: Emplea un tamano mayor, 4 bytes (32 bits)
    //Esto permite almacenar valores entre [-2147483648, 2147483647]
    int numeroInt = 41825;

    //long: Emplea un tamano mayor entre todos los enteros, 8 bytes (64 bits)
    //Esto permite almacenar valores entre [-9223372036854775808, 9223372036854775807].
    long numeroLong = 9223372036854775807L;


        //VARIABLES de Numeros Flotantes

    //float: Emplea un tamano de 32 bits (4 bytes)
    //Esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45]
    float numeroFloat = 3.14159265f;

    //float: Emplea un tamano de 64 bits (8 bytes)
    //Esto permite almacenar valores entre [-1.7976931348623157E+309, 4.94065645841246544E-324]
    double numeroDouble = 3.14159265;


        //VARIABLES Booleanas

    //boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos (booleanos).
    //Se traducen sus valores en true/false.
    boolean variableBoolean = true;

    //char: Se emplea para almacenar caracteres individuales (letras, aunque puede contener numeros)
    //Utiliza 16 bits y se codifica sobre UTF-16 Unicode
    char numeroChar = 1;
    char letraChar = 'c';



        //TIPOS DE DATOS ESTRUCTURADOS

    //String: Se emplea usando una instancia de la clase String
    //Aunque parezca trabajar con datos primitivos

    String variableString = "Hola soy un caracter";
}
