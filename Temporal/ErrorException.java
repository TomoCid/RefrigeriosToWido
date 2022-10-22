package Temporal;

public class ErrorException extends Exception{

    public ErrorException(String mensajeDeError){
        super(mensajeDeError);
    }
}