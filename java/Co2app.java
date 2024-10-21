
public class Co2app {

	public static void main(String[] args) {

		Co2emission co2emission1 = new Co2emission();
		co2emission1.setLand("Deutschland");
		co2emission1.setFlagge("🇩");
		co2emission1.setEmission2020("600");
		co2emission1.setEmission2021("700");
		co2emission1.setEmission2022("800");
		co2emission1.setEmission2023("900");
		
		System.out.println(co2emission1.getLand());
		System.out.println(co2emission1.getFlagge());
		System.out.println(co2emission1.getEmission2020());
		System.out.println(co2emission1.getEmission2021());
		System.out.println(co2emission1.getEmission2022());
		System.out.println(co2emission1.getEmission2023());
	}

}
