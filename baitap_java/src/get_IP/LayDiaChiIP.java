package get_IP;
import java.net.InetAddress;

public class LayDiaChiIP {

	public static void main(String args[]) throws Exception
    {
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("Địa chỉ IP của tôi là:");
        System.out.println(myIP.getHostAddress());
        System.out.println("----------------------------");
    }

}
