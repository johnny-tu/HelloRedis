import redis.clients.jedis.Jedis;

public class HelloRedis 
{
	public static void main (String args [])
	{
		Jedis jedis = new Jedis("redisdb");

		while (true) {	
			try {
				Thread.sleep(5000);
      			System.out.println("Server is running: "+jedis.ping());
				String bookCount = jedis.get("books_count");
				System.out.println("books_count = " + bookCount);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
