package cloud;

class NetworkCard {
	static int maxSpeedMb = 100;        // 100 Mb - Full Duplex
	int speedMb;                        // Velocidad
	String macAddress;                  // Dirección física
	String network;                     // Segmento de red
	int unitNumber = 0;                 // Número de unidad
	String label = "Network Card ";     // Etiqueta
	
	void setUnit(int unit){
		this.unitNumber = unit;
		this.label = this.label + unit;
	}
}
