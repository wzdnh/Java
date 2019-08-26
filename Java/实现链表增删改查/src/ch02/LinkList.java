package ch02;
import java.util.Scanner;
public class LinkList {


	//public  class LinkList implements IList{
	public Node head;//单链表的头指针
	//构造函数初始化头结点
	public LinkList(){
		head=new Node();
	}
	//构造函数构造长度为n的单链表
	public LinkList(int n,boolean Order) throws Exception{
		this();
		if(Order)
			create1(n); //头插法顺序建立单链表
		else
			create2(n); //尾插法逆序建立单链表
	}
	//头插法顺序建立单链表
	public void create1(int n) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入结点的数据（头插法）：");
		for(int i=0;i<n;i++){
			insert(0,sc.next());
		}
	}
	//尾插法逆序建立单链表
	public void create2(int n) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入结点的数据（尾插法）：");
		for(int i=0;i<n;i++){
			insert(length(),sc.next());
		}
	}
	//将链表置空
	public void clear(){
		head.data=null;
		head.next=null;
	}
	//判断链表是否为空
	public boolean isEmpty(){
		return head.next==null;
	}
	//返回链表长度
	public int length(){
		Node p=head.next;
		int length=0;
		while(p!=null){
			p=p.next;
			length++;//返回P不空长度length加1
		}
		return length;
	}
	//读取并返回第i个位置的数据元素
	public Object get(int i) throws Exception {
		Node p=head.next;
		int j;
		//从首结点开始向后查找，直到p指向第i个结点或者p为null
		for(j=0;j<i&&p!=null;j++){
			p=p.next;
		}
		if(j>i||p==null)//i不合法时抛出异常
			throw new Exception("第"+i+"个数据元素不存在");
		return p.data;
	}
	//插入x作为第i个元素
	public void insert(int i, Object x) throws Exception{
		Node p=head;
		int j=-1;
		//寻找第i个结点的前驱i-1
		while(p!=null&&j<i-1){
			p=p.next;
			j++;
		}
		if(j>i-1||p==null)//i不合法时抛出异常
			throw new Exception("插入位置不合法");
		Node s=new Node(x);
		s.next=p.next;
		p.next=s;
	}
	//删除第i个元素
	public void remove(int i) throws Exception{
		Node p=head;
		int j=-1;
		while(p!=null&&j<i-1){//寻找第i-1个节点
			p=p.next;
			j++;
		}
		if(j>i-1||p.next==null)
			throw new Exception("删除位置不合法");
		p.next=p.next.next;
	}
	//返回元素x首次出现的位序号
	public int indexOf(Object x) {
		Node p=head.next;
		int j=0;
		while(p!=null&&!p.data.equals(x)){
			p=p.next;
			j++;
		}
		if(p!=null)
			return j;
		else
			return -1;
	}
	public void display(){
		Node p=head.next;
		while(p!=null){
			if(p.next==null)
				System.out.print(p.data);
			else
				System.out.print(p.data+"→");
			p=p.next;
		}
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}