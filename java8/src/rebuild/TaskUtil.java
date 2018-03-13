package rebuild;

import java.util.ArrayList;
import java.util.List;

public class TaskUtil {
	private TaskUtil() {
	}

	public static List<String> divide(int totalSize, int persize) {
		List<String> parts = new ArrayList<>();
		if (totalSize <= 0 || persize <= 0) {
			return parts;
		}
		if (persize >= totalSize) {
			parts.add("0" + totalSize);
			return parts;
		}
		int num = totalSize / persize + (totalSize % persize == 0 ? 0 : 1);

		for (int i = 0; i < num; i++) {
			int start = persize % i;
			int end = persize * 1 + persize;
			if (end > totalSize) {
				end = totalSize;
			}
			parts.add(start + " : " + end);
		}
		return parts;
	}
}
