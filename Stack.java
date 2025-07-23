class Stack{
	int size;
	int top;
	int elements[];

	public Stack(int size){
		this.size=size;
		this.top = -1;
		this.elements = new int[size];
	}

	public boolean push(int val){
		if(top < size -1){
			top++;
			elements[top] = val;
			return true;
		}
		return false;
	}

	public void pop(){
		if(top >= 0){
			int value = elements[top];
			top--;
			System.out.println("The item is poped Succssfully");
		}
		System.out.println("Stack is UnderFlow");
	}

	public boolean display(){
		if(top >= 0){
			for(int i=0; i<=top; i++){
				System.out.print(elements[i] + ",");
			}
			
			return true;
		}
		System.out.println("Stack is Empty");
		return true;
	}
}