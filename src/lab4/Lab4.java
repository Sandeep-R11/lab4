/*
 import java.util.Random; 
import java.util.Scanner; 
public class Mergesorts
{
public static void main(String[] args)
{
int a[]= new int[100000];
Scanner in = new Scanner(System.in); 
long start, end;
System.out.println("****** MERGE SORT PROGRAM *********");
System.out.println("Enter the number of elements to be sorted");
int n = in.nextInt();
Random rand= new Random();
 for(int i=0;i<n;i++)
 a[i]=rand.nextInt(10000);
 System.out.println("Array elements to be sorted are : "); 
 for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
 start=System.nanoTime(); 
 mergesort(a,0,n-1);
 end=System.nanoTime();
System.out.println("\nThe sorted elements are : "); 
 for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
System.out.println("\nThe time taken to sort is "+(end-start)+" ns"); 
 double best = n*Math.log(n);
 double avg = best;
 double worst = best;
 System.out.print("\nBest Case = "+Math.round(best)+"\nAverage = "+Math.round(avg)+"\nWorst = 
"+Math.round(worst));
System.out.println("\n******** ********************** *******");
}
static void mergesort(int a[], int low, int high)
{
int mid; 
if(low < high)
{
mid = (low+high)/2; 
mergesort(a, low, mid);
mergesort(a, mid+1, high); 
merge(a, low, mid, high);
}
}
static void merge(int a[], int low, int mid, int high)
{
 int i, j, h, k, b[]= new int[100000];
 h=low;
 i=low;
 j=mid+1; 
 while((h<=mid) && (j<=high))
 {
 if(a[h] < a[j])
 {
 b[i] = a[h]; 
 h=h+1;
 }
 else
 {
 b[i]=a[j];
 j=j+1;
 }
 i = i+1;
 }
 
 if(h > mid)
 {
 for(k=j; k<=high; k++)
 {
 b[i] = a[k];
 i = i+1;
 }
 }
 else
 {
 for(k=h; k<=mid; k++)
 {
 b[i] = a[k];
 i = i+1;
 }
 }
 for(k=low; k<= high; k++) 
 a[k] = b[k];
 
}

 */







/*

import java.util.*;
public class Mergesort
{
 public static void mergeSort3Way(Integer[] gArray)
 {
 // if array of size is zero returns null
 if (gArray == null) return;
 // creating duplicate of given array
 Integer[] fArray = new Integer[gArray.length];
 // copying elements of given array into duplicate array
 for (int i = 0; i < fArray.length; i++)
 fArray[i] = gArray[i];
 // sort function
 mergeSort3WayRec(fArray, 0, gArray.length, gArray);
 // copy back elements of duplicate array to given array
 for (int i = 0; i < fArray.length; i++)
 gArray[i] = fArray[i];
 }
 public static void mergeSort3WayRec(Integer[] gArray,int low, int high, Integer[] destArray)
 {
 // If array size is 1 then do nothing
 if (high - low < 2)
 return;
 // Splitting array into 3 parts
 int mid1 = low + ((high - low) / 3);
 int mid2 = low + 2 * ((high - low) / 3) + 1;
 // Sorting 3 arrays recursively
 mergeSort3WayRec(destArray, low, mid1, gArray);
 mergeSort3WayRec(destArray, mid1, mid2, gArray);
 mergeSort3WayRec(destArray, mid2, high, gArray);
 // Merging the sorted arrays
 merge(destArray, low, mid1, mid2, high, gArray);
 }
 public static void merge(Integer[] gArray, int low, int mid1, int mid2, int high,Integer[] destArray)
 {
 int i = low, j = mid1, k = mid2, l = low;
 while ((i < mid1) && (j < mid2) && (k < high)) // choose smaller of the smallest in the three ranges
 {
 if (gArray[i].compareTo(gArray[j]) < 0)
 {
 if (gArray[i].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[k++];
 }
 else
 {
 if (gArray[j].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[j++];
 else
 destArray[l++] = gArray[k++];
 }
 }
while ((i < mid1) && (j < mid2)) // case where first and second ranges have remaining values
 {
 if (gArray[i].compareTo(gArray[j]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[j++];
 }
while ((j < mid2) && (k < high)) // case where second and third ranges have remaining values
 {
 if (gArray[j].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[j++];
 else
 destArray[l++] = gArray[k++];
 }
while ((i < mid1) && (k < high)) // case where first and third ranges have remaining values
 {
 if (gArray[i].compareTo(gArray[k]) < 0)
 destArray[l++] = gArray[i++];
 else
 destArray[l++] = gArray[k++];
 }
 while (i < mid1) // copy remaining values from the first range
 destArray[l++] = gArray[i++];
 while (j < mid2) // copy remaining values from the second range
 destArray[l++] = gArray[j++];
 while (k < high) // copy remaining values from the third range
 destArray[l++] = gArray[k++];
 }
 public static void main(String args[])
 {
 Integer[] data = new Integer[] {45, -2, -45, 78,30, -42, 10, 19, 73, 93};
 mergeSort3Way(data);
 System.out.println("After 3 way merge sort: ");
 for (int i = 0; i < data.length; i++)
 System.out.print(data[i] + " ");
 }
}

*/
