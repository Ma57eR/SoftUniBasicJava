package Fundamentals.Objects.VehicleCatalogue;

    public class Catalogue {
        private String type;
        private String model;
        private String color;
        private Double horsepower;

        public Catalogue(String type, String model, String color, Double horsepower){
            this.type=type;
            this.model=model;
            this.color=color;
            this.horsepower=horsepower;
        }
        public String getType(){
            return this.type;
        }
        public String getModel(){
            return  this.model;
        }
        public String getColor(){
            return this.color;
        }
        public Double getHorsepower(){
            return this.horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n",(this.type.substring(0,1).toUpperCase()+this.type.substring(1)),
                    this.model,this.color,this.horsepower);
    }
}
