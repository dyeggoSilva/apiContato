package com.api.contato.exception;

public class BlankFieldException  extends RuntimeException{

    public BlankFieldException(){super("preencha todos os campos!");};
    public BlankFieldException(String msg){super(msg);};
}
