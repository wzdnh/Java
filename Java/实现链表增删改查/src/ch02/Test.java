package ch02;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean or;
		int xz,xx;
		System.out.println("请选择插入的方法：0、尾插法，1、头插法");
		xz=sc.nextInt();
		if(xz!=0)
			or=true;
		else
			or=false;
		System.out.println("请插入的结点的个数：");
		xx = sc.nextInt();
		LinkList L = new LinkList(xx,or);
		System.out.println("建立的链表为：");
		L.display();
		System.out.println();
		System.out.println("链表的长度："+L.length());
		//修改
		System.out.println("请输入要修改的下标以及对应的值：");
		int subscript = sc.nextInt();
		int value = sc.nextInt();
		L.remove(subscript);
		L.insert(subscript, value);
		System.out.print("修改成功");
		L.display();
		System.out.println();
		//查找
		System.out.println("请输入查找的结点：");
		subscript = sc.nextInt();
		System.out.println("结点的数据为："+subscript+"的位置为："+ L.get(subscript));
		//删除
		System.out.println("请输入删除的结点的位置：");
		subscript = sc.nextInt();
		L.remove(subscript);
		System.out.println("删除成功！");
		L.display();
		System.out.println();
		System.out.println("链表的长度："+L.length());	}
}
