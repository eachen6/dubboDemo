package com.provider.main;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("172.80.2.207",6379);
		jedis.auth("Redis123456");
		//System.out.println(jedis.ping());
		//System.out.println(jedis.get("myname"));
//		jedis.set("eachen", "生日快乐");
//		System.out.println(jedis.get("eachen"));
//		jedis.lpush("firstlist", "what are you doing now");
//		jedis.lpush("firstlist", "你现在在干嘛");
//		jedis.lpush("firstlist", "嘎哈呢");
//		List<String> myList = jedis.lrange("firstlist", 0, 2);
//		for(String  i: myList) {
//			System.out.println(i);
//		}
		jedis.set("img", "123");
	}
}
