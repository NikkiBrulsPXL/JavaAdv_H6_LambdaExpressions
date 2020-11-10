package be.pxl.ja.oefening4;

public class NumberSelector {
	private final NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		NumberFilter filter = new NumberFilter(){
			@Override
			public boolean check(int number){
				return number % 2 == 0;
			}
		};
		return numberMachine.processNumbers(filter);
	}

	public String printHexNumbers() {
		return numberMachine.convertNumbers();
	}

	public String showNumbersAbove(int number) {
		return numberMachine.processNumbers(n -> n > number);
	}
}
