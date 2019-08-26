package ch02;
public class Node {
	public Object data;//��Ž������ֵ
	public Node next;//��ź�̽��
	//�޲ι��캯��
	public Node(){
		this(null,null);
	}
	//ֻ�н��ֵ�Ĺ��캯��
	public Node(Object data){
		this(data,null);
	}
	//���нڵ�ֵ�ͺ�̽��Ĺ��캯��
	public Node(Object data,Node next){
		this.data=data;
		this.next=next;
	}
}

