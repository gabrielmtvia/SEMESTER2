package trafficlight;
    
    public class Car implements RoadUsers {

        private int id;
		private String previousLight;
		
        public Car(int id) {
            this.id = id;
        }

        public void ReactToLight(String currentLight) {

            if("GREEN".equals(currentLight)) {
                System.out.println("Car " + id + " drives");
            } else if("YELLOW".equals(currentLight)) {
                if("RED".equals(previousLight)) {
                    System.out.println("Car " + id + " turns engine on");
                } else {
                    System.out.println("Car " + id + " slows down");
                }
            } else if("RED".equals(currentLight)) {
                System.out.println("Car " + id + " stops");
            }
			previousLight = currentLight;
        }


		}

