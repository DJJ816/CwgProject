package com.bdqn.cwg_webpages.config;

import com.bdqn.redis.EmptyUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisHelp {

    //Redis 是二进制安全的，单线程的，


    @Resource
    RedisTemplate<String,Object> redisTemplate;

    public boolean set(String key,long seconds,String value){
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
////        //设置序列化Value的实例化对象
//        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key,value);
        expire(key,seconds);
        return true;
    }
    public Object getName(String key){
//        redisTemplate.getKeySerializer();
////        //设置序列化Value的实例化对象
//        redisTemplate.getValueSerializer();
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        Object o = vo.get(key);
        System.out.println(key+"------");
        return o;
    }

    public boolean exist(String key){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置序列化Value的实例化对象
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        Object value=vo.get(key);
        return EmptyUtils.isEmpty(value)?false:true;
    }
    public Boolean expire(final String key, final Long expireTime) {
        return redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                boolean flag=false;
                try{
                    redisTemplate.setKeySerializer(new StringRedisSerializer());
                    //设置序列化Value的实例化对象
                    redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
                    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
                    byte keys[] =stringRedisSerializer.serialize(key);
                    flag=redisConnection.expire(keys,expireTime);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return flag;
            }
        });
    }


}
