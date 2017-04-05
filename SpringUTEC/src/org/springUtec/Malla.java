package org.springUtec;

public class Malla {
	private int codmalla;
    private String descripcionlarga;
    private int estado;
    private Curso curso;
    
    public Malla (Curso curso){
    	this.curso =curso;
    }
    public void ListarCursosMalla ( int cod_producto, int estado)
    {
    	System.out.printnl("Cursos por Malla");
    }
}
