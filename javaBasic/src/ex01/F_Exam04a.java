package ex01;

abstract class Car {
	String vin; // 차량번호
	String color; // 색상
	Boolean isStart; // 시동상태 
	
	Car(String vin, String color, Boolean isStart) {	
		
	}
}

abstract class Train {
	String trainNumber; // 열차번호
	String departureStation; // 출발역
	String arrivalStation; // 도착역
	Boolean isStart; // 시동상태
	
	
	Train(String trainNumber, String departureStation, String arrivalStation, Boolean isStart) {	
		
	}
}

class ManualCar extends Car implements Vehicle {
	
	ManualCar(String vin, String color, Boolean isStart, int gear) {
		super(vin, color, isStart);
	}
	
	int gear; //기어상태
	
	static void setGear(int gear) {
		
	}

	@Override
	public void accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
		
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		
	}
} 

class AutomaticCar extends Car implements Vehicle {
	
	AutomaticCar(String vin, String color, Boolean isStart) {
		super(vin, color, isStart);
	}
	
	@Override
	public void accelerate() {
		System.out.println("자동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("자동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		setStart() = !setStar;
	}
} 

class PassengerTrain extends Train implements Vehicle {
	
	PassengerTrain(String trainNumber, String departureStation, String arrivalStation, Boolean isStart, int passengerCount) {
		super(trainNumber, departureStation, arrivalStation, isStart);

	}
	int passengerCount; // 탑승객 수

	@Override
	public void accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStart() {
		setStart() = !setStar;
	}
}
	


class FreightTrain extends Train implements Vehicle {
	
	FreightTrain(String trainNumber, String departureStation, String arrivalStation, Boolean isStart, double cargoWeight) {
		super(trainNumber, departureStation, arrivalStation, isStart);
	}
	
	double cargoWeight; // 화물 무게

	@Override
	public void accelerate() {
		System.out.println("화물 열차가 느리게 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 느리게 정차합니다!");
	}

	@Override
	public void setStart() {
		 setStart() = !setStar;
	}
}
	


interface Vehicle {
	void accelerate();
	void stop();
	void setStart();
}



public class F_Exam04 {

	public static void main(String[] args) {
		
		Vehicle manualCar = new ManualCar("10가1234", "blue", false, 0);
		Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);
		Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
		
	}
}
