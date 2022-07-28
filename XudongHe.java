public class XudongHe{
	public static void main(String[] args){
		Fan myfan = new Fan();
		myfan.status();
		myfan.pullCordOne(); //speed 1
		myfan.pullCordOne(); //speed 2
		myfan.pullCordOne(); //speed 3
		myfan.pullCordOne(); //speed 0

		myfan.pullCordTwo(); //reverse
		myfan.pullCordTwo(); //normal
	}
}

//class of the ceiling fan
class Fan{
	//variables 
	private int speed;
	private boolean reverse;
	public Fan(){
		this.speed = 0;
		this.reverse = false;
	}
	//pull cord 1
	public void pullCordOne(){
		this.speed += 1; //add the speed of the fan
		this.speed %= 4; //when speed is (3 + 1), the result of (3+1) % 4 is 0 as the requirement.
		status();
	} 
	//pull cord 2
	public void pullCordTwo(){
		this.reverse = (!reverse);
		status();
	}

	//statu of the fan
	public void status(){
		String mode = reverse?"Reverse Mode":"Normal Mode";
		System.out.println("The mode is: "+mode);
		System.out.println("The speed is : "+this.speed);
		System.out.println();
	}
}
