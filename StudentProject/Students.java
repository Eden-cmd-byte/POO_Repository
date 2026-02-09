/*
* 2026 ITESS TICS 201
* Periodo: Enero-Junio
* Asignatura: Programacion Orientada a Objetos
* Docente: Francisco Javier Montecillo Puente
* Tema 1: Entorno de trabajo
* 1.2: desarrollo de software
* Programador Eden
* 6/02/2026
*/
public class Students {
    private String controlNumber;
    private String name; 
    private String career;
    private String gender;

        // Constructor
        public Students(String controlNumber, String name, String career, String gender) {
            this.controlNumber = controlNumber;
            this.name = name;
            this.career = career;
            this.gender = gender;
        }

        // Getters
        public String getControlNumber() {
            return controlNumber;
        }

        public String getName() {
            return name;
        }

        public String getCareer() {
            return career;
        }

        public String getGender() {
            return gender;
        }

        // Setters
        public void setControlNumber(String controlNumber) {
            this.controlNumber = controlNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCareer(String career) {
            this.career = career;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        // toString method
        @Override
        public String toString() {
            return "Students{" +
                    "controlNumber='" + controlNumber + '\'' +
                    ", name='" + name + '\'' +
                    ", career='" + career + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
}
