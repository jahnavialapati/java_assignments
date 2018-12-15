public class Complex {
	double real;
	double imaginary;
	public Complex() {}
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public void display(){
		System.out.println(real+"+"+imaginary+"i");
	}
	public static Complex sum(Complex complex,Complex complex1){
		Complex result = new Complex();
		result.real=complex.real+complex1.real;
		result.imaginary=complex.imaginary+complex1.imaginary;
		return result;
	}
}