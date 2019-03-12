package test;

/**
 * @author XP
 * @date 2018/5/29 19:56
 */
public class ClassMethod {
    public int id;
    String name;
    public ClassMethod(){}
    public ClassMethod(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void test(int i,String s){
        System.out.println("ClassMethod类的方法"+ i + s);
    }
}
