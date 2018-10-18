package functions;

import java.util.function.Function;

public class Square implements Function<Integer, Integer> {

	public Integer apply(Integer number) {
		return number * number;
	}
}
