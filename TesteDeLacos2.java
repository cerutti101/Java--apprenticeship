
public class TesteDeLacos2 {
public static void main(String[] args) {
	int resultado =0;
	for(int contador= 1; contador<=100; contador++ ) {
	resultado= 3*contador;
	if(resultado>100) {
		break;
	}
	System.out.println(resultado);
	}
}
}
