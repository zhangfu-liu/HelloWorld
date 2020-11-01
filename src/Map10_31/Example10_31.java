package Map10_31;

import javax.xml.soap.Node;

/**
 * @Author AT-zfc
 * @Since 2020-10-31 16:22
 */
public class Example10_31 {
    //桶结构转化红黑树对应的数组长度最小值
    static  final  int MIN_TERRIFY_CAPACITY = 64 ;
    //table 用来初始化（必须是二的n次幂）（重点）
    //transient Node<k,v>[] table; 存储元素的数组
    //HashMap中存放元素的个数
    //存放的元素个数，注意这不等于数组的长度
    transient  int size;//size 是HashMap 中的k,v实时数量，并不是table中的长度
    transient  int modCount; //每次扩容和更改map结果的计时器， 也就是用来记录HashMap的修改次数
    //用来调整大小下一个容器的值计算方式为（容量*负载因子）
    int threshold;//临界值，当实际大小超过临界值时，会自动进行扩容
    //哈希表的加载因子
    final  float loadFactor =0.75f;
}
