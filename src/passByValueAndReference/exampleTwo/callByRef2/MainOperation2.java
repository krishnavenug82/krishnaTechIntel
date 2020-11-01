package passByValueAndReference.exampleTwo.callByRef2;

public class MainOperation2 {

	 public static void main(String args[]){  
		   Operation2 op=new Operation2();  
		  
		   System.out.println("before change "+op.data);    // 1) Value from instance object variable op.
		   op.change(op);//passing object  
		   System.out.println("after change "+op.data + " && " + op.yy);  // 2) Value from instance object variable op with different value.
		   
		 /* Operation21 operation21 =  new Operation21();
		   operation21.consumer(op);*/
		   
		   Operation22 operation22 =  new Operation22(op);
		   System.out.println("op.data = " + op.data + " && " + "op.yy = "+ op.yy);
		   
		   System.out.println("op.data " + op.data);  // 3) Value from instance object variable op with different value  .
} 
 
}