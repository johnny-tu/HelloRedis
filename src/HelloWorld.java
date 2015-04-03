import redis.clients.jedis.Jedis;

public class HelloWorld 
{
	public static void main (String args [])
	{
		Jedis jedis = new Jedis("redis");
        //System.out.println("Connection to server sucessfully");

		while (true) {	
			//System.out.println("Hello World");
       		//check whether server is running or not
      		System.out.println("Server is running: "+jedis.ping());
		}
	}
}
