package prJarras;

public class Jarras {
	//variables de instancia
		private int cantidad;
		private int capacidad;
	//constructor
		public Jarras(int capacidadInicial){
			if(capacidadInicial<=0){
				throw new RuntimeException ("ERROR: no se pueden crear jarras con capacidad menor o igual a cero." );
			}
			this.capacidad=capacidadInicial;
		}
	//metodos
		
		
		
	public void metodoComunitario(){
		//Comentario incluido para pruebas
			System.out.println("Aqu� escribimos todos");
	}
}
