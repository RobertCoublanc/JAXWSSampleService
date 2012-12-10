package ws.sample;
import javax.jws.WebService;

@WebService(targetNamespace = "http://myws.sample")
public interface CalculatorWs {

    public int sum(int add1, int add2);

    public int multiply(int mul1, int mul2);
}