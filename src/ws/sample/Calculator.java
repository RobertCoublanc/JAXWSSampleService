package ws.sample;

 
import javax.jws.WebService;

 
@WebService()
	public class Calculator implements CalculatorWs {

	    public int sum(int add1, int add2) {
	        return add1 + add2;
	    }

	    public int multiply(int mul1, int mul2) {
	        return mul1 * mul2;
	    }
	}
 
