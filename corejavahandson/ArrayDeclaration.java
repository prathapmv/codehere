package corejavahandson;

import java.util.HashMap;
import java.util.Map;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			// System.out.print(a[i]);
			// System.out.print("\t");
		}
		System.out.println();
		String aa = "100";
		String bb = "100";
		if (aa.hashCode() == bb.hashCode())
			System.out.println(aa.hashCode() + " -- " + bb.hashCode());

		String startTimeFormat = "PM", endTimeFormat = "AM";
		boolean inputValidation = true;
		if (("PM").equalsIgnoreCase(startTimeFormat) && ("AM").equalsIgnoreCase(endTimeFormat)) {
			// System.out.println("second if loop");
			inputValidation = false;
		}

		Map<String, Integer> meetingRooms = new HashMap<String, Integer>();
		meetingRooms.put("C-Cave", 3);
		meetingRooms.put("D-Tower", 7);
		meetingRooms.put("G-Mansion", 20);
		System.out.println("Meeting Rooms: " + meetingRooms);
	}
}
