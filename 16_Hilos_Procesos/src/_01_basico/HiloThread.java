package _01_basico;

public class HiloThread extends Thread {

	private String valorImprimir;

	// String name
	public HiloThread(String valorImprimir) {
		this.valorImprimir = valorImprimir;
	}

	// Seria como un "main"
	//
	@Override
	public void run() {
		//aqui nacera el hilo
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());//obtenemos el nombre del hilo
		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(500);//simulacon de tarea que tarda 500 milisegungdos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 0.5 segundos

			System.out
					.println("Hilo: " + Thread.currentThread().getName() + " , dice: " + valorImprimir + "ciclo: " + i);
		}
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
		//aqui morira el hilo
	}

}
