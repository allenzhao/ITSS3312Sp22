package demo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class NameFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> attendeeList = new ArrayList<String>(); // List of attendees, must be in alphabetical order
        // Example: Alice, Bob, Chuck, David, Eve, Frank
        String attendeeName;                                       // Name of attendee to match
        int matchPos;
        int numAttendee;
        System.out.println("Please input num of attendees:");
        numAttendee = sc.nextInt();
        for (int i = 1; i <= numAttendee; ++i) {
            System.out.println("attendee " + i + ": ");
            attendeeList.add(sc.next());
        }
        System.out.print("\nBefore sort: ");
        System.out.println(attendeeList);
        Collections.sort(attendeeList); // make sure the arraylist is sorted
        System.out.print("\nAfter sort: ");
        System.out.println(attendeeList);
        System.out.print("\nEnter attendee's name: ");
        attendeeName = sc.next();
        //lowVal, highVal
        matchPos = findMatch(attendeeList, attendeeName, 0, attendeeList.size() - 1);
        if (matchPos >= 0) {
            System.out.println("Found at position " + matchPos + ".");
        } else {
            System.out.println("Not found.");
        }
    }

    public static int findMatch(ArrayList<String> stringList, String itemMatch, int lowVal, int highVal) {
        // TODO: your implementation here.
    	int mid = (lowVal + highVal) / 2;
    	int range = highVal - lowVal + 1;
    	if (stringList.get(mid).equals(itemMatch)) {
    		return mid;
    	} else if (range == 1) {
    		return -1;
    	} else {
    		int result = stringList.get(mid).compareTo(itemMatch);
    		if (result > 0) {
    			// Note: mid > itemMatch meaning that we should be looking in the lower half.
    			return findMatch(stringList, itemMatch, lowVal, mid);
    		} else {
    			return findMatch(stringList, itemMatch, mid + 1, highVal);
    		}
    	}
    }
}
