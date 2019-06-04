package com.nice.demo;

import org.w3c.dom.Node;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 自定义hashmap
 * @author ningh
 * @param <K>
 * @param <V>
 */
public class NiceHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>,Cloneable,Serializable {


    /**
     * 初始容量
     */
    public final   int INITIAL_CAPACITY = 16;

    /**
     *
     */
    transient Node<K,V>[] table;


    /**
     * 加载因子
     */
   public final float loadFactory = 0.75f;
    /**
     * 最大容量
     */
   public final int MAXIMUM_CAPACITY = 2<<30;

    /**
     * 阈值
     * 默认为初始容量和加载因子的乘积，当容量超出阈值和加载因子的乘积时，阈值扩大为原来的二倍
     */
    public int threshold;



    /**
     * 无参构造
     */
   public NiceHashMap(){
        //初始化容量
       initThreshold();
   }

    /**
     * 有参构造
     * @param initialCapacity 初始化容量大小
     */
   public NiceHashMap(int initialCapacity){
       setInitialCapacity(initialCapacity);
   }



    /**
     * 静态内部类，节点
     * @author ningh
     * @param <K>
     * @param <V>
     */
   static class Node<K,V> implements Map.Entry<K,V>{

        /**
         * 常量key
         */
        final K key;

        /**
         * value值
         */
        V value;

        /**
         * 下一个节点
         */
        Node<K,V> next;




        /**
         * 构造函数
         * @param key 键
         * @param value 值
         * @param next  下一个节点
         */
        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        /**
         * 重写hashcode方法
         * @return int
         */
        @Override
        public int hashCode() {
            return Objects.hashCode(key)^Objects.hashCode(value);
        }

        /**
         * 重写equals方法
         * @param obj 对象
         * @return boolean
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry<?,?> e = (Entry<?, ?>) obj;
                if (Objects.equals(key,e.getKey()) && Objects.equals(value,e.getValue())){
                    return true;
                }
            }
            return false;
        }

        @Override
       public K getKey() {
           return key;
       }

       @Override
       public V getValue() {
           return value;
       }

       @Override
       public V setValue(V value) {
            this.value = value;
           return value;
       }
   }




    /**
     * 初始化阈值为初始容量大小
     */
    public void initThreshold(){
        threshold = INITIAL_CAPACITY;
    }

    /**
     * 检测初始容量大小是否有异常
     */
    void checkInitialCapacity(int threshold){
        //如果初始容量小于0时抛出异常
        if (threshold < 0 ){
            throw new IllegalArgumentException("初始容量不能小于0");
        }

        //如果阈值超出最大容量时
        if (threshold  > MAXIMUM_CAPACITY ){
            throw  new IllegalArgumentException("超出最大容量");
        }
    }

    /**
     * 设置初始容量大小
     * @param initialCapacity
     */
    public void setInitialCapacity(int initialCapacity) {
        //检查容量大小是否有异常
        checkInitialCapacity(initialCapacity);
        this.threshold = initialCapacity;
    }

    /*final V  putVal(K key,V value){
        Node<K,V>[] tab ;
        Node<K,V> p;
        int n,i;
       // tab =
      //  n = tab.length;
    }*/




    /**
     * 扩容
     */
/*    public Node<K,V> resize(){
        //如果超出负载因子和容量的乘积
        if (size() >= threshold*loadFactory){
            int temp = threshold << 1;
            //检查容量大小是否超出最大值
            checkInitialCapacity(temp);
            //初始容量扩大为原来的2倍
            threshold = temp;
            Node<K,V>[] tempNode = (Node<K, V>[]) table;
        }
    }*/





    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }
}
