package be.pxl.ja.oefening4;

import be.pxl.ja.demo6.Service;

import java.util.ArrayList;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}

	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}

	public String convertNumbers(){
		StringBuilder result = new StringBuilder();
		Service<String, Integer> convert = Integer::toHexString;
		numbers.forEach((number) -> {
			if(result.length() > 0) {
				result.append("-");
			}
			result.append(convert.execute(number));
		});
		return result.toString();
	}

}
