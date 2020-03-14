package basic;
import redis.clients.jedis.Jedis;

public class HelloJedis {
	// two night in beijing
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost", 6379);
		jedis.auth("foobared");
		System.out.println(jedis.ping());
		
		jedis.close();
	}
}
