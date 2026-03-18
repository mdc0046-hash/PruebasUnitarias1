package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    @Test
    @DisplayName("Reto 1 (Nombre vacío)")
    public void testNombreVacio(){
        String nombre = "";
        boolean resultado = validador.NombreVacio(nombre);

        assertFalse(resultado, "Error: el nombre esta vacio");
    }

    @Test
    @DisplayName("Reto 2 (Password justa)")
    public void testPasswordJusta(){
        String password = "12345678";
        boolean resultado = validador.PasswordJusta(password);

        assertTrue(resultado, "Correct: la password es de 8 digitos");
    }

    @Test
    @DisplayName("Reto 3 (Password corta)")
    public void testPasswordCorta(){
        String password = "Admin";
        boolean resultado = validador.PasswordCorta(password);

        assertFalse(resultado, "Error: la password es demasiado corta");
    }

    @Test
    @DisplayName("Reto 4 (Email sin arroba)")
    public void testEmailSinArroba(){
        String email = "usuario.gmail.com";
        boolean resultado = validador.EmailSinAroba(email);

        assertFalse(resultado, "Error: el email no contiene @");
    }

    @Test
    @DisplayName("Reto 5 (Edad límite)")
    public void testEdadLimite(){
         int edad = 16;
         boolean resultado = validador.EdadLimite(edad);

         assertTrue(resultado, "Correcto: la edad si es valida");
    }

}
