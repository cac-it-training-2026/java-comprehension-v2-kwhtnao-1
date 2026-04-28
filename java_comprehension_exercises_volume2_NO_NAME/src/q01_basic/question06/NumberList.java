package q01_basic.question06;

import java.util.ArrayList;
import java.util.List;

class NumberList {

	private List<Integr> numbers = new ArrayList<>();

	public List

	<Integer> getNumbers() {
		return numbers;
	}

	public Integer calcSumOfList() {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

	public void doubleListEachValue() {

	}

}
