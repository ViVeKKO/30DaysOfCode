
import java.util.*; 

class Job{ 
char id; 
int deadline, profit; 

public Job(){ } 

public Job(char id, int deadline, int profit) 
{ 
	this.id = id; 
	this.deadline = deadline; 
	this.profit = profit; 
} 
void printJobScheduling(ArrayList<Job> arr, int t) 
{ 
	
	int n = arr.size(); 
	for(int i = 0; i < n; i++) 
	{ 
	for(int j = 0; j < n - 1 - i; j++) 
	{ 
		if (arr.get(j).profit < arr.get(j + 1).profit) 
		{ 
			Job temp = arr.get(j); 
			arr.set(j, arr.get(j + 1)); 
			arr.set(j + 1, temp); 
		} 
	} 
	} 
	boolean result[] = new boolean[t]; 
	char job[] = new char[t]; 
	for(int i = 0; i < n; i++) 
	{ 
	for(int j = Math.min(t - 1, arr.get(i).deadline - 1); 
			j >= 0; j--) 
	{ 
			
		// Free slot found 
		if (result[j] == false) 
		{ 
			result[j] = true; 
			job[j] = arr.get(i).id; 
			break; 
		} 
	} 
	} 
	
	
	for(char jb: job) 
	{ 
	System.out.print(jb + " "); 
	} 
	System.out.println(); 
} 

public static void main(String args[]) 
{ 
	ArrayList<Job> arr = new ArrayList<Job>(); 
	
	arr.add(new Job('a', 2, 100)); 
	arr.add(new Job('b', 1, 19)); 
	arr.add(new Job('c', 2, 27)); 
	arr.add(new Job('d', 1, 25)); 
	arr.add(new Job('e', 3, 15)); 
	
	System.out.println("Following is maximum " + "profit sequence of jobs"); 
						
	Job job = new Job(); 
	job.printJobScheduling(arr, 3); 
} 
} 
