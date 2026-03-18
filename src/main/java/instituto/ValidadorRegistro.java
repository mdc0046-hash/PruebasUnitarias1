package instituto;public class ValidadorRegistro {
    public boolean validarNombre(String nombre){
        return nombre != null && !nombre.trim().isEmpty();
    }
    public boolean NombreVacio(String nombre){
        return nombre != null && !nombre.isEmpty();
    }
    public boolean PasswordJusta(String password){
        return password.length()==8;
    }
    public boolean PasswordCorta(String password){
        return password.length()>=6;
    }
    public boolean EmailSinAroba(String email){
        return email.contains("@");
    }
    public boolean EdadLimite(int edad){
        return edad == 16;
    }

}

